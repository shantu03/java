public class singleton {

    public static void main(String[] args) {
        
        System.out.println(A.getinstance());
        A obj=A.getinstance();

        System.out.println(obj);

    }
}

class A{
    private A(){
        System.out.println("private constructor");
    }
    public static A obj=new A();

    public static A getinstance(){
        return obj;
    }
}