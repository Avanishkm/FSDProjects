package contestQuestions.C13Nov22;

public class KOperations {
    public static long KOperations(long N, long K){
        for(long i=1;i<=K;i++){
            long a=N;
            while (a >= 10){
                a/= 10;
            }
            N=N*a;
            if(a==1)  //tle remove by this logic
                break;
        }
        return N;
    }
}
