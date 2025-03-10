import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int arr2[]={0,0};
        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]+arr[j]==target)
                    {
                        arr2[0]=i;
                        arr2[1]=j;
                        break;
                    }
                }
        
        return arr2;

    }
    public static void main(String[] args)   
    {
        String k=new Scanner(System.in).nextLine();
        String p[]=k.split(",");
        int [] arr =new int[p.length-1];
        int target=0;
        for(int i=0;i<arr.length+1;i++)
        {   if(i!=arr.length)
                 arr[i]=Integer.parseInt(p[i].replaceAll("[\\D]",""));
            else
                target=Integer.parseInt(p[i].replaceAll("[\\D]",""));
        }
        int result[]=twoSum(arr,target);

        List<Integer> alist=new ArrayList<>();
        for(int i:result)
        {
            alist.add(i);
        }
        System.out.println(alist);
    }
}