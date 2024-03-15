package P_Practice;
public class StaticKeywordPractice{
    static int i;
    int k=0;
static{
    System.out.println("inside Static Block 1");
    System.out.println("value of i "+ i++);

}
public StaticKeywordPractice()
{
    System.out.println("inside Constructor");
}
static {
    System.out.println("inside Static Block 2");
    System.out.println("value of i : " + i);
}

public  void msg()
{
    System.out.println("inside message method");
}public static void msg2()
{
    System.out.println("inside message method 2");
}

    public static void main(String[] args) {
        System.out.println("inside a main methods");
    }
}