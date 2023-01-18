package PracticsQuestions.Arrays;

public class SecondLargest {
//    public static void main(String[] args) {
//        int[] arr = {3, 4, 1, 5, 6, 7};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if(arr[i] < arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//
//                }
//            }
//            if(i==1){
//                break;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println("second largest element is: "+arr[1]);
//    }


    /*
       Second Method
     */

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9, 11, 20};
       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }

        }
        if(secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest element");
        }else{
            System.out.println("Second largest value is: "+secondLargest);
        }
    }
}
