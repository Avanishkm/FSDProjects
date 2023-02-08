package PracticsQuestions.ImportantQues;

public class Exchange {
    public  static class ListNode
    {
        int data;
        ListNode next;
        ListNode() {}
        ListNode(int data) { this.data = data; }
        ListNode(int data, ListNode next) { this.data = data; this.next = next; }
    }
    public static ListNode append(ListNode head,int x)
    {
        ListNode p;
        ListNode temp=new ListNode();
        temp.data=x;
        if(head==null){
            head=temp;
            temp.next=temp;
            return head;
        }
        p=head;
        while(p.next!=head){
            p=p.next;
        }
        p.next=temp;
        temp.next=head;
        return head;
    }
    public static void display(ListNode head)
    {
        ListNode p;
        if(head==null)
        {
            System.out.print("List is empty");
            return;
        }
        p=head;
        do{
            System.out.print(p.data+" -> ");
            p=p.next;
        }while(p!=head);
    }
    public static ListNode exchange(ListNode head)
    {
        ListNode t=head;
        while(t.next!=head)
        {
            t=t.next;
        }
        int temp=head.data;
        head.data=t.data;
        t.data=temp;
        return head;
    }
    public static void main(String[] args)
    {
        ListNode head=null;
        head = append(head,13);
        head = append(head,17);
        head = append(head,23);
        head = append(head,31);
        head = append(head,19);
        System.out.println("List Before exchanging the values");
        display(head);
        System.out.println("List after exchanging the values");
        head=exchange(head);
        display(head);
    }

}
