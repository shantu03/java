package Harry;



public class MethodOverloading {
    public static void main(String[] args) {
//        page 25-27
        int x=1;
        changeint(x);
        System.out.println(x);          //this didn't change at all; call by refernce zalay
        int[] x_array={3,43,2,76,2,3,46,2};
        changearray(x_array);                   //value changed here;because we pass reference of array which is stored under x_array variable
        System.out.println(x_array[0]);


        System.out.println("\n\n\n\n\nMETHOD OVERLOADING");
        shantu();
        System.out.println("\n" + shantu(1) + "\n");
        System.out.println(shantu(1.0f)+ "\n");
        System.out.println(shantu(1.0d)+ "\n");
        System.out.println(shantu('x')+ "\n");
        System.out.println(shantu("hello")+ "\n");
        System.out.println("we can do different type of method overlaoding as we learn early languages");
    }
static void shantu(){
    System.out.println("void type -- no parameter");
}
static boolean shantu(String a){
    System.out.println("boolean type -- single parameter(String)");
        return true;
}
static int shantu(int a){
    System.out.println("int type -- single parameter(int)");
return 0;
    }
    static float shantu(float a)
    {
        System.out.println("float type --- single parameter(flaot) ");
        return 0.0f;
    }
    static double shantu(char a)
    {
        System.out.println("double type -- single parameter(char)");
        return 0.0d;
    }
    static char shantu(double a)
    {
        System.out.println("char type --- single parameter(double)");
        return 'a';
    }



    static void changearray(int[] a){
        a[0]=69;
    }
    static void changeint(int a)//yaa madhe 'x' chi copy bante 'a' madhe; real value change hott nahi 'x' chi
    {
        a=69;
    }
}
