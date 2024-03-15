package Harry;

import java.security.spec.RSAOtherPrimeInfo;

interface animal{
    default void  leg() {
        System.out.println("It has 4 leg");
    }

    void show();
}

@FunctionalInterface
interface people{       //--> for lambda expression
    void gender(int num);
}


/*class tiger implements animal{
    public void nationalAnimal() {
        System.out.println("IT is india national animal ");
    }
}*/
public class L109_JavaAnonymousClass_and_LambdaExpression {
    public static void main(String[] args) {
//    animal obj =new tiger();
//    obj.leg();
//    tiger ob=new tiger();
//
//    ob.nationalAnimal();

    animal o=new animal() {
        @Override
        public void show() {
            System.out.println("this method is in inside of main ");
        }
        @Override
        public void leg()
        {
            System.out.println("Yes it has 4 leg ");
        }
    };

    o.leg();




        Runnable obj2 = () -> System.out.println("Hello this is overridden method using lambda expression ");

        obj2.run();

        people obj =(int p) -> {
            System.out.println("Lambda parammeter"+ p);
        };
        obj.gender(45);
    }
}
