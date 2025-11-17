package sorting;
import java.lang.reflect.Array;
import java.util.Arrays;

import arr;

public class cyclic_sort {
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4};
        arr k=new arr();

        int i=0;
        while (i<arr.length) {

            if(i==(arr[i]-1))
            {
                i++;
            }else{
                k.swap(arr, i, arr[i]-1);
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
