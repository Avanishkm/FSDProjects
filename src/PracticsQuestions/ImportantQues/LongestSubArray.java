package PracticsQuestions.ImportantQues;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(lengthOfLSA(arr, n, k));
        }
    }

    public static int lengthOfLSA(int[] arr,int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        int ans = 0;
        // fill the prefix sum
        for (int i = 1; i < n; i++) {
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        for (int i = 0; i < prefixSum.length; i++) {
            int target = prefixSum[i] - k;
            if(map.containsKey(target)){
                ans += map.get(target);
            }
            map.put(prefixSum[i], map.getOrDefault(prefixSum[i],0)+1);

        }
        return ans;

//        int ans = 0;
//        for (int i = 0; i < arr.length-1; i++) {
//            int max = arr[i];
//            int min = arr[i];
//            HashSet<Integer> cd = new HashSet<>();
//            for (int j = i+1; j < arr.length; j++) {
//                if(cd.contains(arr[j])){
//                    break;
//                }
//                cd.add(arr[j]);
//                min = Math.min(min,arr[j]);
//                max = Math.max(max, arr[j]);
//                if(max - min == j - i){
//                    int len = j - i + 1;
//                    if(len>ans){
//                        ans = len;
//                    }
//                }
//            }
//
//        }
//        return ans;
    }
}
