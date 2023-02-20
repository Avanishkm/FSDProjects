package PracticsQuestions.LeetCode;

import java.util.Scanner;

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        int res = mostWater(height);
        System.out.println(res);
    }
    public static int mostWater(int[] height){
        int i = 0;
        int j = height.length-1;

        int water = 0;
        while(i<j){
            int w = j-i;
            int h = Math.min(height[i], height[j]);
            water = Math.max(water,h*w);
            if(height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return water;

    }
}
