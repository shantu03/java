/*https://www.codechef.com/practice/course/basic-math-java/PJABM01/problems/SEVENRINGS

Difficulty - 500*/

import java.util.*;

class Codechef1
{
	public static void main (String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int num=sc.nextByte();
        while(num!=0)
        {
            num--;
            int x=sc.nextInt();
            int n=sc.nextInt();
            String k=""+x*n;
            
           
                if(k.startsWith("0")||k.length()>5)
                {
                    System.out.println("NO");
                    
                }
                else{
                    System.out.println("Yes");
                }
            
        }
	}
}
