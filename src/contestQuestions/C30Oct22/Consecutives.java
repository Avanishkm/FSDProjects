package contestQuestions.C30Oct22;

import java.util.Scanner;

public class Consecutives {

    public static void func1(int a){
        if(a<=1){
            System.out.println("No");
        }
        else{
            int k=2;
            int cnt=0;
            int i=1;
            while(k<=a){
                k=(int)Math.pow(2,i);
                if(k==a){
                    cnt++;
                    break;
                }
                i++;
            }
            if(cnt>0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=0;
            d=sc.nextInt();
            func1(d);
        }
    }
}

