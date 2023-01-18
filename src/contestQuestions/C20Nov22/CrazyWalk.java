package contestQuestions.C20Nov22;

import java.util.Scanner;

public class CrazyWalk {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int M=sc.nextInt();
        int N=sc.nextInt();
        // System.out.println(M%2!=0?"YES":"NO");
        if(M==1 || N==1){
            System.out.println("YES");
        }
        else if(M%2!=0 ||N%2!=0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
