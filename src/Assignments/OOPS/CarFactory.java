package Assignments.OOPS;

public class CarFactory {
    public static void main(String[] args) {
        CarMap Thar = new CarMap(); // object creation..

        Thar.color = "yellow";
        Thar.airBags = 0;

        System.out.println(Thar.color);
        System.out.println(Thar.airBags);

        System.out.println("---------------------");

        CarMap Bmw = new CarMap();
        Bmw.color = "black";
        System.out.println(Bmw.color);
        System.out.println(Bmw.airBags);

    }
}
