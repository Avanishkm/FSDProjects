package contestQuestions.C6Nov22;

public class SillyNumber {

    static int SillyNumber(int N){
        int ans = 0;
        int squareResult = 0;
        int counter = 1;

        while(squareResult <= N){
            ans = squareResult;
            squareResult += counter * counter;
            counter++;
        }
        int diff1 = squareResult - N;
        int diff2 = N - ans;

        if(diff1 < diff2){
            return squareResult;
        }else{
            return ans;
        }

    }
}
