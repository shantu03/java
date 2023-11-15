/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
public class Codechef2
{
	public static void main (String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextByte();
        while(num!=0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            
            int[][]arr=new int[2][n];
            
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            
            
            int cost=0;
            for(int i=0;i<n;i++)
            {
                    if(arr[0][i]>=x)
                    {
                     cost+=arr[1][i];   
                    }
                
            }
            
            System.out.println(cost);
            
            
            
        }
	}
}
