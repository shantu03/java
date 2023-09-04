package Harry;

//PAGE 22
class thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thread 1   "+i);
        }
    }
} class thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Thread 2   "+i);
        }
    }
}

class normal_class {
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("Normal class  "+i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        long start =System.currentTimeMillis();
        normal_class obj1=new normal_class();
        normal_class obj2=new normal_class();
        obj1.run();
        obj2.run();
        long end = System.currentTimeMillis();
        System.out.printf("After running normarl class two time result is  %.6f", (double)(end-start)/1000);

        start = System.currentTimeMillis();
        thread1 obj3 = new thread1();
        thread2 obj4=new thread2();
        obj3.start();
        obj4.start();
        end = System.currentTimeMillis();
        System.out.printf("After running 2 theead result is  %.6f", (double)(end-start)/1000);


    }
}
