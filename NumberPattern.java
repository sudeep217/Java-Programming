import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to be printed
        System.out.print("Enter the number to be printed: ");
        int numberToPrint = scanner.nextInt();

        // Input the maximum number of times to print the pattern
        System.out.print("Max Number of times to be printed: ");
        int maxTimes = scanner.nextInt();

        // Print the pattern
        printNumberPattern(numberToPrint, maxTimes);
    }

    private static void printNumberPattern(int numberToPrint, int maxTimes) {
        // Print the upper half of the pattern
        for (int i = 1; i <= maxTimes; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numberToPrint);
            }
            System.out.println();
        }

        // Print the lower half of the pattern
        for (int i = maxTimes - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numberToPrint);
            }
            System.out.println();
        }
    }
}
