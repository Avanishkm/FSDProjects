package PracticsQuestions.Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9, 11, 20};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(smallest > arr[i]){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        if(secondSmallest == Integer.MAX_VALUE){
            System.out.println("There is no second smallest");
        }else{
            System.out.println("Second Smallest is : " + secondSmallest);
        }

    }

}
