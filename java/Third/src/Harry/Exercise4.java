package Harry;

/*
YOU HAVE TO IMPLEMENT A LIBRARY USING JAVA CLASS LIBRARY
METHODS: ISSUEBOOK, RETURBOOK, SHOWAVAILABLEBOOKS
PROPERTIES: ARRYA TO STORE THE AVAILABLE BOOKS,
ARRAY TO STORE THE ISSUED BOOKS




*/
import java.util.Scanner;
import java.util.Random;
class Library{
    String[] books,issuebook,returnbook;

    int num=0;
    int select;
    int count=1;

    public Library()
    {
        books= new String[]{"o Kill a Mockingbird", "The Great Gatsby","Ulysses","The Catcher in the Rye",
        "Pride and Prejudice" ,"Adventures of Huckleberry Finn","Alice’s Adventure in Wonderland","o the Lighthouse","The Sound and the Fury","Nineteen Eighty-four"};
        issuebook=new String[books.length];
        returnbook=new String[books.length];

    }

    void show() {
        int k=1;
        System.out.println("Available Books :- ");
        for (String i : books) {
            System.out.printf(" %2d - %3s \n",k++,i);
        }
    }

    void returnBook() {

    }
    void issueBook() {

        count=1;
        for (String i : books) {
            System.out.printf("%2d - %2s\n",count++,i);
        }
        if (num >= books.length + 1) {
            System.out.println("NO More books are available to issue");

        } else {
            while (true) {
                System.out.println("Enter number of book you want to issue");
                select = new Scanner(System.in).nextInt();
                if (select <= books.length) {
                    break;
                }
                else {
                    System.out.println("ENTER VALID STATEMENT");
                }

            }
            issuebook[num]=books[select];
            while (select != books.length) {

            }

        }




    }

    void work() {
        System.out.println("enter \" issue\" To issue the book\tEnter \"return\" to return the book");
        String option=new Scanner(System.in).next();
        if (option.equalsIgnoreCase("issue")) {
            issueBook();
        } else if (option.equalsIgnoreCase("return")) {
            returnBook();
        }
    }

    boolean play() {
        while (true) {
            System.out.println("Enter \"exit\" to Exit the program ");
            String option = new Scanner(System.in).next();
            if (option.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for your cooperation");
                return false;
            } else {
                System.out.println("Enter valid option");
            }
        }

    }

}
public class Exercise4 {
    public static void main(String[] args) {
        Library obj=new Library();

        int[] a=new int[100];
        System.out.println(a.length);
/*        do
        {
            System.out.println("\nWELCOME TO THE LIBRARY");
            obj.work();
        }while (obj.play());*/

    }


}
