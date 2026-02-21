
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class priority {
    
    public static void main(String[] args) {
        PriorityQueue<Integer> sum=new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < 12; i++) {
            sum.add(new Random().nextInt(100));
        }

        System.out.println(sum);
    }
}
