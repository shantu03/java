import java.util.Comparator;
import java.util.List;
public class list {
    public static void main(String[] args) {
        java.util.List<Integer> list=new java.util.ArrayList<>();
        list.add(23);
        list.add(55);
        list.add(25);

        System.out.println(list.removeLast());
        System.out.println(list);

        }
    
}
