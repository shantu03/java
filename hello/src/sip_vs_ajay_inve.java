
import java.util.Scanner;
class sip_vs_ajay_inve {
    public static void main(String[] args) {
        int month , ammount;
        int initial=0;
        float mreturn ;
        int check_ammount=10000;
        Scanner sc=new Scanner(System.in);

        month=sc.nextInt();
        mreturn=sc.nextFloat();
        ammount=sc.nextInt();
        mreturn/=100;

        float fammount=initial;
        for(int i=0;i<month;i++)
        {

            if(ammount*(i+1)<=((int)fammount-ammount*(i+1)))
            {
                break;
            }
            fammount+=ammount;
            fammount=(fammount+fammount*mreturn);
            System.out.println("Month : "+(i+1)+"\t invested : "+ammount*(i+1)+ "\t return : "+((int)fammount-ammount*(i+1)));
            if(i==month-1)
            {
                System.out.println("Month Passed : ");
                month=10000;
            }


        }
    }
}