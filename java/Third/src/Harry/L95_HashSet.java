package Harry;

import java.util.HashSet;
import java.util.Iterator;

public class L95_HashSet {
    public static void main(String[] args) {
        HashSet<String> obj = new HashSet(12);
        obj.add("helo");
        obj.add("Cant you wait");

        Iterator<String> it =obj.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        HashSet<String> obj2 = HashSet.newHashSet(5);
        System.out.println(obj.size());
        System.out.println(obj2.size());


    }
}
