package PracticsQuestions.ImportantQues.Stack;

import java.lang.reflect.Array;
import java.util.*;


public class NearestSmallerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        findPrevSmaller(arr,n);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while(!s.isEmpty() && s.peek() >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.print(-1);
            }else{
                System.out.print(s.peek() + " ");
            }
            s.push(arr[i]);

        }

    }
}
//    public static void findPrevSmaller(int[] arr,int n) {
//        // base case
//        if (arr == null || n == 0) {
//            return;
//        }
//
//        // do for each element
//        for (int i = 0; i < n; i++) {
//            // keep track of the previous smaller element for element `arr[i]`
//            int prev = -1;
//
//            // process elements on the left of the element `arr[i]`
//            for (int j = i - 1; j >= 0; j--) {
//                // break the inner loop at the first smaller element on the
//                // left of the element `arr[i]`
//                if (arr[j] < arr[i]) {
//                    prev = arr[j];
//                    break;
//                }
//            }
//
//            System.out.print(prev + " ");
//        }
//    }
//}
//
