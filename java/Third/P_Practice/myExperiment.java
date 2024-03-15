package P_Practice;

import java.util.Arrays;

public class myExperiment
{
    private int k=5;
    public static void main(String[] args) {
        myExperiment obj=new myExperiment();
        obj.k=4;
        System.out.println("myExperiment.main");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("obj = " + obj);
         int a=99;
         int b=88;
     //   obj.show(a,b);
        System.out.println("a : " + a + " b : " + b);
    }
    void show(int i,int j){
        System.out.println("i : " + i+" j : "+ j);
        i-=30;
        j-=20;
    }
}
