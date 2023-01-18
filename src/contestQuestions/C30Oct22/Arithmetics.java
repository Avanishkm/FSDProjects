package contestQuestions.C30Oct22;

import java.util.Scanner;

public class Arithmetics {

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,M,x;
        N=sc.nextInt();
        M=sc.nextInt();
        int cnt=0;
        for(x=N-M;x<=N+M;x++ ){
            if(M-x <= x-N){
                cnt++;
                break;
            }
        }
        if(cnt>0){
            System.out.println(x);
        }
        else{
            System.out.println(-1);
        }
    }

}
