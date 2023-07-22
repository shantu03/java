//program to check palindrome string

import java.util.Scanner;

public class problem3
{
public static void main(String[] main)
{

String original=new Scanner(System.in).nextLine();
int k=original.length();
int count=0;

for(int i=0,j=k-1;i<k;i++,j--)
{
if(!(original.charAt(i)==original.charAt(j)))
{


}
else 
{
count++;
}


}

if(count==0)
{
System.out.println(original + " is not palindrom string");}
else
{
System.out.println( original + " is palindrom string");}

}
}