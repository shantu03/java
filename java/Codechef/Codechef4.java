/* package codechef; // don't place package name! 

https://www.codechef.com/practice/course/strings-java/PJAST01/problems/DNASTORAGE

*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t=new Scanner(System.in).nextInt();
		while(t-- !=0){
		    int n= new Scanner(System.in).nextInt();
		    if(n%2!=0)
		    {
		        System.out.println("N is not even");
		        break;
		    }
		    
		    String s=new Scanner(System.in).next();
	for(int i=0;i<s.length();i+=2)
{
if(s.charAt(i)=='0'&&s.charAt(i+1)=='0')
{
System.out.printf("A");
}
if(s.charAt(i)=='0'&&s.charAt(i+1)=='1')
{
System.out.printf("T");
}
if(s.charAt(i)=='1'&&s.charAt(i+1)=='0')
{
System.out.printf("C");
}
if(s.charAt(i)=='1'&&s.charAt(i+1)=='1')
{
System.out.printf("G");
}

}
System.out.println();

		}
	}
}
