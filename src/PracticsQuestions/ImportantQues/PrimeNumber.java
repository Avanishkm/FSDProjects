package PracticsQuestions.ImportantQues;

public class PrimeNumber {
    public static boolean checkPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        if(n==2){
            return true;
        }
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 17;
        System.out.println(checkPrime(number));
    }
}
