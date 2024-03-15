package Harry;

class A{
    void show() {
        System.out.println("In the class A  object is  " + this);
    }
}

class B extends A {
    @Override
    void show() {
        System.out.println("In the Class B  object is  " + this);
    }

    void Bshow() {
        System.out.println("this is private of B  object is  "+ this);
    }
}

class C extends A {
    @Override
    void show() {
        System.out.println("this is C  object is  "+ this);
    }

    void Cshow() {
        System.out.println("this is private of C   object is  "+this);
    }
}
public class DynamicMethodDispath {
    public static void main(String[] args) {
        A obj =new A();
        B obj1=new B();
        C obj2=new C();

        obj.show();
        System.out.println();
        obj1.show();

        System.out.println();
        obj2.show();

        System.out.println();
        obj1.Bshow();

        System.out.println();
        obj2.Cshow();

        System.out.println();
        obj=obj2;
        obj.show();

    }




}
