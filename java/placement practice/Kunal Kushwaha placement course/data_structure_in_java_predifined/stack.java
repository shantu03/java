import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class stack {
    public static void main(String[] args) {
             
        Stack stack1=new Stack<>(); // NOT GOOD SINCE EXTENDS VECTOR 


        Deque stack2=new ArrayDeque<>();  // single thread enviornment 


        BlockingDeque stack3 =new LinkedBlockingDeque<>();  // for multi threaded enviornment 

        

        Queue queueq=new LinkedList<>(); // not actuall solution


        Queue queue2=new PriorityQueue<>();  // not actuall solution, work on priority --> min head to maintain tree order 


        Queue queue3=new ArrayDeque<>();  // for single thread envi


        Queue queue4 =new ArrayBlockingQueue<>(2); // for multithread envio






        System.out.println("end of the program ");
                
    }


}
