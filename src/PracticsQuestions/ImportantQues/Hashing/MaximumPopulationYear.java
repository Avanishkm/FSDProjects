package PracticsQuestions.ImportantQues.Hashing;

import java.util.Scanner;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] birth = new int[n];
        for (int i = 0; i < n; i++) {
            birth[i] = sc.nextInt();
        }
        int[] death = new int[n];
        for (int i = 0; i < n; i++) {
            death[i] = sc.nextInt();
        }
        int[] population = new int[201];
        for (int i = 0; i < n; i++) {
            population[birth[i] - 1900]++;// 1
            population[death[i] - 1900]--;// -1


        }
        int max = population[0], maxYear = 1900;
        for (int i = 1; i < 201; i++) {
            population[i] += population[i-1];
            if(population[i] > 0 && max < population[i]){
                max = population[i];
                maxYear = i+1900;
            }

        }
        System.out.println(maxYear);

    }
//    public static int populationYear(int[] birth, int[] death, int n){
//        int birthYear = 1;
//        int result = 1;
//
//        for (int i = 0; i < n; i++) {
//            birthYear = 1;
//            for (int j = 0; j < n; j++) {
//                if(i!=j){
//                    if(birth[i] >= birth[j] && death[j] >= birth[i]){
//                        birthYear++;
//                    }
//                }
//            }
//            result = Math.max(result, birthYear);
//
//        }
//        return result;
//    }

}
