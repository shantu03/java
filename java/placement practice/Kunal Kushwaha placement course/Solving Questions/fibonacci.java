import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        int a=1;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(b);
            int temp=a;
            a=b;
            b=a+temp;
        }
    }
}