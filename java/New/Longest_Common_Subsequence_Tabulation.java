import java.util.Scanner;
//EXAM TRICK
/* L=[i,j]
*   L[i-1,j-1] --> DIAGONAL
*   L[i,j-1]   --->LEFT
*   L[i-1,j]    --->UP
*
*   EXAAM TRICK MATCH ZAL TR DIAGONAL + 1 KARAYCH
*   MATCH NAHI ZAL TR MAX(UP,LEFT) MADLL GHENE
* */
public class Longest_Common_Subsequence_Tabulation {
    public static void main(String[] args) {
        String a="0";
        a+=new Scanner(System.in).next();
        String b="0";
                b+=new Scanner(System.in).next();


        int arr[][]=new int[a.length()][b.length()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i][0]=0;
        }
        for(int i=0;i<arr[0].length;i++)
        {
            arr[0][i]=0;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if(a.charAt(i)==b.charAt(j))
                {
                    arr[i][j]=1+arr[i-1][j-1];
                }else {
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }


            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==0)
                    System.out.printf(" %c ",b.charAt(j));
                else if(j==0)
                    System.out.printf("\n%c ",a.charAt(i));
                else
                    System.out.printf(" %d ",arr[i][j]);

            }
        }

    }
}
