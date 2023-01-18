package contestQuestions.C6Nov22;

public class NumberOfDiagonals {

    static int numberOfDiagonal(int N){
        if(N<=3){
            return 0;

        }else{
            return N*(N-3)/2;
        }
    }
}
