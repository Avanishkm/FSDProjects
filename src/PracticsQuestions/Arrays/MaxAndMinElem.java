package PracticsQuestions.Arrays;

import java.util.Scanner;

public class MaxAndMinElem {
    /*
      find max element
     */
//    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
//        int[] arr = {4,2,3,5,8,6};
//        int max = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]>max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
    /*
    find min element
     */
    public static void main(String[] args){
        int[] arr = {4,2,3,5,8,6};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println(min);
    }

}
