public class multithreading extends Thread{
public void run(){}

public static void main(String [] ar)
{
Thread t1 =new Thread(new A());
System.out.println(t1.getState());
t1.start();

B t2=new B();
t2.start();





for(int i=1;i<5;i++)
{
try{
t1.sleep(150);
new multithreading().sleep(1000);
}catch (InterruptedException e){
System.out.println("errror");
}
System.out.println("main: "+i);
}

}
}

class A implements Runnable {
public void run()
{
for(int i=1;i<5;i++)
{
System.out.println("process I "+i);

}
}
}
class B extends Thread{
public void run()
{
for(int i=1;i<10;i++)
{
System.out.println("process II "+i);
try{
this.sleep(750);
}catch(InterruptedException e )
{
}
}
}
}