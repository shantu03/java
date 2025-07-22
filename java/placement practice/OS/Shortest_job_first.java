
import java.util.Random;
import java.util.Scanner;

public class Shortest_job_first {
    public static void main(String[] args) {
        // int arr[][]=assign_user();
        // int arr[][]=assign_random();
        int arr[][]={{1,7,1},{2,4,0},{3,3,1},{4,3,0}};
        display(arr);
        System.out.println("\n"+sjf(arr));
        display(arr);
    }
    static void srjf(int arr[][])
    {
        int ct=0;
        while(check(arr))
        {
            int min_bt_idx=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++)
            {
                if(min_bt_idx>arr[i][1] && arr[i][1]>0 && ct>=arr[i][2])
                {
                    min_bt_idx=i;
                }
            }
            if(! (min_bt_idx==Integer.MAX_VALUE))
                {

                    arr[min_bt_idx][1]--;
                }
            ct++;
        }



    }
    static boolean check(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][1]!=0)
             return true;
        }

        return false;
    }

    static int  sjf(int arr[][]) 
    {
        int ct=0;
        for(int j=0;j<arr.length;j++)
        {
           int min_bt=999;
           int min_bt_idx=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(min_bt>arr[i][1]&&arr[i][1]!=0&&ct>=arr[i][2])
            {
                min_bt=arr[i][1];
                min_bt_idx=i;
            }
        }   
        if(min_bt_idx==-1)
        {
            ct++;
            j--;
            continue;
        }
        ct+=min_bt;
        arr[min_bt_idx][1]=0;
        System.out.println("job : "+arr[min_bt_idx][0]);
       }
    return ct;
    }


   


    static int[][] assign_random()
    {
        
        Random sc=new Random();
        int n =sc.nextInt(10)+2;
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=i+1;
            arr[i][1]=sc.nextInt(20)+1;
            arr[i][2]=sc.nextInt(10);
        }
        return arr;
    }




    static int[][] assign_user()
    {
        
        System.out.println("enter number of jobs");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[][]=new int[n][3];
        for(int i=0;i<n;i++)
        {
            arr[i][0]=i+1;
            System.out.println(arr[i][0]+" brust time : ? ");
            arr[i][1]=sc.nextInt();
            System.out.println(arr[i][0]+" arrival  time : ? ");
            arr[i][2]=sc.nextInt();
        }
        return arr;
    }


    static void display(int arr[][])
    {
        System.out.printf("No     Brust Time       Arrival Time  \n"); 
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d %7d %16d\n",arr[i][0],arr[i][1],arr[i][2]); 
        }
    }
}
