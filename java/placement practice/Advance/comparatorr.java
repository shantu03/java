import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class comparatorr {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(23, "shantu"));
        list.add(new Student(18, "tanmay"));
        list.add(new Student(14,"paru"));
            list.add(new Student(19, "yash"));
            list.add(new Student(21, "sanket"));

     Comparator<Student> com=(s1,s2)->(s1.age>s2.age)?1:-1;
    //  Collections.sort(list,com);
    Collections.sort(list);
        for (Student s:list)
        {
            System.out.println(s);
        }
    }

}

 class Student implements Comparable<Student> {
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int compareTo(Student s1){
        if(this.age<s1.age) return 1;
        else return -1;
    }
int age;
String name;

@Override
public String toString(){
    return "Student -> Name : "+name+" age : "+age ;
}
    
}