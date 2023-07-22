//write a Java program to check  palindrome numbers

import java.util.Scanner;
public class problem2
{
public static void main(String[] args)
{
int no=new Scanner(System.in).nextInt();


if(ispalindrome(no))
{
System.out.println(no + " is palindrome");
}
else
{
System.out.println(no + " is not palindrome ");


}
}
public static boolean ispalindrome(int num)
{
int r_num=0;
int num1=num;
int num2=0;

while(num1!=0)
{
num2*=10;
num2+=num1%10;
num1/=10;
}

if(num2==num)
{return true;}
else
{
return false;}


}


}