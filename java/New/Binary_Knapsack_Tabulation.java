import java.util.Random;

public class Binary_Knapsack_Tabulation{
    public static void main(String args[])
    {
        int n=5+1;
        int m=8;
        int p[]=new int [n];
        int w[]=new int [n];
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                p[i]=0;
                w[i]=0;
                continue;
            }
            p[i]=new Random().nextInt(23)+2;
            
            w[i]=new Random().nextInt(6)+1;
            
        }
              for(int i=0;i<n;i++)
        {
            if(i==0)
                continue;
           System.out.println("item: " +(i)+" Profit : "+p[i]+" Weight : "+w[i]);
            
        }
        int obj[][]=new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||j==0)
                {
                    obj[i][j]=0;
                }
                else if(w[i]<=j)
                {
                    obj[i][j]=(obj[i-1][j]>obj[i-1][j-w[i]]+p[i])?obj[i-1][j]:obj[i-1][j-w[i]]+p[i];
                }else{
                    obj[i][j]=obj[i-1][j];
                }
                
            }
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print("  "+obj[i][j]);
            }
            System.out.println();
        }
    }
}
