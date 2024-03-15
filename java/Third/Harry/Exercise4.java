package Harry;
/*
YOU HAVE TO IMPLEMENT A LIBRARY USING JAVA CLASS LIBRARY
METHODS: ISSUEBOOK, RETURBOOK, SHOWAVAILABLEBOOKS
PROPERTIES: ARRYA TO STORE THE AVAILABLE BOOKS,
ARRAY TO STORE THE ISSUED BOOKS
*/
import java.util.Vector;
import java.util.Scanner;
class Library {
    Vector<String> obj = new Vector<>();
    Vector<String> status = new Vector<>();
    int count = 0;
    public Library() {
        String[] obj = {"o Kill a Mockingbird", "The Great Gatsby", "Ulysses", "The Catcher in the Rye",
                "Pride and Prejudice", "Adventures of Huckleberry Finn", "Alice’s Adventure in Wonderland", "o the Lighthouse", "The Sound and the Fury", "Nineteen Eighty-four"};
        for (String i : obj) {
            this.obj.addElement(i);
            this.status.addElement("AVAILABLE");
        }
    }
    void show() {
        for (int i = 0; i < obj.size(); i++) {
            System.out.printf("%2d - %2s  is %2s\n", i + 1, obj.elementAt(i), status.elementAt(i));
        }
        System.out.println("\n");
    }
    void returnbook() {
        if (count == 0) {
            System.out.println("NO Books Has Issued");
        } else {
            while (true) {
                System.out.println("Enter book number to return the book - ");
                int k = new Scanner(System.in).nextByte();
                if (k <= obj.size()) {
                    if (status.elementAt(k - 1).equalsIgnoreCase("NOT AVAILABLE")) {
                        count--;
                        status.set(k - 1, "AVAILABLE NOW");
                    } else {
                        System.out.println("***This book is already available ****");
                    }
                    break;
                } else {
                    System.out.println("Enter valid Input");
                }
            }
        }
        System.out.println("\n");
    }
    void issuebook() {
        if (count == obj.size()) {
            System.out.println("All Books are Issued");
        } else {
            while (true) {
                System.out.println("Enter book number to issue the book - ");
                int k = new Scanner(System.in).nextByte();
                if (k <= obj.size()) {
                    if (status.elementAt(k - 1).equalsIgnoreCase("not available")) {
                        System.out.println("***Book is already issued***");
                    } else {
                        status.set(k - 1, "NOT AVAILABLE");
                        count++;
                    }
                    break;
                } else {
                    System.out.println("Enter valid Input");
                }
            }
        }
        System.out.println("\n");
    }
}
public class Exercise4 {
    public static void main(String[] args) {
        Library obj = new Library();
        System.out.println("WELCOME TO THE LIBRARY ");
        while (true) {
            System.out.println("""
                    1 = "Show Available Books "
                    2 = "Issues Book "
                    3 = "Retrun Book"
                    4 = "Exit\"""");
            int k = new Scanner(System.in).nextByte();
            if (k == 1) {
                obj.show();
            } else if (k == 2) {
                obj.issuebook();
            } else if (k == 3) {
                obj.returnbook();
            } else if (k == 4) {
                break;
            } else {
                System.out.println("Enter Valid Input");
            }
        }
    }
}



