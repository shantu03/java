import java.util.Random;

public class happynumber {
    public static void main(String[] args) {
        int n=new Random().nextInt(100);
        // int n=19;

        System.out.println("n = "+n);
        int slow=n;
        int fast=n;

        do{
            slow=findsquare(slow);
            fast=findsquare(findsquare(fast));
            System.out.println(slow + "  "+fast);
        }while(slow!=fast);

        if(slow==1) System.out.println("happy");
        else System.out.println("not happy");
}
    private static int findsquare(int n){
        int answer=0;
        while(n>0)
        {
            int rem=n%10;

            answer+=rem*rem;
            n/=10;
        }
        return answer;
    }
}
