package Liveprojects.Strings;

public class PeakElement {
    public static int peckElement(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end - start)/2;
            if((mid ==0 || arr[mid-1] <=arr[mid]) && (mid == arr.length-1) || arr[mid+1]<=arr[mid]){
                return mid;
            }if(mid-1>=0 && arr[mid-1]>arr[mid]){
//                return peckElement(arr, mid+1);
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 2, 5, 6};
        System.out.println(peckElement(arr));
    }
}

//    An element A[i] of an array A is a peak element if it’s not smaller than its neighbor(s).
//
//        For example,
//
//        Input : [8, 9, 10, 2, 5, 6]
//
//        Output: The peak element is 10 and 6
