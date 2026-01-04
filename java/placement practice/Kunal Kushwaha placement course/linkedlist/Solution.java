import java.util.Random;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
    
}

public class Solution {

       public static void display(ListNode head,String k) {

        System.out.print(k+" ::  ");
        if (head == null) {
            System.out.println("Empty");
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.printf("%d --> ", temp.val);
                temp = temp.next;
            }
            System.out.print("null ");
        }
System.out.println();
    }

    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        first.next = new ListNode(2);
        first.next.next = new ListNode(4);

        // ListNode second=new ListNode(1);
        // second.next=new ListNode(3);
        // second.next.next=new ListNode(4);


        // MERGE TWO SORTED LL 
        // display(first);
        // ListNode merged=mergeTwoLists(first,second);
        // display(second);
        // display(merged);


        // FIND MID OF LL
        // display(middleNode(merged));

        // FIND POSITION OF VALUE IN LL 
        // display(find(merged, 2));



        // MERGE SORT 
        first = new ListNode(new Random().nextInt(100) - 8);
        var head = first;
        for (int i = 0; i < 5; i++) {
            first.next = new ListNode(new Random().nextInt(100) - 8);
            first = first.next;
        }

        // System.out.println("final answer =");
        // display(mergeSort(head));


        // REVERSE RECURSIVE 
     
       
    //    display(head);
    //     var temp = head;
    //     while (temp.next != null) {
    //         temp = temp.next;

    //     }
       
    //         reverse_LL_using_recursion(head);
        
    //     display(temp);


// REVERSE LL 2 

display(head,"head :: ");
var temp=head;
reverseBetween(head, 1, 5);

display(temp,"temp :: ");

    }


     public static ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode previous=null;
        ListNode current=head;

        if(left==right) return head;


        for (int i = 0; current!=null && i < left-1; i++) {
            previous=current;
            current=current.next;
        }

        ListNode leftpart=previous;
        ListNode n=current.next;
        ListNode tail=current;

        for (int i = 0;current!=null &&  i < right-left+1; i++) {
            current.next=previous;
            previous=current;
            current=n;

            if(n!=null)
            n=n.next;
        }

        if(leftpart!=null) leftpart.next=previous;
        else head=previous;

        tail.next=current;
        

        return head;

    }

    public static ListNode reverse_LL_using_recursion(ListNode head) {

        if (head.next == null)
            return head;


        
        ListNode temp = reverse_LL_using_recursion(head.next);
        temp.next = head;
        head.next = null;
        return head;
    }

    public static ListNode mergeSort(ListNode head) {
        ListNode temp = null;

        while (head != null && head.next != null) {
            ListNode mid = middleNode(head);
            // temp=mid.next;
            // mid.next=null;

            ListNode left = mergeSort(head);
            ListNode right = mergeSort(mid);
            return mergeTwoLists(mergeSort(left), mergeSort(right));
        }
        return head;

    }

    public static ListNode find(ListNode head, int val) {
        while (head != null && head.val != val) {
            head = head.next;
        }

        if (head.val == val)
            return head;
        else
            return null;
    }

    public static ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        count /= 2;
        temp = head;
        for (int i = 1; i < count; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                temp.next = new ListNode(list2.val);
                list2 = list2.next;
                temp = temp.next;
            } else {
                temp.next = new ListNode(list1.val);
                temp = temp.next;
                list1 = list1.next;
            }
        }

        if (list2 == null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }

        return head.next;
    }
}