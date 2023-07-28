package Harry;
public class Stringg {
    public static void main(String[] args) {
//        page17-18
        char[] nname = {'s', 'h', 'a', 'n', 't', 'u'};
        String namee = new String(nname);
        String hello=new String("hello world");
        System.out.println(namee);

        System.out.println(namee.charAt(5));
        char y='A';
        for(int i =0;i<26;i++)
        {
            System.out.printf("%2d --> %2c\n",1+i,i+y);
        }

        //Lecture String methods //page18
        String ntrimmed="          hello         this is shantanu and i am here to represet =n   the world";
        System.out.println(ntrimmed.length());
        ntrimmed=ntrimmed.trim();

        System.out.println(ntrimmed.trim());
        System.out.println(ntrimmed.length());

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        String soubsring="Hello_Shantu";
   int kk=soubsring.length();
        System.out.println("chaer " + kk);
        System.out.println(soubsring.substring(6,12));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("replace ==> ");
        System.out.println(soubsring.replace('l','k'));
        System.out.println(soubsring.replace("Hello","bye"));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Index ----> "+soubsring.indexOf("ll"));
        System.out.println(soubsring.indexOf("ll",2));
        System.out.println("last index ---> " + soubsring.lastIndexOf(""));

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Equals ===>" + "is string equal = "+soubsring.equals("hello_shantu") + "\nwith equal ignore case= " + soubsring.equalsIgnoreCase("hello_shantu"));
    }
}