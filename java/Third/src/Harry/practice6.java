package Harry;

import java.util.Random;
import java.util.Scanner;
//ARRAY practice
public class practice6 {
    public static void main(String[] args) {
        que1();
        que2();
        que3();
        myself();
        que8();
        myself2();
    }

    static void myself2() {//bubble sort ahe he
        int[] arr = {11, 4, 3, 2, 6, 7, 16, 21, 5};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.printf(" %d ", i);
        }

    }

    static void que8() {
        boolean status = true;
        int[] arr = {0, 2, 5, 21, 55, -332};
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            if (i == arr.length - 1) {
                j--;
            } else if (arr[i] > arr[j]) {
                status = false;
            }


        }
        System.out.println("sorted array : " + status);
    }

    static void myself() {
        for (int i = 0, count = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 2) {
                    System.out.println(i);
                    count = 0;
                    return;

                }
                count++;
                System.out.println(i + " " + count);
            }
        }
    }

    static void que3() {
//        que 3 :- find maximum in array

        System.out.println("Finding maximum and minmum in random array[25]  from 0-100 numbers: ");
        int[] arr = new int[25];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println("\nMaximum : " + max + "  Minimum : " + min + "\n Array :-->");
        for (int i : arr) {
            System.out.printf(" %d, ", i);
        }

    }

    static void que2() {
//     que 2 :- take number from user check it in your array

        System.out.println("enter number to find in Random array 0-25 ; ");
        int k = new Scanner(System.in).nextInt();

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(25);
        }

        for (int i : arr) {
            if (k == i) {
                System.out.println("Succesfully found ");
                break;
            } else if (i == arr[arr.length - 1]) {
                System.out.println("Cant find it ");
            }

        }
        System.out.println("Array is -->");
        for (int i : arr) {
            System.out.printf(" %d, ", i);
        }
    }

    static void que1() {
//        que 1 :- sum of 5 mark
        System.out.println("enter five mark to get their sum");
        float[] arr = new float[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextFloat();
        }
        float sum = 0;
        for (float v : arr) {
            sum = sum + v;
        }
        System.out.println(" -: " + sum);

    }
}


