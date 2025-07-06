import java.io.IOException;
import java.io.BufferedReader;
import java.lang.NumberFormatException;
;
import java.io.InputStreamReader;

class first{
public static void main(String a[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try{
String k=(br.readLine());
StringBuilder sb=new StringBuilder();
sb.append(k);
//k=sb.reverse().toString();
int sum=0;
for(int i=0;i<k.length();i++)
{
	if(k.charAt(k.length()-1-i)=='1')
		sum+=Math.pow(2,i);

	if(!(k.charAt(i)=='0'||k.charAt(i)=='1'))
		throw new Exception("enter valid input ");

}

System.out.println(sum);


}catch(Throwable e)
{
System.out.println(e);
}

}
}