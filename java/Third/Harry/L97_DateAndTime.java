package Harry;
//PAGE - 32
import java.util.Date;
public class L97_DateAndTime {
    public static void main(String[] args) {
        System.out.println("Time from 1900 to current time --> ");
        System.out.println("Year - "+System.currentTimeMillis()/1000/60/60/24/30/12);
        System.out.println("Month - "+System.currentTimeMillis()/1000/60/60/24/30);
        System.out.println("Day - "+System.currentTimeMillis()/1000/60/60/24);

        Date obj = new Date();
        System.out.println(obj);
        System.out.println(obj.getDate());
        System.out.println(obj.getMonth());
        System.out.println(obj.getSeconds());
    }
}
