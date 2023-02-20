package PracticsQuestions.ImportantQues.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(preToInfix(s));

    }
    public static boolean isOperator(char c){
        switch (c){
            case '+':
            case '-':
            case '*':
            case '^':
            case '/':
            case '%':
                return true;
        }
        return false;
    }
    public static String preToInfix(String preExp){
        Stack<String> stack = new Stack<>();
        int L = preExp.length();
        for (int i = L-1; i >= 0 ; i--) {
            char c = preExp.charAt(i);
            if(isOperator(c)){
                String op1= stack.pop();
                String op2 = stack.pop();
                String result = '(' + op1 + c + op2 + ')';
                stack.push(result);
            }else{
                stack.push(c+"");
            }
        }
        return stack.pop();
    }
}
