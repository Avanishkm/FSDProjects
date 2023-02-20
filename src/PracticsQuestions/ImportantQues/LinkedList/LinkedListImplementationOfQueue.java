package PracticsQuestions.ImportantQues.LinkedList;

public class LinkedListImplementationOfQueue {
    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
        public int getData(){
            return data;
        }
        public void setData(){
            this.data = data;
        }
    }

}
