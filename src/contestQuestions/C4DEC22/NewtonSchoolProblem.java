package contestQuestions.C4DEC22;

import java.util.Scanner;

public class NewtonSchoolProblem {
    public static  void main (String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            if(i%15==0){
                System.out.print("NewtonSchool ");

            }else if(i%5==0){
                System.out.print("School ");

            }else if(i%3==0){
                System.out.print("Newton ");

            }else{
                System.out.print(i+" ");
            }
        }
    }
}
