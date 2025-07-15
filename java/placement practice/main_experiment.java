public class main_experiment{
public static void main(String ar[])
{
System.out.println("main function ");
A a=new A(ar);

}
}
class A{
A(String arg[]){
main_experiment a=new main_experiment();
System.out.println("A constructor ");
a.main(arg);

}
}