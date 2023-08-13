public class selfpractice
{
public static void main(String[] args)
{


String name="   hello_Shantu";

name=name.trim();
System.out.println(name);
System.out.println(name.substring(4,8));
System.out.println(name.replace('T','P'));
System.out.println(name.replace("ello","ravi"));
System.out.println(name.endsWith("vi"));
System.out.println(name.indexOf("Sh",7));
System.out.println(name.lastIndexOf("Sh",25));
System.out.println(name.equalsIgnoreCase("hello_shanTu"));

System.out.println("\nfor each loop String\n");
String[] obj={"hello","shantu ", "kasa ahes re"};
for(String i:obj)
{
System.out.println(i);
}


System.out.println("\nfor each loop (int)char\n");
char[] arr={'s','s','t','u'};

for(int i:arr)
{
System.out.println(i);
}

System.out.println("\nLOOP BREAKING\n");

for(int i=0,k=1;i<5;i++)
{
for(int j=0;j<5;j++)
{
for(int p=0;p<5;p++,k++)
{
if(i==2)
{
break;
}
System.out.printf("%3d-%3d-%3d-%3d  ",i,j,p,k);
}
if(i==3)
{
break;
}
}
if(i==0)
{
break;
}
}


System.out.println("\nNON-STATIC METHOD (CALLING WITH OBJECT)");
selfpractice object=new selfpractice();
object.show();

}
void show()
{
System.out.println("****INSIDE OF SHOW METHOD****\n" );
}

}