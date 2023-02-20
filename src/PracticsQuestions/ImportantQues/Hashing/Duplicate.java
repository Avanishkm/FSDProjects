package PracticsQuestions.ImportantQues.Hashing;

import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int target = 10;
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
//        System.out.println(findPair(arr,target));
//        System.out.println(findPairOfXOR(arr,target));
        System.out.println(findPairxor(arr,target));
    }
    public static int findPair(int[] arr, int target){
        HashSet set = new HashSet();
        int count  = 0;
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(target - arr[i])){
                count++;
            }else{
                set.add(arr[i]);
            }
        }
        return count;
    }

    public static int findPairOfXOR(int[] arr, int target){
        HashSet set = new HashSet();
        int count  = 0;
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(target ^ arr[i])){
                count++;
            }else{
                set.add(arr[i]);
            }
        }
        return count;
    }
    public static int findPairxor(int[] arr, int target){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                if((arr[i] ^ arr[j]) == target){
                    count++;
                }
            }
        }
        return count;
    }
}
