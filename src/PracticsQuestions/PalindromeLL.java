package PracticsQuestions;

import java.util.Stack;

public class PalindromeLL {
    public void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(4);
        one.ptr =  two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;

        boolean value = isPalindrome(one);
        System.out.println(value);
    }
    class Node{
        int data;
        Node ptr;
        Node(int d){
            ptr = null;
            data = d;
        }
    }
    static boolean isPalindrome(Node head){
        Node slowPointer = head;
        boolean isPalindrom = true;
        Stack<Integer> stack  = new Stack<>();

        while(slowPointer != null){
            stack.push(slowPointer.data);
            slowPointer = slowPointer.ptr;
        }
        while(head != null){
            int i = stack.pop();
            if(head.data == i){
                isPalindrom = true;
            }
            else{
                isPalindrom = false;
                break;
            }
            head = head.ptr;
        }
        return isPalindrom;
    }
}
