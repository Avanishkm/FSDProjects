package Liveprojects.Strings;

import java.util.Arrays;

public class PairCount {
    // using binary search
    public static int lowerBound(int[] arr,int start,int end, int target){
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] <target){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;

    }
    public static  int upperBound(int[] arr, int start, int end, int target){
        while(start<end){
            int mid = start + (end - start)/2;
            if(arr[mid] <= target){
                start = mid +1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
    public static int pairCount(int[] arr, int n, int k){
        Arrays.sort(arr);
        int count =0;
        for (int i = 0; i < n-1; i++) {
            int a = k-arr[i];
            int b = lowerBound(arr, i+1,n,a);
            int c = upperBound(arr,i+1,n,a);
            count = count + c - b;

        }
        return count;
//        tc = O(nlogn)
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int n = 4;
        int k = 6;
        System.out.println(pairCount(arr,n,k));
    }
    // brute force method
//    public static void pairCount(int[] arr, int k){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i]+ arr[j] == k){
//                    count++;
//                    System.out.println(count);
//                }
//
//
//            }
//
//        }
//    }
//    tc = O(n^2)

}
