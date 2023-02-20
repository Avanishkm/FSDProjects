package PracticsQuestions.ImportantQues.LinkedList;

//public class Deletion {
//    public Node deleteNodeAtPosition(Node head, int position){
//        if(head == null){
//            return head;
//        }
//        if(position == 1){
//            if (head.next != null){
//                head.next.prev = null;
//
//            }
//            return head.next;
//        }
//        Node node = head;
//        while (node != null && position>1){
//            node = node.next;
//            position--;
//        }
//        if (node == null){
//            return head;
//        }
//        if (node.next != null){
//            node.next.prev = node.prev;
//
//        }
//        node.prev.next = node.next;
//        return head;
//    }
//}
