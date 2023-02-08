package PracticsQuestions.ImportantQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(countDistinct(str,n));


    }
    public static int countDistinct(String str, int n) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(str.charAt(i))) {
                mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);
            } else {
                mp.put(str.charAt(i), 1);
            }
        }
        int count = 0;
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            count += 1;
        }
        return count;
    }
}
