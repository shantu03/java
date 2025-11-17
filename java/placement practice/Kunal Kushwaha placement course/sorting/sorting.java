import java.lang.reflect.Array;
import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr[]={25,16,1,5,3,6};

        // new bubble_sort().sort(arr);
        // new selection_sort().sort(arr);

        // new insertion_sort().sort(arr);

        new merge_sort().sort(arr);
       
        System.out.println(Arrays.toString(arr));
    }
}
