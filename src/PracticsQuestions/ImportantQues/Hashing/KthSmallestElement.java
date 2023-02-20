package PracticsQuestions.ImportantQues.Hashing;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {5,8,12,7,6,2,4,10,21,33};
        int k = 4;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i == k-1){
                System.out.println(arr[i]);
            }

        }
    }




}
