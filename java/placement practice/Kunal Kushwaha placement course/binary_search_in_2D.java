public class binary_search_in_2D {
    public static void main(String args[])
    {
    // int arr[][]={{1,3,4},{13,15,19},{33,44,55}}; // fully sorted array
    
    int arr[][]={{10,20,40,50},{11,23,41,55},{13,23,61,78}};
    
    System.out.println(sorted_row_and_column_wise(arr,50));
    
    }
    public static boolean sorted_row_and_column_wise(int arr[][],int target)
    {
        // HERE EACH ROW IS SORTED AND EACH COLUMN IS SORTED BUT THERE IS NO RELATION I.E FULLY SORTED 

        int row=0;
        int col=arr[0].length-1;

        while(row<arr.length && col>=0)
        {
            if(target==arr[row][col])
            {
                return true;
            }else if(arr[row][col]>target){
                col--;
            }else row++;
        }


        return false;
    }

    public static boolean sorted_array(int arr[][],int target)
    {
            int m=arr.length;
        int n=arr[0].length;
    int st=0;
    int en=m*n-1;
 
    while(st<=en)
    {
        int mid=(en-st)/2+st;
        System.out.println(arr[mid/m][mid%m]);
        if(arr[mid/m][mid%m]==target)
        {
            return true;
        }else if(arr[mid/m][mid%m]<target)
        {
            st=mid+1;
        }else en=mid-1;
    }
    return false;
    }
}