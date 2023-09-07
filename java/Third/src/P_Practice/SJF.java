package P_Practice;

import java.util.Objects;
import java.util.Scanner;

public class SJF {
    static void show(int[] burst, int[] process) {
        int sum=0;
        int wt[] = new int[burst.length];
        System.out.println("Process\tBrust Time\tWaiting Time");
        for (int i = 0; i < burst.length; i++) {
            wt[i]=sum;
            System.out.println("  P"+process[i]+"\t\t"+burst[i]+"\t\t\t"+sum);
            sum+=burst[i];
        }
        sum=0;
        for (int i = 0; i < wt.length; i++) {
            sum+=wt[i];
        }
        System.out.println("Turnarount Timt = "+sum +"\tAverage Waiting Time = "+((float)sum/burst.length)+"\n\n");
    }

    static void sjf(int[]burst,int[]process) {      //Jr obj[][] ne kell tr static int[][] sjf ass yenar

        for (int i = 0; i < burst.length; i++) {
            for (int j = 0; j < burst.length-1; j++) {
                if (burst[j] > burst[j + 1]) {
                    int temp=burst[j];
                    burst[j] = burst[j + 1];
                    burst[j+1]=temp;
                    int temp2=process[j];
                    process[j] = process[j + 1];
                    process[j + 1]=temp2;
                }
            }
        }

        show(burst,process);
/*        int[][] obj = {burst,process};
        return obj;*/
    }

    public static void main(String[] args) {
        System.out.println("Enter number of processes ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int [] burst=new int[num];
        int[] process = new int[num];
        for (int i = 0; i < num; i++) {
            process[i]=i+1;
            System.out.println("Enter brust time for P"+process[i]);
            burst[i]=sc.nextInt();
        }

        show(burst, process);
        sjf(burst,process);
/*        int [][]obj=sjf(burst, process);          //He sagll na karta fakt sjf method madun show la call kruya
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj[0].length; j++) {
                if (i == 0) {
                    burst[j] = obj[i][j];
                } else {
                    process[j]=obj[i][j];
                }
            }

        }
        show(burst,process);
        */

    }
}
