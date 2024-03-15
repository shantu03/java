package P_Practice;

import java.security.spec.RSAOtherPrimeInfo;

public class L86_PracticeSetOnExceptions {
    public static void main(String[] args) {
        /*
        Q1- WRITE A PROGRAM THA  PRINTS "HAHA" DURING  ARITHMETIC EXCEPTION  AND "HEHE" DURING AN ILLEGAL ARGUMENT EXCEPTION
        */
        q1(8);


        /* VERY INTERESTING TIP IS GIVEN USER IS ALLOWED TO ONLY MAKE 3 MISTAKE */
        qq();
    }

    static void qq() {
        System.out.println("\nEnter size of array");
        int[] arr=new int[new java.util.Scanner(System.in).nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=new java.util.Random().nextInt(45);
        }

        for (int i : arr) {
            System.out.printf(" %d ",i);
        }
        System.out.println();
        int mistake=0;
        while (mistake < 3) {

            System.out.println("Enter index of  array to access elements ");
            int j=new java.util.Scanner(System.in).nextInt();
            try {
                System.out.println(arr[j]);
                break;
            } catch (Exception e) {
                mistake ++;
                System.out.println("\nchance left =  "+(3-mistake));

            }

        }
        





    }
    static void q1(int k) throws IllegalArgumentException {
        try {
            System.out.println(10 / k);
        } catch (ArithmeticException e) {
            System.out.println("HAHA");
        } catch (IllegalArgumentException e) {
            System.out.println("HEHE");
        }
    }
}
