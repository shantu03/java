package P_Practice;

import java.util.ArrayList;
import java.util.Random;
import java.lang.Thread;
 class ReadingMindGame {
     static void random() throws InterruptedException {
        int arr[]={2,4,6,8,10};
        int k=new Random().nextInt(arr.length);

        game(arr[k]);
    }
    static void game(int index) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("WELCOME TO MIND GAME : " );
        Thread.sleep(2000);
        System.out.println("\nSTEP 1 : NOW SELECT RANDOM NUMBER (1-200) IN MIND " );
        Thread.sleep(2000);
        System.out.println("\nSTEP 2: NOW MULTIPLY NUMBER BY 2");
        Thread.sleep(1500);
        System.out.println("\nSTEP 3: NOW ADD " + index );
        Thread.sleep(1500);
        System.out.println("\nSTEP 4: DIVIDE BY 2" );
        Thread.sleep(2000);
        System.out.println("\nSTEP 5 : NOW SUBTRACT YOUR CHOSEN NUMBER FROM RESULT OF STEP 4" );
        Thread.sleep(1000);
        System.out.println("\n*** YOUR ANSWER IS " + index/2 + " ***");
    }
    public static void main(String[] args) throws InterruptedException {
    random();

    }
}
