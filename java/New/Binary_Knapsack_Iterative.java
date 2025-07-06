
// TOP DOWN APPROACH 
import java.util.Random;
class Binary_Knapsack_Iterative {
    public static void main(String[] args) {
        int n=7;

        int M=20;
        
        System.out.println("Binary KnapSack Problem : \n"+
        "Number of Items : "+n+"\t Capacity : "+ M+"\n\n");
        float arr[][]=new float[n][4];
        Random r=new Random();
        for(int i=0;i<n;i++)
{
                
                
                arr[i][0]=i+1;
                arr[i][1]=r.nextInt(43)+2;
                arr[i][2]=r.nextInt(10)+5;
                arr[i][3]=(arr[i][1]/arr[i][2]);

            }
        for(int i =0;i<n;i++)
        {
            System.out.println("item : "+(int)arr[i][0]+
                "\tprofit :"+arr[i][1]+"\t weight :"+arr[i][2]+"\t piwi "+arr[i][3]);
        }
            
            java.util.Arrays.sort(arr,java.util.Comparator.comparingDouble(a -> a[3]));
        

        
    
          
        int profit=0;
        int i=n-1;
        int selected[]=new int[n];
        int j=0;
        while(M>(-1)&&i>=0)
        {
            

                if(M>arr[i][2])
                {
                    M-=arr[i][2];
                    profit+=arr[i][1];
                    selected[j]=(int )arr[i][0];
                    j++;
                }
        i--;
        }
                
                
        System.out.print("\n Total Profit : "+profit +"\tremaingin capacity : " +M+"\nSelected Objects : ");
        
        for(int ii : selected)
        {
            if(ii==0)
                break;
            System.out.print(" "+ii);
        }
        
    }
}
