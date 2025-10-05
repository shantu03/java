import java.util.HashSet;
import java.util.Set;

public class set {

    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
set.add(82);
System.out.println(set.add(85));
System.out.println(set.contains(821));
System.out.println(set);
System.out.println(set.containsAll(set));
System.out.println(set.hashCode());
System.out.println(set.hashCode());
java.util.Set<Integer> set2=new java.util.HashSet<>();
System.out.println(set2.hashCode());
set2.addAll(set);
set2.add(2);

System.out.println(set2.remove(12));
System.out.println(set2.hashCode());

System.out.println(set2);
Set<Integer> set3=new HashSet<Integer>() {
    
};
for(int i=0;i<10;i++)
{
    set3.add(i);
}
System.out.println(set3);
set3.add(29);
System.out.println(set3);
set3.add(39);
System.out.println(set3);





}
}
