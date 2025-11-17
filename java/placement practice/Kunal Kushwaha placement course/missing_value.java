import java.util.ArrayList;
import java.util.List;

public class missing_value {

    public static void main(String[] args) {
        int arr[]={1,5,2,4,0};
        arr k=new arr();
        int i=0;

        List<Integer> list=new ArrayList<>();


        

        while (i<arr.length) {

            if(i==arr[i]-1 || arr[i]== 0)
            {
                list.add(arr[i]);
                i++;
            }
            else k.swap(arr, i, arr[i]-1);
            
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j]==0) System.out.println(j+1);
        }

    }
}