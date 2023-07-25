import java.util.Scanner;
public class practice5{
public static void main(String[] args)
{
//que1();
//que2();
//que4();
//que5();
que6();
}

static void que6()
{
//program to find sum of no. occuring in multiple of 8(tabel)

int sum =0;
for(int i=1;i<=10;i++)
{
sum =sum +(i*8);
}
System.out.println(sum);

}


static void que5(){
System.out.println("enter number to find it factorial");
int num = new Scanner(System.in).nextInt();
int fac=1;
for(int i=1;i<=num;i++)
{
fac*=i;
}
System.out.println(fac);

}



static void que4()
{
//reverse multiplication table
System.out.println("enter number  to print it table reversely");
int k=new Scanner(System.in).nextInt();
for(int i=10;i>0;i--)
{
System.out.println(k + " * " + i +" = " + i*k);
}
}





static void que2()
{
//first sum of n even number
int num=new Scanner(System.in).nextInt();
int sum=0;
for(int i=0;i<=num;i++)
{
sum =sum+(i*2);
}
System.out.println(sum);

}


static void que1()
{
int num = new Scanner(System.in).nextInt();
for(int i=0;i<num;i++)
{
for(int j=num-i;j>0;j--)
{
System.out.print("*");
}
System.out.println("");
}

}
}