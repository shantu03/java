import java.util.Scanner;

public class pro3 {

    public static boolean areRotatingTwins(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String ss = str1 + str1;

        return ss.contains(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();

        String input2 = scanner.nextLine();

        if (areRotatingTwins(input1, input2)) {
            System.out.println("yess");
        } else {
            System.out.println("noo");
        }
    }
}