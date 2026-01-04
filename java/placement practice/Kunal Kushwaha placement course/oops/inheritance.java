public class inheritance {
    public static void main(String[] args) {
        parent obj=new grandchild();

        child obj2=new grandchild();

        // child obj3=new parent();

        obj2.run();
        obj2.speak();
    }
}


interface human{

    default void speak(){
        System.out.println("speaking ");
    }

     void run();
}



class parent implements human{
    @Override
    public void run() {
        System.out.println("runnning ");
    }
    private String name="maruti";
    
}
class child extends parent{
    private String name="jaydeep";
    
}
class grandchild extends child{
    @Override
    public void speak()
    {
        System.out.println("overridden speak");
    }
    private String name="shantanu";

}
