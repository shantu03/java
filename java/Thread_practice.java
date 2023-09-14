class Thread_class extends Thread
{
public void run()
{
for(int i=0;i<44;i++)
{
System.out.println("Thread class - "+getName()+"\t"+i);
}
}
}

class Runnable_Thread implements Runnable
{
public void run()
{
for(int i=55;i<125;i++)
{
System.out.println("Runnable Thread - "+i);
}

}
}

public class Thread_practice
{
public static void main(String [] args){
Thread_class obj1=new Thread_class();
Thread obj4=new Thread(obj1,"newjkdfs");

Thread obj5=new Thread(obj4,"new shantu");

System.out.println("obj4 = "+obj4);
System.out.println("obj5 = "+obj5.toString());
obj4.start();
obj1.start();



Runnable_Thread obj2=new Runnable_Thread();
System.out.println("obj2 runnable thread = "+obj2);


Thread obj3=new Thread(obj2);
System.out.println("obj3 Thread from runnable class"+obj3);

obj3.start();
}
}