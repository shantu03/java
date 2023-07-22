//Given a string,  print the first non-repeating char

import java.util.Scanner;

public class problem1
{
public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String original=sc.nextLine();
	int k=original.length();
	char[] ch =new char[k];
	char[] p1=new char[k/2];
	for(int i=0;i<k;i++)
		{
			ch[i]=original.charAt(i);	
		}
	for(int i=0,j=0;i<k;i++)
		{
			if(original.indexOf(ch[i])==original.lastIndexOf(ch[i]))
				{
					p1[j]=ch[i]; j++;

				}
		}

		if(p1[0]=='\0'){
 System.out.println("every char is repeated");}
else{
	System.out.println(p1[0]);}

	}
}
