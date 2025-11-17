import java.util.Arrays;

public class merge_sort {

    public void sort(int arr[]){

            arr= divide(arr);
    }
    public int[] divide(int arr[])
    {
        if(arr.length==1) return arr;

        int mid=arr.length/2;

        int []left=divide(Arrays.copyOfRange(arr, 0, mid));
        int [] right=divide(Arrays.copyOfRange(arr, mid, arr.length));


        return merge(left,right);
    }
    public int[] merge(int left[],int right[])
    {
        int mix[]=new int[left.length+right.length];

        int i=0,j=0,k=0;

        while (i<left.length && j<right.length) {

            if(left[i]<=right[j])
                mix[k]=left[i++];
            else
                mix[k]=right[j++];
            
            k++;
            
        }

        if(i>=left.length)
        {
            for (int k2 = j; k2 < right.length; k2++) {
                mix[k++]=right[k2];
                
            }
        }else{
            for (int k2 = i; k2 < left.length; k2++) {
                mix[k++]=left[k2];
            }
        }


        return mix;
    }
}