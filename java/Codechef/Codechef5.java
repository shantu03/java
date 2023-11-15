/* package codechef; // don't place package name! 

https://www.codechef.com/practice/course/strings-java/PJAST01/problems/TWOSTR
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		InputStreamReader ip =new InputStreamReader(System.in);
		BufferedReader sc=new BufferedReader(ip);
	//System.out.println(name);

		int t=Integer.parseInt(sc.readLine());

	while(t-- !=0)
{
String name1=sc.readLine();
String name2=sc.readLine();
if(name1.length()!=name2.length())
{
System.out.println("length not same");
break;
}
int count=0;
for(int i=0;i<name1.length();i++)
{
if(name1.charAt(i)==name2.charAt(i)||name1.charAt(i)=='?'||name2.charAt(i)=='?')
{
count++;
}
else{

}

}
if(count==name1.length())
{
System.out.println("Yes");

}
else{
System.out.println("No");

}

}

sc.close();
	}
}
