/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-- !=0)
		{
		    int num=sc.nextInt();
		    
		    int arr1[]=new int[num];
		    int count1=0;
int maxcount1=0;
int maxcount2=0;
		    int count2=0;
		    for(int i=0;i<num;i++)
		    {
		        arr1[i]=sc.nextInt();
		        if(arr1[i]==0)
		        {

		            count1=0;
		        }
		        else{
		            count1++;
		        }
if(maxcount1<=count1)
{
maxcount1=count1;
}
		    }
		    
		     for(int i=0;i<num;i++)
				
		    {
				arr1[i]=0;
		        arr1[i]=sc.nextInt();
		        if(arr1[i]==0)
		        {

		            count2=0;
		        }
		        else{
		            count2++;
		        }
if(maxcount2<=count2)
{
maxcount2=count2;
}
		    }

			if(maxcount1==maxcount2)
{
System.out.println("Draw"+count1+" "+count2);
}
			else if(maxcount1>maxcount2)
{
System.out.println("Om"+count1+" "+count2);
}
else if(maxcount1<maxcount2){
System.out.println("Addy"+count1+" "+count2);
}
		}
	}
}
