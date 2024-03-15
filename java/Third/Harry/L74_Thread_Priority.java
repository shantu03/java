package Harry;
//PAGE 24

class thread1_1 extends Thread {
    thread1_1(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName()+"\tStarting ");
        for (int i = 0; i < 9; i++) {
            System.out.println(getName()+"\t"+i);
        }
        System.out.println(getName()+"\t Ending ");
    }
}

public class L74_Thread_Priority {

    public static void main(String[] args) {
        thread1_1 obj1 = new thread1_1("Ravi   ");
        thread1_1 obj2 = new thread1_1("Avi    ");
        thread1_1 obj3 = new thread1_1("shantu ");
        thread1_1 obj4 = new thread1_1("sanket ");
        thread1_1 obj5 = new thread1_1("mahesh ");
        System.out.println();
        obj1.setPriority(1);
        obj3.setPriority(5);
        obj2.setPriority(8);
        obj4.setPriority(9);
        obj5.setPriority(10);
        obj1.start();
        obj2.start();
        obj4.start();
        obj3.start();
        obj5.start();

    }


}
