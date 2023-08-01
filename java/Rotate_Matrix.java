// Related matrix example is in Problem5.java
import java.util.Random;
class Rotate
{
private int row;
private int column;
 int arr[][];
 int right[][];
 int left[][];

 public void rotateLeft()
 {
     System.out.println(this.column + "\t" + this.row);
 left=new int[this.column][this.row];
     for (int i=this.column-1,a=0;i>=0;i--,a++) {
         for (int j=0,b=0;j<this.row;j++,b++) {
             left[a][b]=arr[j][i];
         }
     }
 }




public void rotateRight()
{
    int row=this.column;
    int column=this.row;
right=new int[this.column][this.row];
    for (int i = 0, a = 0; i < this.column; i++, a++) {
        for (int j = this.row - 1, b = 0; j >= 0; j--, b++) {
            right[a][b]=arr[j][i];
        }
    }


}










public void assign()
{
this.row=new Random().nextInt(4)+2;
this.column=new Random().nextInt(4)+2;
arr=new int[this.row][this.column];
for(int i=0;i<this.row;i++)
{
for(int j=0;j<this.column;j++)
{
this.arr[i][j]=new Random().nextInt(50)+1;
}
}

}

public void printarr(int[][] a, String status)
{
System.out.println("\n"+status.toUpperCase()+" : ");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[0].length;j++)
{
System.out.printf(" %3d ",a[i][j]);
}
System.out.println();
}
System.out.println();
}

}


public class Rotate_Matrix
{
public static void main(String[] args)
{
Rotate obj=new Rotate();
obj.assign();
obj.printarr(obj.arr,"original");
obj.rotateRight();
obj.printarr(obj.right,"right shifted");
obj.rotateLeft();
obj.printarr(obj.left,"left shifted");
}
}