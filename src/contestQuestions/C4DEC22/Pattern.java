package contestQuestions.C4DEC22;

public class Pattern {
    static void Pattern(int N){
        // print starting
        System.out.print("*");
        System.out.println();
        // middle part...
        for(int i=1; i<N-1; i++){
            System.out.print("*");
            for(int j=0; j<i; j++){
                System.out.print("^");
            }
            System.out.print("*");
            System.out.println();
        }
        // for last..
        for(int i=0; i<=N; i++) {
            System.out.print("*");
        }
    }
}
