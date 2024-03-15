package Harry;
//PAGE 30
import java.util.ArrayDeque;
public class ArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr = new ArrayDeque<>(23);
        /*System.out.println(arr.size());
        System.out.println(arr.peekFirst());
        arr.addLast(77);
        arr.addFirst(11);
        System.out.println(arr);
        arr.push(88);
        System.out.println(arr.pop());

        arr.remove(77);
        arr.offerLast(44);

        arr.push(55);

        System.out.println(arr);
        System.out.println(arr.peekFirst());
*/
        arr.pollFirst();
        arr.add(11);
        arr.add(55);
        arr.add(66);
        arr.addFirst(342798);

        System.out.println(arr.peekFirst());
        System.out.println(arr.peekLast());
        System.out.println(arr);

    }
}
