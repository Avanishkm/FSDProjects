package PracticsQuestions.ImportantQues;

public class MergeS {
    public static void conquer(int[] arr, int left, int mid, int right){
        int merged[] = new int[right - left + 1];
        int index1 = left;
        int index2 = mid+1;
        int x=0;
        while(index1 <= mid && index2<=right){
            if(arr[index1] <= arr[index2]){
                merged[x++] = arr[index1++];

            }else{
                merged[x++] = arr[index2++];

            }
        }
        while (index1 <= mid){
            merged[x++] = arr[index1++];

        }
        while(index2 <= right){
            merged[x++] = arr[index2++];

        }
        for (int i = 0, j = left; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int left, int right){
        if(left>=right){
            return;
        }
        int mid = left + (right - left)/2;
        divide(arr,left, mid);
        divide(arr, mid+1,right);
        conquer(arr,left,mid,right);
    }
    public static void main(String[] args) {
        int[] arr = null;
        int n = arr.length;
        divide(arr,0,n-1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }

}
