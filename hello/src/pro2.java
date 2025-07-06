import java.util.Scanner;

public class pro2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        int k = scanner.nextInt();

        String shiftedString = circularLeftShiftString(inputString, k);
        System.out.println( shiftedString);
    }

    public static String circularLeftShiftString(String input, int k) {
        int length = input.length();
        k = k % length;

        String shifted = input.substring(k) + input.substring(0, k);
        System.out.println(input.substring(k));
        return shifted;
    }
}
