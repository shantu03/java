package Harry;


import java.sql.SQLOutput;

//PAGE 25
class Mythread1 extends Thread {
    public Mythread1(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(getName() + "\t=" + i);
        }
        System.out.println(getName() + "  is ending");
    }
}
class Mythread2 extends Thread {    public Mythread2(String name) {
    super(name);
}
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(getName()+"\t="+i);
            try {
//                Thread.sleep(247);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        System.out.println(getName()+"  is ending");
    }
}class Mythread3 extends Thread {    public Mythread3(String name) {
    super(name);
}
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println(getName()+"\t="+i);
        }
//        System.out.println(Thread.currentThread());
        System.out.println(getName()+"  is ending");
    }
}
public class L75_ThreadsMethods {
    public static void main(String[] args) throws InterruptedException {
        Mythread1 obj1 = new Mythread1("ravi");
        Mythread2 obj2 = new Mythread2("shantu");
        Mythread3 obj3 = new Mythread3("tanvi");
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.setPriority(2);
        obj1.start();
        obj2.start();
        System.out.println(obj1+"\n"+obj2+"\n"+obj3);
/*        try {
            obj2.join();
        } catch (Exception e) {
            System.out.println("Error has occured - "+e);
        }*/



        System.out.println("Middle of the file");

//        System.out.println(Thread.currentThread());
        obj3.setPriority(10);
        obj3.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("currently in Main Method ");
//            Thread.sleep(31);

        }

        System.out.println("End of the file ");
    }


}
