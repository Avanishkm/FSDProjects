package Assignments.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class KthPermutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(getPermutation(n,k));


    }
    public static String getPermutation(int n, int k){
        int fact = 1;
        ArrayList<Integer> number = new ArrayList<>();
        for(int i = 1; i<n; i++){
            fact = fact * i;
            number.add(i);
        }
        number.add(n);
        String ans = "";
        k = k-1;
        while(true){
            ans = ans + number.get(k / fact);
            number.remove(k / fact);
            if(number.size() == 0){
                break;
            }
            k = k % fact;
            fact = fact/ number.size();
        }
        return ans;
    }

}
