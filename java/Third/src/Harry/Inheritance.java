package Harry;
import java.util.Scanner;
class Class{
    private int roll;
    private String name;
    private float mark;

    public int getRoll() {return roll;}
    public void setRoll(int roll) {this.roll = roll;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public float getMark() {return mark;}
    public void setMark(float mark) {this.mark = mark;}

    void showdata(){
        System.out.println(getName()+ " with roll no. " + getRoll() + " has " + getMark() + " marks ");
    }

    public Class() {
        System.out.println("Created Class - class");
    }
}
class TY extends Class{
    public TY(String name , int roll, float mark) {
        System.out.println("TY class created");
        setName(name);
        setMark(mark);
        setRoll(roll);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TY[] obj =new TY[4];
        for(int i=0;i<4;i++)
        {
            obj[i]=new TY(sc.next(),sc.nextInt(),sc.nextFloat());
        }
//        obj[0]=new TY("shantu",21,78);
//        obj[1]=new TY("ravi",23,28);
//        obj[2]=new TY("avi",28,58);
//        obj[3]=new TY("sanket",24,98);

        for(int i=0;i<4;i++)
        {
            obj[i].showdata();
        }
    }
}