//exercise by harry
//calculate percentage of five subject (marks enterd by user)
package Harry;

import java.util.*;
public class exercise1{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 subject marks");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();

        System.out.println((float) ((s1+s2+s3+s4+s5)*100/500));
    }
}
