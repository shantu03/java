import java.io.InputStreamReader;
import java.io.BufferedReader;

public class reading{
public static void main(String[] args) throws java.io.IOException
{
InputStreamReader aa=new InputStreamReader(System.in);
BufferedReader sc=new BufferedReader(aa);
String a=sc.read();
System.out.println(a);

}
}