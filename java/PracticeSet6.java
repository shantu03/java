import java.util.HashSet;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;
public class PracticeSet6 
{
    public void q1()
    {
        ArrayList<String> arr=new ArrayList<>();
arr.add("Shantu");
arr.add("Ravi");
for(String i:arr)
{
System.out.println(i);    
}
    }
    public static void q2()
    {
        Date obj=new Date();
        
        System.out.println(obj.getHours()+":"+obj.getMinutes()+":"+obj.getSeconds());
    }
    public static void q3()
    {
        // Calendar ob2j=new Calendar.getInstance();        
        // System.out.println(obj.getTime());
    }
    public static void q4()
    {
        LocalDateTime obj=LocalDateTime.now();
        // System.out.println(obj);
        DateTimeFormatter dt=DateTimeFormatter.ofPattern("kk:mm:ss");
        String date1=obj.format(dt);

        System.out.println(date1);
    }
    public static void q5()
    {
        HashSet<Integer> obj=new HashSet<>();
        obj.add(34);
        obj.add(45);
        obj.add(98);
        obj.add(78);
System.out.println(obj);
        for(int i:obj)
        {
            System.out.println(i);
        }
    }
public static void main(String args[])
{

// q1();
// q2();
// q3();
// q4();
q5();

}
}