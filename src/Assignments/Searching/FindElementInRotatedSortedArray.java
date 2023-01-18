package Assignments.Searching;

import java.util.Scanner;

public class FindElementInRotatedSortedArray {
    public static int getPivotElement(int[] arr, int start, int end, int target, int n){
        int mid = (start + end)/2;
        if(start > end){
            return -1;
        }
        if((mid ==0 || arr[mid]>arr[mid-1] )&& (mid==n-1 || arr[mid]>arr[mid+1])){
            return mid;
        }
        else if(arr[mid] > target){
            return  getPivotElement(arr, start, mid-1,target,n);

        }else{
            return getPivotElement(arr, mid+1,end, target, n);
        }
    }
    public static int search(int[] arr, int start, int end,int target, int n){
        int pivot = getPivotElement(arr, start, end, target, n);
        if(arr[pivot] == target){
            return pivot;
        }
        int llow = 0;
        int lhigh = pivot;
        int rlow = pivot + 1;
        int rhigh = end;
        while(llow <= lhigh){
            int mid = (llow + lhigh)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                lhigh = mid - 1;
            }else{
                llow = mid + 1;
            }

        }
        while(rlow >= rhigh){
            int mid = (rlow + rhigh)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                rhigh = mid - 1;
            }
            else {
                rlow = mid + 1;
            }
        }
        return pivot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(getPivotElement(arr, 0,arr.length, 5, 5));

    }
}

// find the pick element of given array it should be always greater than 1st adjacent element
// i have given array find the count of 1 in given sorted array
// find the smallest missing element in given array (sorted array)
// find floor and ceil of given number
// square root of the given number 16 => squareRoot(16) => 4