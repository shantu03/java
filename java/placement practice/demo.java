class construct{
protected int x, y;
String k;
	public construct(int a,int b){
x=a;y=b;
}
construct()
{
}
void display()
{
System.out.println(x+" "+y+" "+ k );
}
}
public class demo {
public static void main(String [] ag)
{
construct a=new construct(Integer.parseInt(ag[0]),Integer.parseInt(ag[1]));

a.display();
}
}