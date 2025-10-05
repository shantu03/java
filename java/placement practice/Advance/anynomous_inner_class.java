public class anynomous_inner_class {
    public static void main(String[] args) {
        A obj=new A(){
            public static void sshow(){
                System.out.println("hello darling ");
            }
            public void show(){
                System.out.println("this modified show method");
            }
        };
        obj.show();

    }
}
class A{
    public void show()
    {
        System.out.println("here's the show method ");
    }
}