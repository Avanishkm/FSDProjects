package PracticsQuestions.ImportantQues.LinkedList;

public class BinaryConvertLL {
    public int getDecimalValue(Exchange.ListNode head){
        int num = head.data;
        while(head.next != null){
            num = num * 2 + head.next.data;
            head = head.next;
        }
        return num;
    }
}
