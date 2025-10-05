import java.util.Scanner;

public class exception_handling {
    public static void main(String[] args)  throws ArithmeticException{
        System.out.println("helo boss");
        int i=new Scanner(System.in).nextInt();
        int j=new Scanner(System.in).nextInt();
        double p=-i/(float)j;
        System.out.println(p);
    }
}
