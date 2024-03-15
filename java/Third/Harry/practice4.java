package Harry;
import java.util.Scanner;
public class practice4 {
    //Leap year
    public static void main(String[] args)
    {
        System.out.println("enter year");
        int year=new Scanner(System.in).nextInt();
        int count=0;
        if(((year%400==0) || (year%100!=0)) && (year%4==0))
        {
            System.out.println("leap year");
    }
        else { System.out.println("not a leap year");}
    }

 }
