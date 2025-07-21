class Bank implements Runnable{
int bal=100;
public void run(){
for (int i=0;i<10;i++)
{
System.out.println("Enter amound to withdraw : " );
int k =new java.util.Random().nextInt(100)+3;
synchronized(this){

if(bal>k)
	withdraw(k);
else 
	System.out.println("withdrawing : "+k+" insufficiant balance");

}
}
}

void withdraw(int x)
{

	bal-=x;
System.out.println("withdrawn : "+ x +" balance : " +bal);

}

void deposite(int x)
{
bal+=x;
}
}
public class syncho{
public static void main(String args[])
{
Bank ac=new Bank();
Thread t1=new Thread(ac);
Thread t2=new Thread(ac);

t1.start();
t2.start();

}
}
