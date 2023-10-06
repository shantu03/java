package Harry;

import java.util.Objects;

class gen<t1,t2>{
    t1 roll;
    t2 name;

    public gen(t1 obj1, t2 obj2) {
        this.roll = obj1;
        this.name = obj2;
    }

    public t1 getRoll() {
        return roll;
    }

    public t2 getName() {
        return name;
    }
}

public class L110_Generics {
    public static void main(String[] args) {
        gen<Integer, String> detail = new gen<>(21, "Shantu");
        System.out.println(detail.getName());

        var obj = new gen[10];
        for (int i = 0; i < obj.length; i++) {
            obj[i]=new gen<>(new java.util.Random().nextInt(34),new java.util.Random().nextInt(67)+34);
        }

        for (var gen : obj) {
            System.out.println(gen.getName() + "  " + gen.getRoll());
        }

        var ob = new gen[2];
        ob[0] = new gen<>(54, "hello");
        ob[1] = new gen<>("shantanu", "hulwan");

        for (var pp : ob) {
            System.out.println(pp.getName()+"\t"+pp.getRoll());
        }
    }
}
