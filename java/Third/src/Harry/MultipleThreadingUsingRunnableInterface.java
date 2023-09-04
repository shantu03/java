package Harry;
//PAGE 23
 class thread_1 implements Runnable {
    public void run() {
        for (int i = 0; i < 12; i++) {
            System.out.println("THREAD 1   "+i);
        }

    }
}

class thread_2 implements Runnable {
public void run(){
    for (int i = 0; i < 12; i++) {
        System.out.println("THREAD 2  - "+i);
    }

}
}



public class MultipleThreadingUsingRunnableInterface {
    public static void main(String[] args) {
        thread_1 obj1=new thread_1();
        thread_2 obj2=new thread_2();
        System.out.println("RUNNING CLASS WITHOUT THREADING(DOING HALF WORK) ");
//        obj1.start();    ---> this will not run because there is not start method in class 
        obj1.run();
        obj2.run();
        System.out.println("\n\nCREATING NEW THREAD OBJECT IN-WHICH WE ARE PASSING CLASS ( WITH RUNNABLE INTERFACE) OBJECTS");
        Thread obj3=new Thread(obj1);
        Thread obj4=new Thread(obj2);
        obj3.start();
        obj4.start();
//        System.out.println("\n\n Running methods with passing class");
//        Thread obj5=new Thread(thread_2);         ---> CANNOT RUN WHILE PASSING ONLY CLASS REFERENCE,WE NEED TO CREATE OBJECT OF CLASS(WHICH IMPLEMENTES RUNNABLE INTERFACE)
    }
}
