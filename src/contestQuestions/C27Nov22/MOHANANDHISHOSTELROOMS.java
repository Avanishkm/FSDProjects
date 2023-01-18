package contestQuestions.C27Nov22;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MOHANANDHISHOSTELROOMS {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int rollNo = Integer.parseInt(st.nextToken());
            String gender = st.nextToken();
            if (rollNo % 2 == 0) {
                if (gender.equals("B"))
                    System.out.println("PAPUM " + "L");
                else
                    System.out.println("PAPUM " + "U");
            } else {
                if (gender.equals("B"))
                    System.out.println("LOHIT " + "L");
                else
                    System.out.println("LOHIT " + "U");
            }
        }
    }
}
