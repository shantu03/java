import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

public class huffman {
    Map<Character,String> Encoder;
    Map<Character,Integer> Decoder;
    public  class Node implements Comparable<Node> {
        int cost;
        char ch;
        Node left; 
        Node right;

        public Node(char ch,int cost){
            this.cost=cost;
            this.ch=ch;
            this.left=null;
            this.right=null;
        }

        @Override
        public int compareTo(huffman.Node o) {
            // TODO Auto-generated method stub
            return this.cost-o.cost;
        }
    }

    public void Encoding(String URL)
    {
        HashMap<Character,Integer> map=new HashMap<>();

        for (char ch : URL.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        Set<Map.Entry<Character,Integer>> set= map.entrySet();

        PriorityQueue<Node> minheap=new PriorityQueue<>();

        for (Map.Entry<Character,Integer> entry : set) {
            Node node=new Node(entry.getKey(), entry.getValue());
            minheap.add(node);
        }


        while(minheap.size()!=1)
        {
            Node first=minheap.remove();
            Node second=minheap.remove();

            Node node=new Node('/', second.cost+first.cost);

            node.left=first;
            node.right=second;

            minheap.add(node);

        }

        Node ft=minheap.remove();
        Encoder=new HashMap<>();

        encoding_bits(ft, URL);

        System.out.println(Encoder);


    }
    
    public static void main(String[] args) {
        huffman a=new huffman();
        a.Encoding("shantanu_HULWAN");


        a.Decoding();
    }

    public void encoding_bits(Node node,String str)
    {
        if(node==null) return;

        if(node.left==null && node.right==null)
        {
            Encoder.put(node.ch, str);
            return;
        }

        encoding_bits(node.left, str+"0");
        encoding_bits(node.right, str+"1");
    }
}
