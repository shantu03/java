class Static_Class_Function_Check{
public static void main(String args[])
{

A a1=new A();
A a2=new A();
a1.x=9;
a1.y=10;
System.out.println(a1.x+""+a1.y+""+a2.x+""+a2.y); 
a2.x=12;
a2.y=13;

}
}
class A{
static int x;
int y;
}