public class count_occarance {
    public static void main(String[] args) {
        long num=1234567890123456789L;
        int target=7;
        int count=0;
        while(num!=0)
        {
            if(num%10==target) count++;
            num/=10;
        }
        System.out.println(count);
    }
}
