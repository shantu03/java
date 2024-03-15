package Harry;

import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
//        program to replace space with underscore
        System.out.println("enter string ot replace space wiht underscore ");
        String underscore=new Scanner(System.in).nextLine();
        underscore=underscore.replace(' ','_');
        System.out.println("Space replace with underscore ->  " + underscore
        + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
Scanner sc=new Scanner(System.in);

//      problem 3 ; change name temple to custom name
        String letter ="Dear <name>, Thanks a lot";
        System.out.println("Enter name to change templet formar");
        String name=sc.next();
        letter=letter.replace("<name>",name);
        System.out.println("Templet change result =>  " + letter
                + "\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");



//        problem 5 ; format letter in escape sequence

        String esape="\"Dear Customer, Thanks for supporting us\"";
        System.out.println(esape);
    }
}
