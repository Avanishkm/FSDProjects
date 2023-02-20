package PracticsQuestions.Pepcoding;

import java.util.Scanner;

public class getModifiedArray {
    public static int[] getModifiedArrays(int length, int[][] queries){
        int[] res = new int[length];
        // provide impact to res
        for (int q = 0; q < queries.length; q++) {
            int st = queries[q][0];
            int end = queries[q][1];
            int inc = queries[q][2];

            res[st] += inc;
            if(end + 1 < length){
                res[end + 1] -= inc;
            }
        }
        int sum = 0;
        // prefix sum
        for (int i = 0; i < length; i++) {
            sum += res[i];
            res[i] = sum;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int nq = sc.nextInt();
        int[][] queries = new int[nq][3];

        for (int q = 0; q < nq; q++) {
            queries[q][0] = sc.nextInt();
            queries[q][1] = sc.nextInt();
            queries[q][2] = sc.nextInt();
        }
        int[] res = getModifiedArrays(length,queries);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + " ");

        }
    }
}
