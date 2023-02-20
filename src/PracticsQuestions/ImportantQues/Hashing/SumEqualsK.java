package PracticsQuestions.ImportantQues.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class SumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }

            System.out.println(lenOfLongSubArr(arr,n,k));
        }


    }
    //    tc = O(n^2)
//    public static int lenOfLongSubarr (int arr[],int n, int k){
//        int count = 0;
////        int[] sum = new int[arr.length+1];
////        sum[0] = 0;
//        for(int i = 0; i<n; i++){
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                if(sum == k){
//                    count = Math.max(count, j-i+1);
//                }
//            }
//        }
//
//        return count;
//    }
    public static int lenOfLongSubArr(int[] arr, int n, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if(sum == k){
                maxLen = i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                if(maxLen < (i - map.get(sum-k))){
                    maxLen = i- map.get(sum-k);
                }
            }
        }
        return  maxLen;
    }

}
