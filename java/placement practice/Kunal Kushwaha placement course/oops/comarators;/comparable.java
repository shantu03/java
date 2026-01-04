import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.AttributeSet.ColorAttribute;

public class comparable {
    
    
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Human one=new Human(21, "sanket");
        Human two=new Human(23, "shantanu");
        Human three =new Human(18, "tanmay");

        List<Human> list=new ArrayList();
        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println(list);
        Collections.sort(list);
        
        System.out.println();
        
        var four=three.clone();
        
        list.add(four);
        System.out.println(list);
    }
    
}

class Human implements Comparable<Human>,Cloneable{
    int age;
    String name;

    @Override 
    public Human clone() throws CloneNotSupportedException{
        return (Human)super.clone();
    }

    @Override
    public String toString(){
        return "{"+age+"  "+name+"} ";

    }
    public Human(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
@Override
    public int compareTo(Human one)
    {
        System.out.println("in comparte to method");
    if(this.age>one.age) return 1;
    else return -1;
    }



    

}
