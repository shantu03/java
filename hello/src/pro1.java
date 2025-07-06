import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two comma-separated strings
        System.out.print("Enter first string of numbers separated by commas: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second string of numbers separated by commas: ");
        String input2 = scanner.nextLine();

        // Split both strings by comma to get individual elements
        String[] elements1 = input1.split(",");
        String[] elements2 = input2.split(",");

        // Find the maximum length to handle cases where the strings are of unequal length
        int maxLength = Math.max(elements1.length, elements2.length);

        // Prepare a StringBuilder for the result
        StringBuilder result = new StringBuilder();

        // Add elements column-wise
        for (int i = 0; i < maxLength; i++) {
            String value1 = i < elements1.length ? elements1[i].trim() : "";
            String value2 = i < elements2.length ? elements2[i].trim() : "";

            if (isNumeric(value1) && isNumeric(value2)) {
                // If both values are numeric, add them
                int sum = Integer.parseInt(value1) + Integer.parseInt(value2);
                result.append(sum);
            } else if (!value1.isEmpty()) {
                // If only value1 exists, keep it
                result.append(value1);
            } else if (!value2.isEmpty()) {
                // If only value2 exists, keep it
                result.append(value2);
            }

            // Add comma separator if not the last element
            if (i < maxLength - 1) {
                result.append(",");
            }
        }

        // Output the result
        System.out.println("Result: " + result.toString());

        scanner.close();
    }

    // Utility method to check if a string is numeric
    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
