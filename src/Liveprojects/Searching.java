package Liveprojects;

import javax.xml.transform.stax.StAXResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int ans = searchLinear(arr, 88);
//        System.out.println(ans);
        ArrayList<Integer> ans = findElement(arr, target);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+ " ");

        }
    }
    public static int searchLinear(int[] arr, int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static double median(int[] arr){
        Arrays.sort(arr);
        if(arr.length%2 == 0){
            int middle1 = arr.length / 2;
            int middle2 = (arr.length/2) - 1;
            return (arr[middle2] + arr[middle1]) / 2.0;
        }else{
            return arr[arr.length/2];
        }
    }
    public static double Mean(int[] arr){
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum/ arr.length;
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left);
            if(arr[mid] == target){
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;

            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static ArrayList<Integer> findElement(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                list.add(i);
            }
        }
        return list;
    }
}
