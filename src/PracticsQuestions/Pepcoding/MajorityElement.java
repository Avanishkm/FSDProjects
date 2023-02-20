package PracticsQuestions.Pepcoding;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printMajorityElement(arr);
    }
    public static int validCandidates(int[] arr){
        int val = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (val == arr[i]){
                // same element increment freq
                count++;
            }else {
                // distinct element, map it with val
                count--;
            }
            if(count == 0){
                val = arr[i];
                count = 1;
            }
        }
        return val;
    }
    public static void printMajorityElement(int[] arr){
        // value have potential candidate for majority
        int value = validCandidates(arr);
        // find freq for potential candidates

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                count++;
            }
        }
        if(count > arr.length/2){
            // majority element is value
            System.out.println(value);
        }else {
            System.out.println("No Majority element");
        }
    }
}
