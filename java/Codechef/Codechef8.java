/* package codechef; // don't place package name! 

https://www.codechef.com/practice/course/sorting-java/PJASOR01/problems/AMMEAT
Diff- 1200

*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef8
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(sc.readLine());
while(t-->0)
{		
int n=Integer.parseInt(sc.readLine());
int m=Integer.parseInt(sc.readLine());

int[]  arr =new int[n];
for(int i=0;i<n;i++)
{
arr[i]=Integer.parseInt(sc.readLine());
}
Arrays.sort(arr);

int count=0;
int sum=0;
for(int i=n-1;i>=0;i--)
{

if(m<=sum)
{
break;
}
int temp=arr[i];

count++;
sum+=temp;



}

if(sum>=m)
{
System.out.println(count);
}
else{
System.out.println("-1");
}



}
sc.close();
	}
}
