/* package codechef; // don't place package name! 

https://www.codechef.com/practice/course/sorting-java/PJASOR01/problems/CHEFA?tab=statement

*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef7
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    int count=0;
		    for(int i=n-1;i>=0;i=i-2)
		    {
		        count+=arr[i];
		    }
		    
		    System.out.println(count);
		}
		sc.close();
	}
}
