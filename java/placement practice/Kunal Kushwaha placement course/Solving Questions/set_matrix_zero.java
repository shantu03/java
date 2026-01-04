import java.util.*;
public class set_matrix_zero {
    public static void main(String args[])
    {
    int matrix[][]={{0,1,2,0},{3,4,5,2},{1,1,1,8}};

    

        // mySolution(matrix);

        int x[]=new int[matrix.length];
        int y[]=new int[matrix[0].length];



        
        
                for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    System.out.print(matrix[i][j]+" ");

                    if(matrix[i][j]==0) 
                    {
                        x[i]++;
                        y[j]++;
                    }
                }
                System.out.println();
            }

System.out.println();
System.out.println();
        for(int i=0;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    if(x[i]>0||y[j]>0) matrix[i][j]=0;
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }













    }

















    public static void mySolution(int matrix[][])
    {
        List<int[]> list =new ArrayList<>();

    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]==0) list.add(new int[]{i,j});

                        System.out.print(matrix[i][j]+" ");

        }
                System.out.println();

    }
System.out.println();
System.out.println();
    for(int[]k:list)
    {
        fun(matrix,k[0],k[1]);
    }

    for(int i=0;i<matrix.length;i++)
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    }
    public static void fun(int[][] arr,int m,int n )
    {
        // left 
        int left=n;
        
        while(left>=0){
            arr[m][left]=0;
            left--;
        }
        // right
        int right=n;
        while(right<arr[0].length)
        {
            arr[m][right++]=0;
        }
        // up
        int up=m;
        while(up>=0) arr[up--][n]=0;
        // down

        int down=m;
        while(down<arr.length) arr[down++][n]=0;

    }
}