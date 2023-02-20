package PracticsQuestions.Arrays;

import javax.xml.transform.OutputKeys;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class HelpAnjulika {
    public int[] zeroXOR(int l, int r, InputStreamReader in, OutputKeys out){
        if((l&1) == 1){
            if(l+4 <= r){
                return new int[] {l + 1, l + 2, l + 3, l + 4 };
            }else {
                return new int[]{-1};
            }
        }else {
            return new int[]{l, l + 1, l + 2, l + 3};
        }
    }
}
