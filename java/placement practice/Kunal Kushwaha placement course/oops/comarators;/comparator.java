import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Gatherer.Integrator;

public class comparator {


    public static void main(String[] args) {
        Comparator<Integer> sort=new Comparator<Integer>() {
            public int compare(Integer one,Integer two)
            {
                if(one>two) return 1;
                else return -1;
            }
        };

        Comparator<Integer> com =(s1,s2)-> (s1>s2)?1:-1;




        List<Integer> arr=new ArrayList<>();
        arr.add(15);
        arr.add(26);
        arr.add(84);
        arr.add(234);
        arr.add(06);

        System.out.println(arr);
        Collections.sort(arr,com);
        System.out.println(arr);


        Comparator<Human> sorting=(a,b)->(a.age>b.age)?1:-1;

        Exception k;
        ArithmeticException p ;
        
    }
}