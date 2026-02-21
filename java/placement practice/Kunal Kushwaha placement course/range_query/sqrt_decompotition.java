import java.util.Arrays;

public class sqrt_decompotition {
    public static void main(String[] args) {
        
        int nums[]={1,3,5,2,7,6,3,1,4,8};

        int n=nums.length;
        int blocksize=(int)Math.floor(Math.sqrt(n));
        int clusters=(int)Math.ceil(Math.sqrt(n));
        
        int blocks[]=new int[clusters];
        for (int i = 0; i < nums.length; i+=blocksize) {
            int sum=0;
            for (int j = i; j < i+blocksize; j++) {
                if(j<nums.length)
                sum+=nums[j];
                
                
            }

            blocks[i/blocksize]=sum;
            
        }

        int st=2;
        int en=8;

        int lf=st;
        int rt=en;
        int sum=0;

        while(lf!=0 && lf%blocksize!=0 && lf<rt)
        {
            sum+=nums[lf++];
        }
        while(lf+blocksize < rt)
        {
                sum+=blocks[lf/blocksize];
                lf+=blocksize;
        }
        while (lf<rt) {
            sum+=nums[lf];
            lf++;
        }

        System.out.println(sum);

        System.out.println(Arrays.toString(blocks));
    }

    
}