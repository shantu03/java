package P_Practice;


class dadaso {
    int k;

    public dadaso(int k) {
        this.k = k;
        System.out.println("this is dadaso\t" + this.k);
    }

    public dadaso(float k) {
        System.out.println("floating dadaso  " + k);
    }
}

class saurabh extends dadaso {
    public saurabh(float y) {
        super( y);
        System.out.println("this is saurabh");
    }
}

class unknown extends saurabh {

    public unknown() {
        super((float) 999);
        System.out.println("and this is unknown child");
    }
}
public class InheritancePractice {
    public static void main(String[] args) {
//        saurabh obj = new saurabh(9);
    unknown obj=new unknown();


    }

}
