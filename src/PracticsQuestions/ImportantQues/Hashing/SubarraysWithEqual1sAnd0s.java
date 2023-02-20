package PracticsQuestions.ImportantQues.Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraysWithEqual1sAnd0s {
    public static int countSubArray(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, c = 0;
        map.put(0,1);
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1){
                sum+=1;

            }
            else {
                sum-=1;
            }
            if(map.containsKey(sum)){
                c+= map.get(sum);
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }

        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = countSubArray(arr,n);
        System.out.print(ans);
    }
}
