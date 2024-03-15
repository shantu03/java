package Harry;
//PAGE 28
import java.util.Random;
import java.util.ArrayList;


public class L91_ArrayList {
    public static void main(String[] args) {
    ArrayList<Integer> arr=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();ArrayList<Integer> arr3=new ArrayList<>();

        for (int i = 1; i < 20; i++) {
            arr.add(new Random().nextInt(100));
        }        for (int i = 1; i < 20; i++) {
            arr2.add(new Random().nextInt(100)*100);
        }        for (int i = 1; i < 20; i++) {
            arr3.add(new Random().nextInt(100)*111);
        }



        arr.add(new Random().nextInt(arr.size()), 23);
        System.out.println("ADDING 23 AT RANDOM INDEX");
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf(" %d ",arr.get(i));
        }
        System.out.println("\nsize --> "+ arr.size());

        System.out.println("REMOVING SOME NUMBERS FROM THE LIST");
        arr.remove((Integer) 342);
        arr.remove((Integer) 23);
        arr.remove((Integer) 27);
        arr.add(4, 999);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf(" %d ",arr.get(i));
        }
        System.out.println("\nsize --> "+ arr.size());

        System.out.println(arr.indexOf(9939));

        arr.addAll(arr2);
        System.out.println("ADDED NEW COLLECTION TO LIST (ARR2)->(ARR1) ");

        for (int i : arr) {
            System.out.printf("  %d  ",i);
        }


        System.out.println("\n\n\nADDING 27 TO RANDOM INDEX IN LIST");
        arr.add(new Random().nextInt(arr.size()), 27);
        arr.add(new Random().nextInt(arr.size()), 27);
        for (int i : arr) {
            System.out.printf("  %d  ",i);
        }

        System.out.println("\nIndex of 27 in list --> "+ arr.indexOf(27));
        System.out.println("LastIndex of 27 in list --> "+ arr.lastIndexOf(27));


        System.out.println("\n\n********************************************************\n");

        ArrayList<Integer> obj1 = new ArrayList<>();
        ArrayList<Integer> obj2 = new ArrayList<>();
        ArrayList<Integer> obj3 = new ArrayList<>();

        for (int i = 1; i <=10; i++) {
            obj1.add(10 * i);
            obj2.add(50 * i);
            obj3.add(90 * i);
        }

        for (int i = 0; i < obj1.size(); i++) {
            System.out.printf("%d\t\t%d\t\t%d\n",obj1.get(i),obj2.get(i),obj3.get(i));
        }

        obj1.set(5, obj2.get(5));
        System.out.println("\n adding ");
        for (int i = 0; i < obj1.size(); i++) {
            System.out.printf("%d\t\t%d\t\t%d\n",obj1.get(i),obj2.get(i),obj3.get(i));
        }
        obj1.removeAll(obj2);
        obj1.removeAll(obj3);
        System.out.println("\n remove all () ");
        for (int i = 0; i < obj1.size(); i++) {
            System.out.printf("%d\t\t%d\t\t%d\n",obj1.get(i),obj2.get(i),obj3.get(i));
        }
        System.out.println("\n"+obj1.size()+"\n"+obj2.size()+"\n"+obj3.size());


        System.out.println("\n\n********************************************************\n");




    }
}
