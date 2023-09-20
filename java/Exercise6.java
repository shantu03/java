/*
CREATE CALCULATOR WITH FOLLOWS OPERATIONS
-->ADDITION
-->SUBSTRACTION
-->MULTIPLICATION
-->DIVISION
WHICH MAY THORWS FOLLOWS EXCEPTION 
--> INVALID INPUT 
--> MAX INPUT 10000
--> MAX INPUT FOR MULTIPLICATION 7000
--> CANNOT DIVIDE BY ZERO
 */
import java.util.Scanner;

public class Exercise6{
    public static String getsOperation()
    {
    String operation="&";

        System.out.println("Enter operation *, + , -, /");
         operation =new Scanner(System.in).next();
         if(operation.equals("*")||operation.equals("/")||operation.equals("+")||operation.equals("-"))
         {
            return operation;
         }
         else{
            throw new ArithmeticException("Wrong operation is entered bro ... ");
         }

    }
    public static double getsA()
    {
    double a =new Scanner(System.in).nextDouble();
    if(a>10000)
    {
        throw new ArithmeticException("Value is greater than 10000");
    }
    return a;
    }
    public static double getsB()
    {
    double a =new Scanner(System.in).nextDouble();
    if(a>10000)
    {
        throw new ArithmeticException("Value is greater than 10000");
    }
    return a;
    }

    public static void main(String args[])
    {
        int play=1;
        while(play==1)
        {
            double a=0;
            double b=0;
            int jj=0;
            while(jj==0)
            {
            try{
        System.out.println("Enter value of A ");
         a=getsA();
         System.out.println("Enter value of B ");
         b =getsB();
         jj++;
            }catch(Exception e)
            {
                System.out.println("ERROR OCCURED BRO ... -->  "+e);
            }
            }
        play++;
        int kk=0;
        
        
        try{
            String operation =getsOperation();
        switch(operation)
        {
            case "*": { kk++;mul(a,b);break;}
            case "/": { kk++;div(a,b);break;}
            case "+": { kk++;add(a,b);break;}
            case "-": { kk++;sub(a,b);break;}
            default :{ System.out.println("Enter valid option ");}
        }
        }catch(Exception e)
        {
            System.out.println(e);
        }
  
        while(true)
        {
        System.out.println("\nDo you wish to perform operation again \"YES\" or \"NO\"");
        String choice =new Scanner(System.in).next();
        if(choice.equalsIgnoreCase("yes"))
        {
            play=1;
            break;
        }
        else if(choice.equalsIgnoreCase("no"))
        {
            System.out.println("Thanks ");
            return;
        }
        else{
            System.out.println("Please Enter valid option ");
        }
        }

        }

    }
    static void mul(double a, double b)
    {
        if(a>7000 || b>7000)
        {
            throw new ArithmeticException("Limit for mul is 7000 bro ....");
        }
        System.out.println("Multiplication is --> "+(a*b));
    }
    static void div(double a, double b) throws ArithmeticException 
    {
        if(b==0)
        {
            throw new ArithmeticException("Cannot Divide by zero bro....");
        }
        System.out.println("Division  is --> "+(a/b));

    }
    static void add(double a, double b)
    {
         System.out.println("Addition is --> "+(a+b));
    }
    static void sub(double a, double b)
    {
        System.out.println("Substraction is --> "+(a-b));
    }
    }




