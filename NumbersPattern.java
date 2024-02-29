import java.util.Scanner;

public class NumbersPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the pattern
        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();

        // Print the pattern
        printNumberPattern(numRows);
    }

    private static void printNumberPattern(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print the number 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
