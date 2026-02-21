public class sudoko {
    static int solution_count=0;
    public static void main(String[] args) {
        solve(0, 0, new int[9][9]);

    }

    public static void solve(int r, int c, int[][] board){

        for (int i = 1; i < 10; i++) {
            board[r][c]=i;
            if(check(r,c,board)){
                if(c==8){
                    if(r==8){
                        System.out.println("solution No. "+(++solution_count));
                        display(board);
                        return;
                    }
                    solve(r+1,0,board);
                }
                else solve(r,c+1,board);
            }
            board[r][c]=0;
            
        }

    }

    private static void display(int[][] board) {
       for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board.length; j++) {
            System.out.printf("%3d",board[i][j]); 
        }
        System.out.println();
       }
    }

    private static boolean check(int r, int c, int[][] board) {
       int k=r,p=c;
        int ele=board[r][c];
       while(k>0){
        if(board[--k][c]==ele) return false;
       }

       while (p>0) {
        if(board[r][--p]==ele) return false;
        
       }

       for (int i = (r/3)*3; i < (r/3+1)*3; i++) {
        for (int j = (c/3)*3; j < (c/3+1)*3; j++) {
        if(i==r && j==c ) continue;

        if(board[i][j]==ele) return false;
       }
     }
    return true;
    }
    
}
