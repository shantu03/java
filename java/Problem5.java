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
    public void addition(int row, int column, int a, int b)
    {
        this.a[row][column]=a+b;
    }
    public void multiplication(int row,int column,int a,int b)
    {
        this.a[row][column]=a*b;
    }



}

public class Problem5 {
    public static void main(String[] args) {

        String play;
        String tab;
        do {
            Matrix[] obj = new Matrix[3];
            int k=new Random().nextInt(5)+2;
            int y=new Random().nextInt(5)+2;
            for (int i = 0; i < 3; i++) {
                obj[i] = new Matrix();
            
                obj[i].setRow(k);
                obj[i].setColumn(y);
                obj[i].arrayMemory();
                if (i == 2) {
                    continue;
                }
                obj[i].setArray();
            }

            do {

                for (int i = 0; i < 2; i++) {
                    obj[i].printArray(i + 1);
                }

                while (true) {
                    System.out.println("ENTER 'add' FOR ADDITION\t'mul' FOR MULTIPLICATION\t'sub' FOR SUBSTRACTION\t'div' for DIVISON");
                    String choice = new Scanner(System.in).next();
                    if (choice.equals("add")) {
                        if ((obj[0].getRows() == obj[1].getRows()) && (obj[0].getColumns() == obj[1].getColumns())) {
                            System.out.println("\nPERFORMING ADDITION : ");
                            for (int i = 0; i < obj[0].getRows(); i++) {
                                for (int j = 0; j < obj[0].getColumns(); j++) {
                                    obj[2].addition(i, j, obj[0].give(i, j), obj[1].give(i, j));
                                }
                            }
                            obj[2].printArray(3);
                        } else {
                            System.out.println("\nMatrices cannot be added");
                        }
                        break;
                    } else if (choice.equals("mul")) {
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
                        System.out.println("WRONG OPTION SELECTED  ");
                    }
                }
                while(true)
                {
                    System.out.println("*** Do you wish to Play again \"yes\" or \"no\" *** ");
                    play = new Scanner(System.in).next();
                    play = play.toLowerCase();
                    if(play.equals("yes"))
                    {
                        break;
                    }
                    else if(play.equals("no"))
                    {
                        break;
                    }
                    else {
                        System.out.println("WRONG OPTION SELECTED   ");
                    }

                }

                if (play.equals("yes")) {
                    while (true) {
                        System.out.println("***Do you wish to Play with Same array \"yes\" or \"no\" ***  ");
                        tab = new Scanner(System.in).next();
                        tab = tab.toLowerCase();

                        if (tab.equals("yes")) {
                            System.out.println("PLAYING WITH EXISTING ARRAY");
                            break;

                        } else if (tab.equals("no")) {
                            System.out.println("CREATING NEW ARRAYS ");
                            break;

                        } else {
                            System.out.println("WRONG OPTION SELECTED");
                        }
                    }
                }
                else {
                    tab="no";
                }

            } while (tab.equals("yes"));
        } while (play.equals("yes"));
    }
}

