package contestQuestions.C20Nov22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IsThisRepeated {
    public static void main(String[] args) throws Exception {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] == arr[i]) {
                cnt++;
                if (cnt == 2) {
                    break;
                }
            } else
                cnt = 0;
        }
        System.out.print((cnt == 2) ? "Yes" : "No");
    }
}
