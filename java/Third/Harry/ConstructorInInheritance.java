package Harry;

class Base {
    public Base() {
        System.out.println("this is base constructor");
    }
    int k;

    public Base(int k) {
        this.k = k;
        System.out.println("this is overloaded constructor in base class");
    }
}

class derived extends Base {
    public derived() {
        super();
        System.out.println("this is derived constructor");
    }

    int x;

    public derived(int x) {
        super(8);
        System.out.println("calling both overloaded consturctor");
        this.x = x;

    }
}

class grandchild extends derived {
    public grandchild() {
        super(9);
        System.out.println("this is grand child constructor");
    }
}
public class ConstructorInInheritance {
    public static void main(String[] args) {
        derived obj =new derived();
        System.out.println("\n");
        grandchild obj2=new grandchild();

    }
}
