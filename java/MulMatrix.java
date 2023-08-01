
//MULTIPLICATION OF MATRIX

import java.util.*;
class Matrix{
    int [][] arr1;
    int [][] arr2;
    int [][] arr3;
    int k=1;

    public void assign(int same) {
        k=new Random().nextInt(3)+2;
    arr1=new int[k][same];
        k=new Random().nextInt(3)+2;
    arr2=new int[same][k];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                k=new Random().nextInt(5)+1;

                arr1[i][j]=k;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                k=new Random().nextInt(5)+1;
                arr2[i][j]=k;
            }
        }
        k=1;
    }

    public void practice()
    {
        //      ASSIGNING size
        arr1=new int[3][2];
        arr2=new int[2][3];
        arr1[0][0]=3;
        arr1[0][1]=4;
        arr1[1][0]=7;
        arr1[1][1]=2;
        arr1[2][0]=5;
        arr1[2][1]=9;

        arr2[0][0]=3;
        arr2[0][1]=1;
        arr2[0][2]=5;
        arr2[1][0]=6;
        arr2[1][1]=9;
        arr2[1][2]=7;
//        PRINTING
        System.out.println("\nARRYA 1 : "+arr1.length + " x " +arr1[0].length+"\n");
        for (int[] ints : arr1) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.printf(" %3d ", ints[j]);
            }
            System.out.println();
        }
        System.out.println("\nARRAY 2 : " + arr2.length + " x " +arr2[0].length+"\n");
        for (int[] ints : arr2) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.printf(" %3d ", ints[j]);
            }
            System.out.println();
        }

//        MULTIPLICATION
//      ASSIGNING arr3 size
        if (arr1.length > arr2[0].length) {
            arr3 = new int[arr1.length][arr1.length];
        } else {
            arr3=new int[arr2[0].length][arr2[0].length];
        }
        System.out.println("ARRAY 3 : "+arr3.length + " x " + arr3[0].length);

    }


    public void print()
    {
        System.out.println("\nARRYA 1 : "+arr1.length + " x " +arr1[0].length+"\n");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.printf(" %3d ", arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("\nARRAY 2 : " + arr2.length + " x " +arr2[0].length+"\n");
        for (int[] i:arr2) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.printf(" %3d ", i[j]);
            }
            System.out.println();
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
            arr3[i][j]=
            }
        }
    }

}
public class MulMatrix{
    public static void main(String[] args) {
        System.out.println("TO MULTIPLY MATRIX No. OF COLUMN OF 1ARRAY AND No. OF ROW OF 1ST ARRAY SHOULD BE SAME");
//        System.out.println("Enter that value : ");
//        int same=new Scanner(System.in).nextInt();

        Matrix obj=new Matrix();
//        obj.assign(same);
//        obj.print();
        obj.practice();

    }
}