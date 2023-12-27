public class BinarytoInt{
public static void main(String args[])
{
System.out.println("hello");

System.out.println(toint("11100"));
}
static int toint(String str)
{
int num=0;
for(long i=0;i<str.length();i++)
{
if(str.charAt((int)i)=='1')
{
num+=Math.pow(2,str.length()-1-i);
}
}

return num;
}
}