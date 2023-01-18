package contestQuestions.C4DEC22;

import java.util.Scanner;

public class CountingZeroesToOnes {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        // int ans = n*n; 9
        int[] doneRows = new int[n];
        int[] doneCols = new int[n];

        long blankRow = n;
        long blankCol = n;

        while(q != 0){
            int i = sc.nextInt();
            int j = sc.nextInt();

            int ithIndex = i-1;
            int jthIndex = j-1;

            if(doneRows[ithIndex] == 0){
                blankRow--;
                doneRows[ithIndex] = 1;

            }
            if(doneCols[jthIndex] == 0){
                blankCol--;
                doneCols[jthIndex] = 1;

            }
            long ans = blankRow * blankCol;
            System.out.print(ans + " ");

            q--;
        }


    }
}
