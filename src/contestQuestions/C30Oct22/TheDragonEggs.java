package contestQuestions.C30Oct22;

import java.util.Scanner;

public class TheDragonEggs {
    public static void main (String[] args) {

        Scanner scn = new Scanner(System.in);
        int goldrate = scn.nextInt();
        int silverrate = scn.nextInt();
        int goldquality = scn.nextInt();
        int silverquality = scn.nextInt();

        int toCostOfGold = goldrate * goldquality;
        int toCostOfSilver = silverrate * silverquality;

        if (toCostOfGold >= toCostOfSilver) {
            System.out.println("Gold");

        } else {
            System.out.println("Silver");
        }
    }


}
