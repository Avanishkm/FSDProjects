//package PracticsQuestions.ImportantQues.Stack;
//
//import org.w3c.dom.Node;
//
//public class RemoveDuplicates {
//    public static void removeDuplicate(Node head){
//        if(head == null){
//            return;
//        }
//        Node current = head;
//
//        while(current.next != null){
//            if(current.data == current.next.data){
//                deleteNode(head, current.next);
//            }
//            else{
//                current = current.next;
//            }
//        }
//    }
//    public static void deleteNode(Node head, Node del){
//        if(head == null || del == null){
//            return;
//        }
//        if(head==del){
//           head = del.next;
//        }
//        if(del.next != null){
//            del.next.prev = del.prev;
//        }
//        if(del.prev != null){
//            del.prev.next = del.next;
//        }
//    }
//}
