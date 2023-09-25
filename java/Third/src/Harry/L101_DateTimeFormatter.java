package Harry;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class L101_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt =LocalDateTime.now();
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("'Hello friends this shantu telling you time '\nEEEE dd-MM-yyyy / hh-mm a  ");

        String myDate = dt.format(obj);
        System.out.println(myDate);
    }
}
