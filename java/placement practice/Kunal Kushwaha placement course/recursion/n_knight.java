public class n_knight {
    public static void main(String[] args) {
                long p=System.currentTimeMillis();
        int n=5;

        System.out.println(knight(new boolean[n][n],0));
    }
    public static void printo(boolean arr[][]){

        for (boolean[] bs : arr) {
            for (boolean k : bs) {
                if(k) System.out.print("K ");
                else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }
     public static int knight(boolean arr[][],int row,int col)
{
    if (row==arr.length){
        printo(arr);
        return 1;
    }
    int count=0;
    
    for (int i = 0; i < arr.length; i++) {
        
        if(check(arr,i,row)) 
        {
            arr[row][i]=true;
            
            count+=knight(arr, row,col+1);
            
            arr[row][i]=false;
        }

    }
    return count;

}

 private static boolean check(boolean[][] arr, int col, int row) {
        

        if(col-2>=0 && row-1>=0){
            if(arr[row-1][col-2]) return false;
        }
        if(col+2<arr.length && row-1>=0){
            if(arr[row-1][col+2]) return false;
        }
        if (row-2>=0) {
            if(col-1>=0)
            if(arr[row-2][col-1]) return false;
            if(col+1<arr.length)
            if(arr[row-2][col+1]) return false;
            
        }

        return true;
    }
}
