package contestQuestions.C6Nov22;

public class SaraAndPattern {
    static void Pattern(int N){
        for(int i=0;i<N;i++){
            for(int j=6*i,k=0;k<N;j=j+4,k++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
