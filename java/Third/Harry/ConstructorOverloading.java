package Harry;
class ravi{
    private String name;
    private int id;
    public ravi()
    {
        this.id=0;
        this.name="NA";
    }
    public ravi(String name,int k)
    {
        this.name=name;
        this.id=k;
    }
    void show()
    {
        System.out.println(this.name+"\t"+this.id);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
    ravi obj=new ravi("raviraj",23);
    obj.show();
    }
}
