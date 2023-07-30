
/*
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices
TRICK WE ARE USING RANDOM CLASS
*/

import java.util.Random;
import java.util.Scanner;

class Matrix {
    private int rows;
    private int columns;
    public int[][] a;
    int k=0;


    public void setRow(int row) {
        this.rows = row;
    }

    public void setColumn(int column) {
        this.columns = column;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void arrayMemory() {
        a = new int[this.rows][this.columns];
    }

    public void setArray()
    {
        for(int i=0;i<this.rows;i++)
        {
            for(int j=0;j<this.columns;j++)
            {
               a[i][j]=new Random().nextInt(10)+1;
            }

        }
    }
    public int give(int a,int b)
    {
        return this.a[a][b];
    }

    public void printArray(int count)
    {

        System.out.println("Array " + count);
        for(int i=0;i<this.rows;i++)
        {
            for(int j=0;j<this.columns;j++)
            {
                System.out.printf(" %3d ",a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public void addtion(int row,int column,int a,int b)
    {
        this.a[row][column]=a+b;
    }
    public void multiplication(int row,int column,int a,int b)
    {
        this.a[row][column]=a*b;
    }



}

public class Problem5{
    public static void main(String[] args)
    {

        String play;
        do {
            Matrix obj[]=new Matrix[3];
            for(int i=0;i<3;i++)
            {
                obj[i]=new Matrix();
                obj[i].setRow(3);
                obj[i].setColumn(4);
                obj[i].arrayMemory();
                if(i==2)
                {
                    continue;
                }
                obj[i].setArray();
            }
            for(int i=0;i<2;i++)
            {
                obj[i].printArray(i+1);
            }

            while (true) {
                System.out.println("Enter 1 for additon and 2 for multiplication");
                int choice = new Scanner(System.in).nextInt();
                if (choice == 1) {
                    if ((obj[0].getRows() == obj[1].getRows()) && (obj[0].getColumns() == obj[1].getColumns())) {
                        System.out.println("\nPERFORMING ADDTION : ");
                        for (int i = 0; i < obj[0].getRows(); i++) {
                            for (int j = 0; j < obj[0].getColumns(); j++) {
                                obj[2].addtion(i, j, obj[0].give(i, j), obj[1].give(i, j));
                            }
                        }
                        obj[2].printArray(3);
                    } else {
                        System.out.println("\nMatrices cannot be added");
                    }
                    break;
                } else if (choice == 2) {
                    if ((obj[0].getRows() == obj[1].getRows()) && (obj[0].getColumns() == obj[1].getColumns())) {
                        System.out.println("\nPERFORMING MULTIPLICATION : ");
                        for (int i = 0; i < obj[0].getRows(); i++) {
                            for (int j = 0; j < obj[0].getColumns(); j++) {
                                obj[2].multiplication(i, j, obj[0].give(i, j), obj[1].give(i, j));
                            }
                        }
                        obj[2].printArray(3);
                    } else {
                        System.out.println("\nMatrices cannot be multiply");
                    }
                    break;
                } else {
                    System.out.println("Wrong option selected");
                }
            }
            System.out.println("To play again enter \"yes\" ");
            play=new Scanner(System.in).next();
            play=play.toLowerCase();
        }while(play.equals("yes"));
    }
}

