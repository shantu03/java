// my code to this problem ;) 
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Sum_of_Subset{
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),M=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(23)+2;  
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\n Capacity "+M);

        Arrays.sort(arr);
        if(s(arr,arr.length-1,M)==1)
        {
            System.out.println("exists ");
        }else{
            System.out.println("not exists  ");
        }

    }
    static  int s(int arr[],int i,int M)
    {
        if(i==-1||M<=0)
            return 0;
        else if(arr[i]==M)
            return 1;
        else if(arr[i]>M)
            return s(arr,i-1,M);
        else{
            int k=s(arr,i-1,M-arr[i]);
            int p=s(arr,i-1,M);

            return (k<p)?p:k;

        }
        
    }
}
