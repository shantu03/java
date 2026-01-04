public class word_search {
    public static boolean checking (char[][ ]board,int i,int j,String word,int ptr)
    {

        int n=board.length;
        int m=board[0].length;

        boolean used[][]=new boolean[n][m];

        while(true)
        {
            if(ptr==word.length()){ 
                return true;
            }
     if(i<(n-1) && board[i+1][j]==word.charAt(ptr) && used[i+1][j]==false)            {
                ptr++;
                i++;
                used[i][j]=true;
                continue;
            }
            if(i>0 && board[i-1][j]==word.charAt(ptr) &&used[i-1][j]==false)
            {
                ptr++;
                i--;
                used[i][j]=true;
                continue;
            }
            if(j>0 && board[i][j-1]==word.charAt(ptr) &&used[i][j-1]==false)
            {
                ptr++;
                j--;
                used[i][j]=true;
                continue;
            }
            if(j<(m-1) && board[i][j+1]==word.charAt(ptr) &&used[i][j+1]==false)
            {
                ptr++;
                j++;
                used[i][j]=true;
                continue;
            }

            return false;
        }

    }
    public static void main(String args[])
    {
        // char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
                    char[][] board={
                        {'C','A','A'},
                        {'A','A','A'},
                        {'B','C','D'}};

        String word="AAB";

        int ptr=0;
        int i=0;
        int j=0;
        outerloop:
        for( i=0;i<board.length;i++)
        {
            innerloop:
            for( j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(ptr))
                {
                    if(checking(board,i,j,word,ptr+1)==true)
                    {
                        System.out.println("true  "+i+" "+j);
                        break outerloop;
                    }

                }
            }
        }
        System.out.println(i+" "+ j);
        

    }
}