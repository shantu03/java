class inheri{
static {
System.out.println("static block of base");
}
inheri()
{
System.out.println("constructor called of base class ");
}
}
class child extends inheri
{
static {
inheri a=new inheri();
System.out.println("static block of child ");
}

child()
{
System.out.println("constructor called of child class ");
}
void fun(){
System.out.println("function called ");

}
}
public class inheritance {
public static void main(String args[]){
child c1=new child();
}
}