package Harry;

import P_Practice.StaticKeywordPractice;

public class StaticKeyword{

    public static void main(String[] args) {
//        page 24-25
        StaticKeywordPractice obj =new StaticKeywordPractice();
        obj.msg();
        StaticKeywordPractice.msg2();
        newclass.show();
       newclass.i=12;
        System.out.println("after changing value of i in main method : ");
        newclass.show();
        System.out.println("creating newclass object and assining value of i as 43");
        newclass object =new newclass();
        object.i=43;

        System.out.println("creating another new object and assiging value of i as 65 ");
        newclass object2=new newclass();
        object2.i=65;
        object2.show();
        object.show();
    }
}
class newclass{
    static {
        System.out.println("\n\n\ninside newclass");
    }
     static int i=99;

    static void show()
    {
        System.out.println("value of i after preincrement is : " + ++i);
    }
}