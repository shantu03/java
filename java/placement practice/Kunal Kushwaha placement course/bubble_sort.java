public class bubble_sort {
public void sort(int arr[])
{

    
    for(int pass=0;pass<arr.length;pass++)
    {
        boolean flag=false;
        for(int i=0;i<arr.length-pass-1;i++)
        {
            System.out.println("pass "+(pass+1));
            if(arr[i]>arr[i+1])
            {
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;

                flag=true;
            }
        }
        if(flag==false)
        break;
    }
}
}