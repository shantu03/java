package Harry;

interface Gfather {
    void anger();

}

interface Gmother extends Gfather{
     default void selfiness() {
        System.out.println("Selfiness form grandmother");
    }
}

interface  Father extends Gmother {
    default void anger() {
        System.out.println("Anger from grandfather");
    }
     void kindness();
}

 interface  Mother extends Father {
     void Beauty();
}

class child implements Mother {
    public void kindness() {
        System.out.println("Kindness form father");
    }

    public void Beauty() {
        System.out.println("Beauty from Mother");
    }
}
public class Interface_practice {
    public static void main(String[] args) {
        child shantu =new child();
        shantu.anger();
        shantu.selfiness();
        shantu.kindness();
        shantu.Beauty();
    }
}