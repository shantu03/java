package P_Practice;

interface internode {
     void show(Node n);

    void add(Node n, int data);

    void append(Node n, int data);

    void head(Node n, int data);
}

class Node implements internode {
    int data;
    Node next;
    Node previous;
    public Node(int data) {
        this.data=data;
    }

    @Override
    public void head(Node n, int data) {
        if (n.previous != null) {
            System.out.println("THIS IS NOT START OF THE LIST");
        } else {
            Node obj = new Node(data);
            obj.next=n;
            n.previous=obj;
        }
    }

    @Override
    public void append(Node n, int data) {
        if (n.next != null) {
            System.out.println("This is not End of the List");
        }
        else {
            Node obj = new Node(data);
            obj.previous=n;
            n.next=obj;

        }
    }

    @Override
    public void add(Node prev,int data) {
        Node obj = new Node(data);
        obj.next=prev.next;
        prev.next=obj;
        obj.previous=prev;
        obj.next.previous=obj;
    }
    @Override
    public void show(Node n) {
        while (n.previous != null) {
            n=n.previous;
        }
        while (n != null) {
            if (!( n.previous == null)) {
                System.out.printf("<-->");
            }

            System.out.printf(" %d ",n.data);
            if (n.next == null) {
                break;
            }
            n=n.next;
        }
/*        System.out.println("\nReversal");

        while (n != null) {
            System.out.printf(" %d ",n.data);
            n=n.previous;
        }*/

    }
}

public class Practice_Linked_List {
    public static void main(String[] args) {
        Node one = new Node(34);
        Node three = new Node(384);
        Node two = new Node(124);
        Node four = new Node(1523);
        one.next=two;
        two.next=three;
        three.next=four;
        three.previous=two;
        four.previous=three;
        two.previous=one;

        one.show(one);
        one.add(two, 456);
        System.out.println("\n\nADDING NEW NODE IN BETWEEN LIST (TWO-THREE)");
        one.show(one);

        System.out.println("\n\nADDING NEW NODE IN LAST OF THE LIST");
        one.append(four,67);
        one.show(one);

        System.out.println("\n\nADDING NEW NODE AT START OF THE LIST");
        one.head(one,67);
        one.show(one);
    }
}