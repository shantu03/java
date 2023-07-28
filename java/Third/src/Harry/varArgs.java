package Harry;

public class varArgs {
    //page 27
    static int count=0;
    public static void main(String[] args) {
            sum("shantu",2,3,1,5,2,0);
            sum("ravi",5,2,5,1,5,2);
            sum("avi",10,20,30,40,50);



    }
    static void sum(String name,int ...arr)         //----> int[] arr run honar nahi, array pass karayla lagel mg arguments madhle
    {
        System.out.println("result of arr"+(++count));
        int result=0;

        for(int i: arr)
        {
            result+=i;
        }
        System.out.println(name + "\t" +result);
    }
}
