@FunctionalInterface
interface A {

int add(int i,int j);
    
}
@FunctionalInterface
interface B{
    double divide(double i,float j);
    
}
public class lamda_expression {
    public static void main(String[] args) {
        A obj=(i,j)-> i+j;

        System.out.println(obj.add(2,5));


        B objB=(i,j)->{
            System.out.println("this is the power of lambda expression ");
            return i/j;
        };
        System.out.println(objB.divide(3, 5));
    }
}
