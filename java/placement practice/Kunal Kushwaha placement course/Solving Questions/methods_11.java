import java.util.Arrays;

public class methods_11 {

    public static void main(String[] args) {
        // int a=19;
        // int b=88;
        


        {
            int z=99;
            // System.out.println("why we are not accesing this block of code/");
            System.out.println(z);

        }
        int z=999;
        System.out.println(z);




        Integer a=19;
        Integer b=88;
        swap(a, b);
        System.out.println(a+"  "+b);

        int arr[]={2,5,1,5,6};
        System.out.println(Arrays.toString(arr));
        array(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void array(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i*12;
        }
    }
    static void swap(int a,int b)
    {
        // int temp=a;
        // a=b;
        // b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
    }
    static void swap(Integer a,Integer b)
    {
        // int temp=a;
        // a=b;
        // b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
    }
}