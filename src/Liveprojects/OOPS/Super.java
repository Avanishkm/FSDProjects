package Liveprojects.OOPS;

//public class Super {
//
//}
//package vishal2;

class A {

    int number;

    int id;

    A() {

    }

    A(int number , int id){

        this.number = number ;

        this.id = id;

    }

    public void displaydetails() {

// reg

        System.out.println(this.id);

// number

        System.out.println(this.number);

    }

}

class B extends A {

    String name ;

    String lastName;

    B(){

        this(1234);

    }

    B(int id) {

        this( 34567 , "Vishal");

        this.id = id;

    }

    B (int number , String name) {

        this( "SHasr");

        this.number = number ;

        this.name = name;

    }

    B(String name ) {

        this.name = name;

    }

    public void displaydetails() {

        System.out.print(lastName+ " " + name);

        super.displaydetails();

    }

}

//public class SuperExample {
//
//    public static void main(String[] args) {
//
//        B b = new B();
//
//        b.displaydetails();
//
//    }
//
//}

// constructor chaining ??