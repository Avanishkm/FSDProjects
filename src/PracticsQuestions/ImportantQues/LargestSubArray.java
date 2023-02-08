package PracticsQuestions.ImportantQues;

import java.util.HashMap;
import java.util.Scanner;

public class LargestSubArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//         for(int i = 0; i<n; i++){
//             if(arr[i] == 0){
//                 System.out.println(-1);
//             }
//         }
        System.out.println(largestSubArrayWithZeroSum(arr));

    }
    public static int largestSubArrayWithZeroSum(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxlen = Integer.MIN_VALUE;
        int i = -1;
        int sum = 0;
        map.put(sum,i);
        while (i< arr.length-1){
            i++;
            sum += arr[i];
            if(map.containsKey(sum) == false){
                map.put(sum,i);
            }
            else{
                int len = i - map.get(sum);
                if(len > maxlen){
                    maxlen = len;
                }
            }

        }
        return maxlen== Integer.MIN_VALUE ? -1 : maxlen;

    }
}
