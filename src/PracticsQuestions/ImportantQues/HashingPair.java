package PracticsQuestions.ImportantQues;

import java.util.Scanner;

public class HashingPair {
    public static int PairSumExists(int arr[], int n, int sum){
        int s = 0;
        int e = n-1;
        while(s<=e) {
            if(arr[s]+arr[e]==sum){
                return 1;
            }
            else if(s+1==e){
                if(arr[s]+arr[e]==sum){
                    return 1;
                }
                else{
                    s=0;
                    e=e-1;
                }
            }
            else{
                s=s+1;
            }
        }
        return 0;


//        HashSet<Integer> hs = new HashSet<>();
//        for (int i: arr) {
//            if(hs.contains(sum-i)){
//                return 1;
//            }
//            else{
//                hs.add(i);
//            }
//        }
//        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(PairSumExists(arr,n,k));
        }
    }
}
