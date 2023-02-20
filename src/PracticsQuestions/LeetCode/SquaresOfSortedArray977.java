package PracticsQuestions.LeetCode;

import java.util.Scanner;

public class SquaresOfSortedArray977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = sortedSquare(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");

        }

    }
    public static int[] sortedSquare(int[] arr){
        int[] res = new int[arr.length];
        int i =0; // most -ve element
        int j = arr.length-1; // most +ve element
        int index = arr.length-1; // help filling the res
        while(i<=j){
            int val1 = arr[i]*arr[i] ;
            int val2 = arr[j] * arr[j];

            if(val1>val2){
                res[index] = val1;
                i++;
            }else{
                res[index] = val2;
                j--;
            }
            index--;
        }
        return res;
    }
}
