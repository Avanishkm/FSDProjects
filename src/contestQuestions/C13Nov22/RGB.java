package contestQuestions.C13Nov22;

import java.util.Scanner;

public class RGB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long ans = 0;
        for(int R = 1; R<=N; R++){
            for(int G = 1; G<=N; G++){
                if(R*G>=N){
                    break;
                }
                ans += (N-(R*G));
            }
        }

        System.out.print(ans);

    }
}
