
public class LL {

    private Node head;
    private Node tail;
    private int size=0;

    class Node{
        private int value;
        private Node next;

        public Node(int val){
            this.value=val;
        }
        public Node(int val,Node next){
            this.value=val;
            this.next=next;
        }
    }
    public LL(){
size=0;
    }
    public void insertLast(int val)
    {
        tail=tail.next=new Node(val);
        // tail=tail.next;
        size++;

        
    }

    public void reverseList()
    {


        Node q=null;
        Node p=head;
        Node n=p.next;

        while (p!=null) {

            p.next=q;
            q=p;
            p=n;

            if(n!=null)
                n=n.next;
            
        }
        head=q;

    }
    public void insertFirst(int val){
        if(size==0)
        {
            tail=head=new Node(val);
            size++;
            return;
        }
        
        head=new Node(val,head);
        size++;
    }

    public void display(){

        if(head==null){ System.out.println("Empty"); }
        else{
            Node temp=head;
            for (int i = 0; i < size; i++) {
                System.out.printf("%d --> ",temp.value); 
                temp=temp.next;
            }
            System.out.println("null ");
        }


    }

    public void insertRec(int val, int index)
    {

        insertRec(val, index, head);
        
    }
    private void insertRec(int val, int index,Node temp)
    {
        if(index==1){
            temp.next=new Node(val,temp.next);
            return ;
        }
        else insertRec(val, index-1, temp.next);

        
    }
    

    

    public static void main(String[] args) {
        LL first=new LL();

        first.insertFirst(34);
        first.insertFirst(99);
        first.insertLast(23789);
        first.insertLast(22);

        first.display();

        

        first.insertRec(12, 2);

        first.display();


        
    }
}




