package P_Practice;

import java.util.Random;
public class QuickSort {
    static int[][] arr;
    static int [][]sorted;
    public static void main(String[] args) {
//        assign();
        practice();
        print();
        quick();
    }

    static void quick() {
//        sorted=new int[][];
        for (int i = arr.length; i > 0; i--) {
            for (int j = arr[0].length; j > 0; j--) {
                if (arr[i][j] < arr[i][j - 1]) {
                    arr[i - 1][j] = arr[i][j];
                } else {
                    arr[i-1][j]=arr[i][j-1];
                }
            }
        }
    }

    static void practice() {
        arr[0] = new int[]{4, 2, 5, 12, 16, 22, 52, 11, 6};
        arr[1]=new int[arr[0].length];
    }

/*    static void assign() {
        arr=new int[new Random().nextInt(9)+4];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(15)+2;
        }
    }*/
    static void print()
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf(" %3d ",arr[i][j]);
            }
        }
    }
}
