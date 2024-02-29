import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a number as a string: ");
        String inputString = scanner.next();

        // Convert the string to an integer
        try {
            int convertedNumber = convertToInteger(inputString);

            // Display the converted integer
            System.out.println("Converted integer: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer in string format.");
        }
    }

    private static int convertToInteger(String input) {
        // Use parseInt method to convert the string to an integer
        return Integer.parseInt(input);
    }
}
