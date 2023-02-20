package PracticsQuestions.ImportantQues.LinkedList;

import java.util.Scanner;

public class singleCreation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void creation(){
        int data,n;
        Scanner sc = new Scanner(System.in);
        do {


            System.out.print("Enter data");
            data = sc.nextInt();
            //object create
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                System.out.print("Enter 1 to insert the item at beginning, 2 to insert at end, insert 3 at specific location");
                int m = sc.nextInt();
                switch(m){
                    case 1:
                        newNode.next = head;
                        head = newNode;
                        break;
                    case 2:
                        Node temp = head;
                        while(temp.next != null){
                            temp = temp.next;
                        }
                        temp.next = newNode;
                        break;
                    case 3:
                        System.out.print("enter position of node to be inserted");
                        int p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < p-1; i++) {
                            temp1 = temp1.next;
                        }
                        newNode.next = temp1.next;
                        temp1.next = newNode;
                        break;


                }
//                newNode.next = head;
//                head = newNode;
            }
            System.out.print(" Do you want to more data");
            n = sc.nextInt();
        }
        while(n==1);

    }
    public void traverser(){
        Node temp = head;
        if(head == null){
            System.out.print("LL does not exist");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }

        }

    }

    public static void main(String[] args) {
        singleCreation ll = new singleCreation();
        ll.creation();
        ll.traverser();

    }
}
