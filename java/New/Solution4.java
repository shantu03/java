import java.util.Random;
import java.util.Scanner;
public class Solution4 {

    public static void main(String[] args) {
        
        int t=new Scanner(System.in).nextInt();

        while((t--)!=0)
        {
            String str=new Scanner(System.in).nextLine();
            char arr[]=new char[str.length()];
            int fre[]=new int[str.length()];
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                int freq=1;
                for(int j=i+1;j<str.length();j++)
                {
                    
                    if(str.charAt(i)==str.charAt(j))
                    {
                        freq++;
                        
                    }
                }
                arr[count]=str.charAt(i);
                fre[count]=freq;
                count++;
            }
            
            insertion_sort(arr, fre);
            char k=arr[0];
            System.out.println(arr[0]+":"+fre[0]);

            for (int i = 1; i < fre.length; i++) {
                if(fre[i]==0)
                    continue;
                if(arr[i]!=k)
                {
                    System.out.println(arr[i]+":"+fre[i]);
                    k=arr[i];
                }
            }
            }
            

    }
    public static void insertion_sort(char arr[],int fre[])
    {
        for(int i=1;i<arr.length;i++)
        {
            char key=arr[i];
            int key2=fre[i];
            int j=i-1;
            while(j>=0 && ((int)arr[j]>(int)key))
            {
                arr[j+1]=arr[j];
                fre[j+1]=fre[j];
                j--;
            }
            arr[j+1]=key;
            fre[j+1]=key2;
        }

        
    }
    
}
