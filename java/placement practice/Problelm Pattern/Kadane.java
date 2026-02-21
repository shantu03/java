public class Kadane{
    public static void main(String[] args) {
        int arr[]={-1,5,-2,5,2,9};

        int max=arr[0];
        int currsum=arr[0];


        for (int i = 1; i < arr.length; i++) {
            currsum=Math.max(arr[i],currsum+arr[i]);

            max=Math.max(max, currsum);
        }
        
        currsum=arr[0];
        int min=arr[0];
        
        
                for (int i = 1; i < arr.length; i++) {
                    currsum=Math.min(arr[i],currsum+arr[i]);
        
                    min=Math.min(min, currsum);
                }

                System.out.println(max);
                System.out.println(min);
        
    }
}