package contestQuestions.C4DEC22;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeLists {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int len1 = sc.nextInt();
        int len2 = sc.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        for(int i=0; i<len1; i++){
            arr1.add(sc.nextInt());

        }
        for(int i=0; i<len2; i++){
            arr2.add(sc.nextInt());
        }
        int ind = sc.nextInt();

        ArrayList<Integer> ans = mergeList(arr1,arr2, ind);
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }

    }
    public static ArrayList<Integer> mergeList(ArrayList<Integer> arr1, ArrayList<Integer>arr2, int index){
        ArrayList<Integer> ansList = new ArrayList<>();

        // add every element Before index from arr1...
        for(int i=0; i<index; i++){
            ansList.add(arr1.get(i));
        }
        // add the element from arr2 at index value...
        for(int i=0; i<arr2.size(); i++){
            ansList.add(arr2.get(i));
        }
        //add every element After index from arr1...
        for(int i=index; i<arr1.size(); i++){
            ansList.add(arr1.get(i));

        }
        return ansList;

    }
}
