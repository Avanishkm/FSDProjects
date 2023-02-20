package PracticsQuestions.ImportantQues.Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextLargerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printNGE(arr, n);
    }

    static void printNGE(int arr[], int n) {
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.print(next + " ");
        }
    }
}
//    public static long[] nextLargerElement(long[] arr, int n){
//        long[] ans = new long[n];
//        Stack<Long> st = new Stack<>();
//        for (int i = n-1; i >=0;  i--) {
//            if(st.isEmpty()){
//                ans[i] = -1l;
//            } else if (arr[i] < st.peek()) {
//                ans[i] = st.peek();
//            }else{
//                while(!st.isEmpty() && arr[i] >= st.peek()){
//                    st.pop();
//                }
//                if(st.isEmpty()){
//                    ans[i] = -1l;
//                }else {
//                    ans[i] = st.peek();
//                }
//            }
//            st.push(arr[i]);
//
//        }
//        return ans;
//    }
//}
