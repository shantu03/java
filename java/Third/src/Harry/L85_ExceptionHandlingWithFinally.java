package Harry;
public class L85_ExceptionHandlingWithFinally {
    static int  divide() {
        try {
            int c = 7 /new java.util.Random().nextInt(6);
            return c;
        } catch (Exception e) {
            System.out.println("Exception occured "+e);
        }
        finally {
            System.out.println("WIth finally block END OF DIVIDE METHOD\n\n");
        }
        System.out.println("Without finally block ");
        return 0;
    }
    public static void main(String[] args) {
        int [] b=new int[5];
        int [] f=new int[5];
        int [] d=new int[5];
        int [] c=new int[5];
        for (int i = 0; i <5; i++) {
            b[i]=i;
            c[i]=i+5;
            d[i]=i+30;
            f[i]=i+70;

        }
        try {
            add(b, c, d, f);
        } catch (Exception e) {
            System.out.println("Exception found in add METHOD ");
            System.out.println(e);
//            e.printStackTrace();

        }
        finally {
            System.out.println("FINALLY BLOCK OF ADD METHOD \n\n");
        }

        System.out.println(divide());

        System.out.println("END OF THE PROGRAM ");

    }

    public static void add(int[]...a) throws Exception {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf(" %d ",a[i][j]);
            }
            System.out.println();
        }
        throw new Exception("\nThis is user defined exception but there is no error occured "+"\nEND OF THE ADD METHOD\n\n");
    }
}
