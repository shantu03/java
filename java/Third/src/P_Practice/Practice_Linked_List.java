package P_Practice;

public class Practice_Linked_List {
    int data;
    Practice_Linked_List next;
    Practice_Linked_List previous;
    static Practice_Linked_List lasthead;
    static void printdata(Practice_Linked_List node) {
        while (node != null) {
            if (node.next == null) {
                lasthead=node;                  //we can also ignore if but this will cost more space to burn i think
            }


            System.out.println(node.data);
            node=node.next;

        }
        System.out.println("REVERSE");

        while (lasthead != null) {
            System.out.println(lasthead.data);
            lasthead=lasthead.previous;
        }

    }

    static void setdata(Practice_Linked_List node) {
        while (node != null) {
            if (node.previous == null) {
                node.data = 11;

            } else {
                node.data = node.previous.data + 11;
            }
            node=node.next;
        }

    }
    public static void main(String[] args) {
        Practice_Linked_List head=new Practice_Linked_List();
        Practice_Linked_List second=new Practice_Linked_List();
        Practice_Linked_List third=new Practice_Linked_List();
        Practice_Linked_List fourth=new Practice_Linked_List();
        Practice_Linked_List fifth=new Practice_Linked_List();
        Practice_Linked_List sixth=new Practice_Linked_List();

head.previous=null;
        head.next=second;
        second.previous=head;
        third.previous=second;
        fourth.previous=third;
        fifth.previous=fourth;
        sixth.previous=fifth;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;

        setdata(head);
        setdata(fifth);
        printdata(head);


    }
}