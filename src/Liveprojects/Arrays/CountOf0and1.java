package Liveprojects.Arrays;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;

public class CountOf0and1 {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 1, 0, 1};
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countOccurrence(arr);
    }
    public static void countOccurrence(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (i != arr.length - 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    } else {
                        break;
                    }

                }
            }
            System.out.print(count+ " ");
            i += count-1;

        }
    }
}
