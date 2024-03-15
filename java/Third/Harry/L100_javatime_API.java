package Harry;

import java.sql.SQLOutput;
import java.time.*;

public class L100_javatime_API {
    public static void main(String[] args) {
        LocalTime obj1=LocalTime.now();
        LocalDate obj2= LocalDate.now();
        LocalDateTime obj3=LocalDateTime.now();
        Year obj4=Year.now();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
    }
}
