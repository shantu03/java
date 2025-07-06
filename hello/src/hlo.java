public class hlo {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i >0 ; i--) {
                int p=1;
                int m=i/2+1;
            for (int j = 1; j<=n; j++) {
                if(m<=j){

                    System.out.printf("%d ",p++);

                }
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }
}