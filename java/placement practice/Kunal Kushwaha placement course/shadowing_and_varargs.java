import java.util.Arrays;

public class shadowing_and_varargs {
    static int x=99;
    public static void main(String[] args) {
        System.out.println(x);
        int x=12;
        System.out.println(x); // this is shadowing 

        System.out.println();

        varargss(new int[]{1,46,23});

        multiple(x, x, "shantanu","ravi","mahesh");
    }

    static void varargss(int ... arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    static void multiple(int a,int b,String ...arr)
    {
        System.out.println("a + b = "+(a+b)+" arr = "+Arrays.toString(arr));
    }
}
