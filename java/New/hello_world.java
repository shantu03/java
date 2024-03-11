public class hello_world{
public static void main(String[] args)
{
String a="hello world";
String b="           ";

for(int j=1;j<=a.length();j++)
{

b=a.substring(0,j);

for(int p=0;p<26;p++)
{
if(j==a.length())
{	System.out.println("hello world");
	break;
}
String c=b;
c=c+(char)('a'+p);
System.out.println(c);

try{
Thread.sleep(13);
}
catch(Exception e)
{
}

}

}

}
}