package contestQuestions.C20Nov22;

import java.util.Scanner;

public class NN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1; i<=N; i++){
            int number = N*(N-1);
            if(i % N  == 0){
                System.out.print(number);
            }
        }
    }
}
