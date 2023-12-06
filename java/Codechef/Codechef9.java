/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef9
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
            int n=sc.nextInt();
            long x=sc.nextLong();
		    
		    long arr[]=new long[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		        
		    }
		    Arrays.sort(arr);
			reverse(arr);
		    
		    long result=arr[(int)x-1]-1;
		    
		    System.out.println(result);
		    
		}
		sc.close();
	}
		
	public static void reverse(long arr[])
{


int n=arr.length;

for(int i=0;i<n/2;i++)
{
long temp=arr[i];

arr[i]=arr[n-i-1];
arr[n-i-1]=temp;
}


}
}
