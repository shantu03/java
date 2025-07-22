import java.util.Scanner;
import java.lang.StringBuilder;
public class palindromes{
    public static void main(String a[])
    {
        System.out.println("enter string one ");
        String s1,s2;
        s1=new Scanner(System.in).nextLine();
        System.out.println("enter string two ");
        s2=new Scanner(System.in).nextLine();
      //stringbuilder(s1,s2);
        // charsequence(s1, s2);
        
        single_string(s1);
        single_string(s2);
    }
    static void single_string(String s2)
    {
        int k=1;
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)!=s2.charAt(s2.length()-1-i))
                k=0;
        }
        System.out.printf("for string "+s2.getClass().getName()+" :");
        if(k==1)
            System.out.println("yes");
        else
            System.out.println("no");
      

    }
    static void charsequence(String s1,String s2)
    {
        int k=1;
        if(s1.length()!=s2.length())
            k=0;
        
        for(int i=0;i<s1.length();i++){
            
            if(s1.charAt(i)!=s2.charAt(s1.length()-i-1))
                k=0;
        }
        
        if(k==1)
        System.out.println("yes");
    else
        System.out.println("no");

    }
    static void stringbuilder(String s1,String s2)
    {
        StringBuilder s=new StringBuilder();
        s.append(s1);
        s.reverse();

        if(s.toString().equals(s2))
            System.out.println("yes");
        else 
            System.out.println("no");


    }
}