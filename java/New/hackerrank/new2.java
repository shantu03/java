import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    if(s.contains("AM"))
    {
        s.replace("AM","1");
        
    }else{
        s.replace("PM", "1");
        int h=0;
        h=s.charAt(0);
        h*=10;
        h+=s.charAt(1);
        s.replace(Integer.toString(h), Integer.toString(h+12));
 }
    return s;
    }

}

public class new2 {
    public static void main(String[] args) throws IOException {
        Scanner bufferedReader=new Scanner(System.in);

        String s = bufferedReader.nextLine();

        String result = Result.timeConversion(s);

        System.out.println(result.replace("AM", "result"));
    }
}
