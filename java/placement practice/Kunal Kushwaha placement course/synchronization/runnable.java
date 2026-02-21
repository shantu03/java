import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class runnable implements Runnable {
    public void run(){
        for (int i = 0; i < 10; i++) {
                System.out.println("this is ");
        }
    }
    public static void main(String[] args) {
            runnable cRunnable=new runnable();
            Thread task1=new Thread(cRunnable);
            Thread task2=new Thread(cRunnable);
            task1.start();
    }
}
