import java.util.ArrayList;
import java.util.List;

public class find_all_duplicates {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        // System.out.println(new Solution().findDuplicates(arr).toString());
        System.out.println(new Solution().perfect_solution(arr).toString());
    }
}

class Solution {
    public List<Integer> perfect_solution(int[] nums)
    {

        List<Integer> list=new ArrayList<>();

        int i=0;

        while(i<nums.length)
        {

            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0) list.add(idx+1);
            nums[idx]=-nums[idx];

            i++;
        }
        list.size();
        return list;

    }


    // public List<Integer> findDuplicates(int[] nums) {
        
    //     List<Integer> list=new ArrayList<>();
    //             int i=0;
    //     while(i<nums.length)
    //     {
    //         if(nums[i]-1==i|| nums[i]==0 ) i++;
    //         else {
    //             if(nums[i]==nums[nums[i]-1]){ list.add(nums[i]); nums[i]=0;}
    //             else swap(nums,i,nums[i]-1);
    //         }
    //     }

    //     return list;
    // }
    //  public void swap(int arr[],int i,int j)
    // {
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    // }
}

