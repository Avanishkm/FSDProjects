package PracticsQuestions.ImportantQues.Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class EqualDistinct {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(!flag && set.contains(x)){
                    flag = true;
                }
                set.add(x);
            }
            if(set.size()%2 != 0){
                if (flag){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }else{
                System.out.println("Yes");
            }
        }

    }
}
