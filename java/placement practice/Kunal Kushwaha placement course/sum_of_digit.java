public class sum_of_digit {
    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
    static int sum(int n,int sum)
    {
        sum*=10;
        sum+=n%10;
        

    }
}
