// hackerearth --> https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/maximum-border-9767e14c/
import java.util.Scanner;
import java.util.*;
class solution3 {
    public static void main(String args[] ) throws Exception {
    Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    int[] result=new int[test];
    int count=0;
    while(test>0){
        test--;
    int row=sc.nextInt();
    int col=sc.nextInt();
    char arr[][]=new char[row][col];
    for(int i=0;i<row;i++)
    {
        String s=sc.next();
        for(int j=0;j<col;j++)
        {
            arr[i][j]=s.charAt(j);
        }
    }

    result[count++]=(S(arr,0,0));
    }
    for (int i : result) {
        System.out.println(i);
    }
}
   static int S(char arr[][],int i,int j)
    {
        if((i>=arr.length || j>=arr[0].length))
        {
            if(i>=arr.length) i--;
            else j--;

            if(arr[i][j]=='#')
                return -1;
            else
                return 0;
        }
        if(arr[i][j]=='#')
        {
            return Math.max(S(arr,i+1,j)+1,S(arr,i,j+1)+1);
        }
        else return Math.max(S(arr,i+1,j),S(arr,i,j+1))-1;
    }
}

