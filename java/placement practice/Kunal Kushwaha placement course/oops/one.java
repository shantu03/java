class student{
    int roll;
    String name;
    static int total_student;

    public student(int roll,String name ){
        this.roll=roll;
        this.name=name;
        total_student+=1;
    }

    public  String toString(){
        return roll+" "+name;
    }
}
public class one {

     public static void main(String[] args) {
        
        student stu1=new student(14, "shantanu");
        student stu2=new student(55, "me");

        System.out.println(stu1.total_student);

        System.out.println(stu1);
     }
}