package contestQuestions.C20Nov22;

import java.util.Scanner;

public class Divide {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();

        if(N%M == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
