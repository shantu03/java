import java.util.Random;

public class Process_Scheduling {
    public static void main(String[] args) {
       // int arr[][]=assign_user();
        int arr[][]=assign_random();
        // int arr[][]={{1,7,1},{2,4,0},{3,3,1},{4,3,0}};

        // Shortest_job_first.srjf(arr);
        // Shortest_job_first.sjf(arr);
        

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
}
