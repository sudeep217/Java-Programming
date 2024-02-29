import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to be reversed
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number using a loop
        int reversedNumber = reverseNumber(number);

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }

    private static int reverseNumber(int number) {
        int reversedNumber = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Add the digit to the reversed number
            number /= 10; // Remove the last digit from the original number
        }

        return reversedNumber;
    }
}
