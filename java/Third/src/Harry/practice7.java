package Harry;
import java.util.Scanner;
public class practice7 {
    public static void main(String[] args) {
//        System.out.println(que3(20));
//    que4();
//        System.out.println(que5(7));
//        System.out.println(que6(4, 6, 2, 9, 62, 3));
//    que7(9);
        que8(9);


    }
    static int que8(int num)
    {
        if(num>0)
        {
            que8(num-1);
            for(int i=0;i<num;i++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
       return 0;
    }
    static float que6(int ...arr)
    {
        float average=0;
        for(float i:arr)
        {
            average+=i;
        }
        return average/arr.length;
    }
    static int que7(int num)
    {
//        REPEAT QUE 4 USING RECURSION
        for (int i=0;i<num;i++)
        {
            System.out.printf("*");
        }
        System.out.println();
        if(num==0)
        {
            return 0;
        }
        else return que7(num-1);
    }

    static int que5(int num)
    {
//        PROGRAM TO PRINT nth NUMBER OF FIBONACCI SEQUENCE NUMBER
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else {
            return que5(num-1)+que5(num-2);
        }
    }
    static void que4()
    {
     int num=new Scanner(System.in).nextByte();
        System.out.println("PATTERN 1 (que2)");
        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }





        System.out.println("PATTERN 2 (que4)");

        for(int i=num;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int que3(int num)
    {
//        WRITE RECURSIVE FUN TO PRINT SUM OF FIRST n NATURAL NUMBERS
        if(num==0)
        {
            return 0;
        }
        else
            return num+que3(num-1);
    }
}
