package P_Practice;
interface A extends B{
     void show();
}

interface B {
    void show();
}

interface D extends A {
    void show();

}

class C implements A, B ,D{
    @Override
    public void show() {
        System.out.println("Inside teh f ");
    }
}

public class Interface_Practice {
    public static void main(String[] args) {
    C obj=new C();
    obj.show();
    }
}