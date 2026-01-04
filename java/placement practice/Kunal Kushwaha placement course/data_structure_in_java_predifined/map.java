import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        
        Map<Integer,Integer> k=new HashMap<>();

        k.put(2, 9);
        k.put(212, 9123890);

        System.out.println(k.get(9));
        System.out.println(k);

        System.out.println("enter boolean");

        boolean kk=new Scanner(System.in).nextBoolean();
        
        System.out.println(kk);
    }
}
