package Liveprojects.Strings;

public class Triplates {
    public static void triplets(int[] nums, int n){
        boolean element = false;
        for(int i=0; i<n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k<n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        System.out.println(nums[i] + " " +nums[j] + " " +nums[k]);
                        element = true;

                    }
                }
            }

        }

        if(element == false){
            System.out.println("not element");
        }

    }
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int n = nums.length;
        triplets(nums,n);
    }

}
