import java.util.Arrays;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.random.RandomGenerator;

public class Treemap {
    
    public static void main(String[] args) {
        Random r=new Random();

        int arr[]=new int[r.nextInt(30)];

        TreeSet<Integer> treeset=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=r.nextInt(1000);

            treeset.add(arr[i]);
            
        }
        int arr2[]=new int[r.nextInt(30)];
        
        for(int i=0;i<arr2.length;i++)
            {
                arr2[i]=r.nextInt(1000);
                treeset.add(arr[i]);
        }

        System.out.println(Arrays.asList(arr));
        System.out.println(Arrays.asList(arr2));
        System.out.println(treeset);
        System.out.println();


    }
}
