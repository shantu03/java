abstract class main{
int x,y;
main()
{
System.out.println("first main constructor "+x+" "+y);
}
main(int x,int y)
{
this.x=x;
this.y=y;
System.out.println("first main constructor "+this.x+" "+this.y);

}

abstract void fun();
}

class A extends main{
A(int x,int y)
{
super(x,y);
}
A()
{
super();
}
void fun()
{
System.out.println("this is function overriding of abstract function ");
}
}

public class abstract_p{
public static void main(String arg[])
{
A a=new A(2,9);
}
}