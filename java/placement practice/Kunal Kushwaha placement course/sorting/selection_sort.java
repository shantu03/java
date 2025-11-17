package sorting;
public class selection_sort {
    public void sort(int arr[])
    {
        // for (int i = 0; i < arr.length; i++) {
        //     int min=i;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if(arr[min]>arr[j]) min=j;
        //     }
        //     int temp=arr[i];
        //     arr[i]=arr[min];
        //     arr[min]=temp;

        // }


        for (int i = 0; i < arr.length; i++) {
            int max=i;
            for (int j = arr.length-1-i; j >=0; j--) {
                if(arr[max]<arr[j]) max=j;
            }

            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[max];
            arr[max]=temp;
            
        }
    }
}
