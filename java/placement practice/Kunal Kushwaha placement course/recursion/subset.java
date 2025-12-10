// we are creating all possible subset of given array 

import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset {

    public static void main(String[] args) {
    System.out.println("helo");   
    
    int arr[]={1,5,2};
    

        // var list=new recurance().subsets_of_string("", "abc");
        List<Integer> k=new ArrayList<>();

        for (int  n : arr) {
            k.add(n);
            
        }
        var list=new recurance().subsets_Integer(new ArrayList<Integer>(),k );

        System.out.println(list);

    }
}
class recurance{

    public List<List<Integer>> kunal_method(int arr[])
    {

          // KUNAL METHOD ITERATIVE

    List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
    for (int  num : arr) {

        int n=list.size();

        for (int i = 0; i < n; i++) {
            List<Integer> internal=new ArrayList<>(list.get(i));
            internal.add(num);

            list.add(internal);
        }
        
    }
return list;

    }

    


public List<Integer> subsets_Integer(List<Integer> outer,List<Integer> original)
{
    if(original.isEmpty()){
        return outer;
    }
    Integer k=original.remove(0);
    List<Integer> nonconsider=subsets_Integer(outer, original);
    outer.add(k);
    List<Integer> considered=subsets_Integer(outer, original);

    nonconsider.addAll(considered);

    return nonconsider;

    
}








public ArrayList<String> subsets_of_string(String up,String original)
{

    if(original.isEmpty())
    {
        ArrayList<String> re=new ArrayList<>();
        re.add(up);
        return re;
    }
    char c=original.charAt(0);
    ArrayList<String> Consider=subsets_of_string(up+c, original.substring(1));
    ArrayList<String> non_Consider=subsets_of_string(up, original.substring(1));

    Consider.addAll(non_Consider);

    return Consider;


}
}
