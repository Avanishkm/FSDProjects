package PracticsQuestions.ImportantQues.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = CountSubArraysWitGivenSum(arr,k);
            System.out.println(ans);
        }

    }
    public static int CountSubArraysWitGivenSum(int[] arr,int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];

        int ans = 0;

//        fill the prefix sum O(n)....
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        for (int i = 0; i < prefixSum.length; i++) {
            int target = prefixSum[i] - k;
            if(map.containsKey(target)) {
                ans += map.get(target);
            }

            map.put(prefixSum[i], map.getOrDefault(prefixSum[i], 0) + 1);
        }


        return ans;
    }
}
