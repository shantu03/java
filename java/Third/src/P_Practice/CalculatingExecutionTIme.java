package P_Practice;
import java.util.Scanner;
import java.time.Instant;
import java.time.Duration;
public class CalculatingExecutionTIme {
    void display() {
        int i=1;
        while (true) {
            System.out.printf(" %3d ",i++);
            if (i == 10000) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        CalculatingExecutionTIme obj=new CalculatingExecutionTIme();
        long start=System.nanoTime();
        obj.display();
        long end =System.nanoTime();
        System.out.print("\n with nanosecond method\t");
        System.out.println((end-start)/1000);

        double start1=System.currentTimeMillis();
        obj.display();
      int k=new Scanner(System.in).nextByte();
        double end1=System.currentTimeMillis();
        System.out.println("\nWith millis second method\t"+ ((end1-start1)/1000));



        Instant start2= Instant.now();
        obj.display();
       int p=new Scanner(System.in).nextByte();
        Instant end2= Instant.now();

        System.out.println("\nWith Instant class and Duration class a\t"+Duration.between(end2,start2).toString());
    }

}
