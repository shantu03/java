// SUM OF SUMSET


public class recursion_problems1 {

    public static void main(String[] args) {
        int arr[]={4,6,6,3};

        System.out.println(sos(arr, arr.length-1, 11));
    }

    static boolean sos(int a[],int n,int t)
    {

        
        // TOP DOWN APPROACH 

        if(n<0||t<0) return false;
        if(a[n]>t)
        {
            return sos(a,n-1,t);
        }
        if(a[n]==t||t==0) return true;

        return (sos(a, n-1, t) || sos(a, n, t-a[n]));
        



    }
}