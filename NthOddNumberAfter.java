import java.util.Scanner;

public class NthOddNumberAfter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the starting odd number
        System.out.print("Enter an odd number: ");
        int oddNumber = scanner.nextInt();

        // Input the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Find and print the nth odd number after the given odd number
        int nthOddNumber = findNthOddNumberAfter(oddNumber, n);
        System.out.println("The " + n + "th odd number after " + oddNumber + " is: " + nthOddNumber);
    }

    private static int findNthOddNumberAfter(int oddNumber, int n) {
        if (oddNumber % 2 == 0 || n <= 0) {
            System.out.println("Invalid input. Please enter an odd number and a positive value for n.");
            return -1; // Indicate an error
        }

        // Calculate and return the nth odd number after the given odd number
        return oddNumber + 2 * (n - 1);
    }
}
