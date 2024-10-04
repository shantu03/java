//HERE RECURSION IS TAKING PLACE BUT MEMOIZATION IS NOT DONE 
// IT CAN BE DONE IN TABULATION (BOTTOM UP APPROACH ) 

//THIS IS JUST REFECT OF RECURRANCE RELATION WE WERE GETTING 


import java.util.Scanner;

public class LCS_recurrsion {
    public static void main(String[] args) {
        String a=new Scanner(System.in).next();
        String b=new Scanner(System.in).next();
        System.out.println("LSB = "+ L(a.toCharArray(),b.toCharArray(),a.length()-1,b.length()-1));
    }
        static int count=0;
    static void print(char k[],int i,char y[],int p)
    {
        for (int j = 0; j <= i; j++) {

        System.out.printf("%c",k[j]);
        }
        System.out.print(" ");
        for (int j = 0; j <= p; j++) {
            System.out.printf("%c",y[j]);
        }
        System.out.println();
    }
    static int L(char[]x,char[]y,int i,int j)
    {
        //System.out.println(++count+ " "+ x[0]+ " "+y[0]);
        if(!(i==-1||j==-1))
        {
            print(x,i,y,j);
        }
        if(i==-1||j==-1)
        {
            return 0;
        }

        if(x[i]==y[j])
        {
            return (1+L(x,y,i-1,j-1));
        }else{
            int first=L(x,y,i-1,j);
            int secont=L(x,y,i,j-1);

            if(first>secont)
            {
                return first;
            }else {
                return secont;
            }
        }
    }

}
