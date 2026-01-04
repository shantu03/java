

public class recursion {
    public static void main(String[] args) {


      System.out.println(fibo(6));
    }
     static int fibo(int n) 
    {
            if(n==1) return 1;
            if(n==0)    return 0;
            // System.out.println(n+1);
            return fibo(n-1)+fibo(n-2);

            
 
    }
}