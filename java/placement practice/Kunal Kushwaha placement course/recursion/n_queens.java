public class n_queens {

    public static void main(String[] args) {
        
        long p=System.currentTimeMillis();
        int n=5;

        System.out.println(queen(new boolean[n][n],0));

        
    }

    public static void printo(boolean arr[][]){

        for (boolean[] bs : arr) {
            for (boolean k : bs) {
                if(k) System.out.print("Q ");
                else System.out.print("X ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static int queen(boolean arr[][],int row)
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
            
            count+=queen(arr, row+1);
            
            arr[row][i]=false;
        }

    }
    return count;

}
    private static boolean check(boolean[][] arr, int col, int row) {
        
        // vertical
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][col]) return false;
        }
        // left diagonal 
        for (int j = 1; j <= Math.min(col, row); j++) {
            if(arr[row-j][col-j]) return false;
        }

        // right diagonal
        // System.out.println(col+" "+row);
        for (int i = 1; i <= Math.min(row,arr.length-1-col); i++) {
            if(arr[row-i][col+i]) return false;
        }

        return true;
    }
}