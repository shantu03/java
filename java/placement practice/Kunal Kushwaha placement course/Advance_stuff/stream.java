import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<>(Arrays.asList(12,5,125,123,25,9));


        System.out.println(list.stream().filter(e->e%2==0).collect(Collectors.toList()));

        List<Character> list2=new ArrayList<>();
        list2.add('y');
        list2.add('i');
        list2.add('9');

        System.out.println(list2.stream().collect(Collectors.toList()));
        

        
    }
}
