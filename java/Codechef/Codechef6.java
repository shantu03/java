/* package codechef; // don't place package name! 

https://www.codechef.com/practice/course/strings-java/PJAST01/problems/BLOBBYVOLLEY

*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef6
{
	public static void main (String[] args) throws java.lang.Exception
	{

		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(sc.readLine());

while(t-- >0)
{

int n=Integer.parseInt(sc.readLine());
String play=sc.readLine();
int a=0;
int b=0;
if(play.charAt(0)=='A')
{
a++;
}
else{b=0;}

for(int i=1;i<n;i++)
{
if(play.charAt(i)=='A')
{
if(play.charAt(i-1)=='A')
{
a++;
}
}
else{
if(play.charAt(i-1)=='B')
{
b++;
}
}
}

System.out.printf(" %d %d \n",a,b);
}

		
	}
}
