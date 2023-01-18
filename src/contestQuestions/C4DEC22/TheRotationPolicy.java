package contestQuestions.C4DEC22;

public class TheRotationPolicy {
    static int RotationPolicy(int A, int B){
        int count = 0;
        for(int i=A; i<=B; i++){
            if(i%6 == 0 || i%6 == 2){
                count++;

            }

        }
        return count;
    }
}
