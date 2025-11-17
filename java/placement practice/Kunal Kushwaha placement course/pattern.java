import java.util.Arrays;

public class pattern {

    public static void main(String[] args) {
        int n=4;

        int arr[][]=new int[n*2-1][n*2-1];


        // for (int i = 0; i < n; i++) {
        //     fill(i,n*2-2-i,arr,n-i);
        // }
        
        int original=n;
       n=2*n-2;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <= n; j++) {

                int atEveryidx=original-Math.min(Math.min(i, j), Math.min(n-i, n-j));

                System.out.printf(atEveryidx + " ");                 
            }
            System.out.println();
            
        }
    }
    public static void print(int arr[][])
    {
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
    }
    public static void fill(int i,int j,int arr[][],int num)
    {
        int a=i;

        while(a<arr.length && a<j )
        {
            arr[a][j]=num;
            arr[j][a]=num;
            arr[i][a]=num;
            arr[a][i]=num;
            a++;
        }
        print(arr);
        System.out.println();

    }

    public static void  sout(){
        System.out.println(); System.out.println();
    }
}