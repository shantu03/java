package Harry;



interface phone {
    void clock();
    void name();
    void call();
    void music();

    default void company() {
        System.out.println("Realme Company ");
    }

    static void camera() {
        System.out.println("Camera is 12 MP");
    }
}

class shantu implements phone {

    public void clock() {
        System.out.println("Clock");

    }

    public void name() {
        System.out.println("Realme 5i");
    }

    public void music() {
        System.out.println("Playing music ");
    }

    public void call() {
        System.out.println("Calling");
    }


}

public class Interface_practice {
    public static void main(String[] args) {
        shantu obj=new shantu();

        obj.company();
        obj.call();
        obj.clock();
        obj.name();
        obj.music();

        phone obj2=new shantu()
    }

}
