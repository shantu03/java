
public class lamba_expression_thread_class {
    public static void main(String[] args) {
        
        Thread class1=new Thread(()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("firs "+i);
            }
        });


        Thread class2=new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                    System.out.println("scond"+i);
            }
        });

        class1.start();
        class2.start();
    }
    
}
