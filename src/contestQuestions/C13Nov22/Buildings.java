package contestQuestions.C13Nov22;

import java.util.Scanner;

public class Buildings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int build=sc.nextInt();
        int a[]=new int[build];
        for(int i=0;i<build;i++){
            a[i]=sc.nextInt();
        }
        int count=1;
        int max=a[0];
        for(int i=1;i<build;i++){
            if(max<a[i]){
                count++;
                max=a[i];
            }
        }
        System.out.print(count);
    }
}
