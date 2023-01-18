package contestQuestions.C13Nov22;

public class SumOfEquation {

    static int fuc1(int x){
        int a=x-1;
        a=a*a*a;
        int b=x+1;
        b=b*b;
        int sum=a+3*b;
        sum=sum+2;
        return sum;
    }
    static  int equationSum(int N)
    {
        int  sum=0;
        for(int i=1;i<=N;i++){
            sum=sum+fuc1(i);
        }
        return sum;
    }
}
