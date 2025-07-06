import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;



class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){this.val=val;};
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1=0;
        int unit=1;
        while(l1.next!=null)
        {
            val1+=l1.val*unit;
            unit*=10;
            l1=l1.next;
        }
        int val2=0;
        int unit1=1;
        while(l2!=null)
        {
            val2+=l2.val*unit1;
            unit1*=10;
            l2=l2.next;
        }



        int val3=val1+val2;
        unit=(unit>unit1)?unit:unit1;
        if(val3/unit==0)  unit/=10;

        int temp=val3/unit;
        ListNode l3=new ListNode(temp);



        while(val3>0)
        {
            val3%=unit;
            unit/=10;
            if(unit==0) break;
            temp=val3/unit;
            ListNode ll=new ListNode(temp,l3);
            l3=ll;
        }
        System.out.printf("[");

        while(l3!=null)
        {
            if(l3.next==null)   System.out.printf("%d]",l3.val);
            else                System.out.printf("%d,",l3.val);


            l3=l3.next;
        }
        return l3;
    }
    public static void main(String arw[])
    {
        String k=new Scanner(System.in).nextLine();
       k= k.replaceAll("l1", "kk");
       k= k.replaceAll("l2",
       "pp");
        String p[]=k.split("=");
        String arr1[]=p[1].split(",");
        String arr2[]=p[2].split(",");

        int iarr1[]=new int[arr1.length-1];
        int iarr2[]=new int[arr2.length];

        for(int i=0;i<iarr1.length;i++)
        {
            iarr1[i]=Integer.parseInt(arr1[i].replaceAll("[\\D]",""));

            
        }
        for(int i=0;i<iarr2.length;i++)
        {
            iarr2[i]=Integer.parseInt(arr2[i].replaceAll("[\\D]",""));

        }
        ListNode list1=new ListNode(iarr1[iarr1.length-1]);
        for(int i=arr1.length-2;i>=0;i--)
        {
            ListNode list1d=new ListNode(iarr1[i], list1);
            list1=list1d;
        }



        ListNode list2=new ListNode(iarr2[iarr2.length-1]);
        for(int i=arr2.length-2;i>=0;i--)
        {
            ListNode list2d=new ListNode(iarr2[i], list2);
            list2=list2d;
        }
        
        addTwoNumbers(list1, list2);

    }
}