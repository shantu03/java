public class static_member_inherit{
public static void main(String a[])
{

B b=new B();
b.fun();
B.fun();
}
}

class A {
static void fun(){
System.out.println("A static fun");
}
}
class B extends A{
}