package contestQuestions.C4DEC22;

import java.util.Scanner;

public class NoXor {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[]A = new long[N];

        for(int i=0; i<N; i++){

            A[i]= sc.nextLong();

        }

        long sum=0;

        for(int i=1; i<=N; i++){

            sum +=(N-i)^A[i-1];

        }

        System.out.println(sum);

    }
}
