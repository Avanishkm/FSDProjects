package PracticsQuestions.ImportantQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestUniqueCharactersSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        System.out.println(solution(str));
//        System.out.println(lengthOfSubString(str));
        System.out.println(longestSubString(str));
    }

    public static int solution(String str){
        int ans = 0;
        int i = -1;
        int j = -1;
        HashMap<Character, Integer> map = new HashMap<>();
        while(true){
            boolean f1 = false;
            boolean f2 = false;
            //acquire
            while (i<str.length()-1){
                f1 = true;
                i++;
                char ch = str.charAt(i);
                map.put(ch, map.getOrDefault(ch,0)+1);
                if(map.get(ch) == 2){
                    break;
                }else{
                    int len = i-j;
                    if(len > ans){
                        ans = len;
                    }
                }
            }
            //release
            while(j<i){
                f2 = true;
                j++;
                char ch = str.charAt(j);
                map.put(ch,map.get(ch) -1);
                if(map.get(ch) == 1){
                    break;
                }
            }
            if(f1 == false && f2 == false){
                break;
            }
        }
        return ans;
    }
//    brute force

    public static int lengthOfSubString(String str){
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            StringBuilder currentSubString = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                if(currentSubString.indexOf(String.valueOf(str.charAt(j))) != -1){
                    break;
                }
                currentSubString.append(str.charAt(j));
                maxLength = Math.max(maxLength, currentSubString.length());

            }

        }
        return maxLength;
    }

    public static int longestSubString(String str){
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0, left = 0; right < str.length(); right++) {
            char currentCh = str.charAt(right);
            if(map.containsKey(currentCh) && map.get(currentCh)>= left){
                left = map.get(currentCh) + 1;
            }
            maxLength = Math.max(maxLength, right-left+1);
            map.put(currentCh, right);

        }
        return maxLength;
    }

    public static int longestSubString2(String str){
        int maxLength = 0;

        for (int right = 0, left = 0; right < str.length(); right++) {
            int indexOfFirst = str.indexOf(str.charAt(right), left);
            if(indexOfFirst != right){
                left = indexOfFirst + 1;
            }
            maxLength = Math.max(maxLength, right-left+1);


        }
        return maxLength;
    }

}
