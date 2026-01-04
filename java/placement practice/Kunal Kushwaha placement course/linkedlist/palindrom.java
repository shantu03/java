public class palindrom {
    public static void main(String[] args) {
        
        ListNode ll=new ListNode('a');
        ll.next=new ListNode('b');
        ll.next.next=new ListNode('c');

        var head=ll;
        ll=ll.next.next;
        ll.next=new ListNode('d');
        ll.next.next=new ListNode('e');
        ll.next.next.next=new ListNode('f');
        // ll.next.next.next.next=new ListNode('g');





        display(head,"");


        var slow=head;
        var fast=head;


        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode previous=null,current=slow,next=current.next;

        while(current!=null)
        {
            current.next=previous;
            previous=current;
            current=next;
            if(next!=null)
            next=next.next;
        }

        

        display(previous, "slow : ");
        display(head, "head : ");

        

    }




     public static void display(ListNode head,String k) {

        System.out.print(k+" ::  ");
        if (head == null) {
            System.out.println("Empty");
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.printf("%c --> ", (char)temp.val);
                temp = temp.next;
            }
            System.out.print("null ");
        }
System.out.println();
    }
}
