package contestQuestions.C13Nov22;

import java.util.Scanner;

public class MaxMinAddition {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        long N=sc.nextLong();
        long K=sc.nextLong();
        for(int i=1;i<=K;i++){
            long a=N;
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            while(a>0){
                int rem=(int)(a%10);
                max=Math.max(max,rem);
                min=Math.min(min,rem);
                a=a/10;
            }
            //when min=0,then N will be unchanged for any further occurences i.
            // if you don't write this break you will TLE
            if(min==0)
                break;
            N=N+max*min;
        }
        System.out.println(N);
    }
}
