public class find_duplicate_number {
    public static void main(String[] args) {
        System.out.println(new Solution().findDuplicate(new int[]{1,3,4,2,2}));
    }
}
class Solution {
    public int findDuplicate(int[] nums) {
        int arr[]=new int[nums.length-1];

      
        for(int i=0;i<nums.length;i++){
            arr[nums[i]-1]++;
            if(arr[nums[i]-1]>=2) return nums[i];
        }

        // for(int i=0;i<nums.length;i++)
        // {
        //     if(arr[i]>=2) return (i+1);
        // }

        return 0;
    }
}