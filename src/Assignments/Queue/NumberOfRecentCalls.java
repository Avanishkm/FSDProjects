package Assignments.Queue;

import java.util.Scanner;

public class NumberOfRecentCalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j >=0; j--) {
                if(arr[i] - arr[j] <= 3000){
                    count++;
                }else{
                    break;
                }

            }
            System.out.print(count+" ");

        }

    }


}
