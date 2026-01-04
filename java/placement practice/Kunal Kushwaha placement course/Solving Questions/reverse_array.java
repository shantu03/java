public class reverse_array {
    public static void main(String[] args) {
        int arr[]={4,6,9};
        long num=0;

        for(int i=0;i<arr.length;i++)
        {
            num*=10;
            num+=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)num%10;
            num/=10;
        }
        for (int i : arr) {
            System.out.println(i);
        }
       
    }
}
