package P_Practice;
import java.time.LocalDateTime;

class Bank{
  int amount =5000;

    synchronized void add(int deposit) {
        this.amount+=deposit;
        System.out.println("\n\n "+Thread.currentThread().getName()+"\nADDING BALANCE --> "+ deposit +"\nCurrent Balance --> "+amount+"\n\n");
    }

    synchronized void withdraw(int withdraw) {
        this.amount-=withdraw;
        System.out.println("\n\n "+Thread.currentThread().getName()+"\nwithdraw BALANCE --> "+ withdraw +"\nCurrent Balance --> "+amount+"\n\n");

    }
}

class Thread1 implements Runnable {
    Bank ac;

    public Thread1(Bank ac) {
        this.ac = ac;
    }
    int am;
    int wt;
    public void addd(int am,int wt) {
    this.am=am;
    this.wt=wt;
    }
    public void run() {
        ac.add(am);
        ac.withdraw(wt);

    }
}class Thread2 implements Runnable {
    Bank ac;

    public Thread2(Bank ac) {
        this.ac = ac;
    }
    int am;
    int wt;
    public void addd(int am,int wt) {
    this.am=am;
    this.wt=wt;
    }
    public void run() {
        ac.add(am);
        ac.withdraw(wt);

    }
}


public class SynchorizedMethodInMultiThreading {
    public static void main(String[] args) {
        Bank ac=new Bank();
        Thread1 obj1 = new Thread1(ac);
        Thread2 obj2 = new Thread2(ac);
        obj1.addd(6000,500);
        Thread thread1=new Thread(obj1);
        obj2.addd(500, 2000);
        Thread thread2=new Thread(obj2);

        thread1.start();
        thread2.start();

    }
}
