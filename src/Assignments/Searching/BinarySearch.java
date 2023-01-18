package Assignments.Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,5,5,6};
        int arr1[] = {-1,-1};
        if(arr.length == 0){
            System.out.println(arr1);
        }else{
            int first = firstOcc(arr, 0, arr.length-1, 5);
            int last = lastOcc(arr, 0, arr.length-1,5, arr.length );
            arr1[0]= first;
            arr1[1] = last;
            System.out.println(first+ " " + last);
            // occurance of element
            int totalOcc =  last - first +1;
            System.out.println(totalOcc);
            System.out.println(Arrays.toString(arr1));
        }
    }
    //  first occurance and last occurance
    public static int firstOcc(int arr[], int start, int end, int target){
        int mid = (start + end)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid] == target && (mid ==0 || arr[mid-1] != target)){
            return mid;
        } else if (arr[mid]>target) {
            return firstOcc(arr,start, mid-1,target);
        }else {
            return firstOcc(arr, mid+1, end, target);
        }
    }
    public static int lastOcc(int arr[], int start, int end, int target, int n) {
        int mid = (start + end) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target && (mid == n - 1 || arr[mid + 1] != target)) {
            return mid;
        } else if (arr[mid] > target) {
            return lastOcc(arr, start, mid - 1, target, n);
        } else {
            return lastOcc(arr, mid + 1, end, target, n);
        }
    }
}




// find the occurrence of given element in given sorted array.

// Given a sorted array you need to find first and last occurence (index) of given element
// the function should return the array of length two, if no element exist return the index == -1;
//        int arr[] = {4, 16, 18, 21, 23, 34, 34, 34, 34, 42, 67};
//        // target => 34 firstIndex = 5, lastIndex = 8 [5,8];
//        int first = -1;
//        int last = -1;
//        int target = 34;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == target){
//                return ;
//            }
//            if(first == -1){
//                first = i;
//            } else if (first != -1) {
//                last = i;
//
//            }else {
//                last = first;
//            }
//
//
//        }
//        return new int[first, last];