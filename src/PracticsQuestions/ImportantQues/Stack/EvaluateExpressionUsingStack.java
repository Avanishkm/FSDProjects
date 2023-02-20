package PracticsQuestions.ImportantQues.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpressionUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        InputStreamReader fr=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(fr);
//        int n = Integer.parseInt(br.readLine());
//        int[] arr = new int[n];
//        String numberString = br.readLine();  //"1 4 2 4 5" == ["1","4","2","4","5"]
//
//        String[] numberArrayString = numberString.split(" "); //["1","4","2","4","5"]

        // filling the array
//        for(int i=0;i<n;i++) {
//            arr[i] = Integer.parseInt(numberArrayString[i]);
//        }
//        int n = sc.nextInt();
//        int[] arr = new int[n];

        int n = sc.nextInt();
        String str = sc.next();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.next();
//
//        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String exp = br.readLine();
//        String exp = "823*+7/1-";
//        System.out.print("The PostFix Evaluation for the Given Expression "+exp+" is: ");
        evaluatePostfix(str);
    }

    static boolean isOperator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
            return true;

        return false;
    }

    static void evaluatePostfix(String exp) {
        Stack<Integer> postFix = new Stack<>();    // Create postfix stack
        int n = exp.length();

        for (int i = 0; i < n; i++) {
            if (isOperator(exp.charAt(i))) {
                // pop top 2 operands.
                int op1 = postFix.pop();
                int op2 = postFix.pop();

                // evaluate in reverse order i.e. op2 operator op1.
                switch (exp.charAt(i)) {
                    case '+':
                        postFix.push(op2 + op1);
                        break;

                    case '-':
                        postFix.push(op2 - op1);
                        break;

                    case '*':
                        postFix.push(op2 * op1);
                        break;

                    case '/':
                        postFix.push(op2 / op1);
                        break;

                }

            }
            // Current Char is Operand simple push into stack
            else {
                // convert to integer
                int operand = exp.charAt(i) - '0';
                postFix.push(operand);
            }
        }

        // Stack at End will contain result.
        System.out.println(postFix.pop());
    }
}

//    long n = Long.parseLong(br.readLine());
//    int arr[] = new int[(int)n];
//    String inputLine[] = br.readLine().trim().split("\\s+");