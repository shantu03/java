package Harry;
class threadP extends thread1
{
    @Override
    public void run() {
        for (int i = 0; i < 22; i++) {
            System.out.println("inside overridden class -> " + i);
            try {
                Thread.sleep(i);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }
}
public class L76_ThreadPracticel {

    public static void main(String[] args) {
    threadP obj1=new threadP();
    obj1.start();
        for (int i = 0; i < 29; i++) {
            System.out.println(obj1.getState());
        }
    }
}
