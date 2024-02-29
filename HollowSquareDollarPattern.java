import java.util.Scanner;

public class HollowSquareDollarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Print the hollow square dollar pattern
        printHollowSquareDollarPattern(size);
    }

    private static void printHollowSquareDollarPattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print the dollar symbol only for the first and last rows, and the first and last columns
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("$ ");
                } else {
                    // Print a space for the hollow part
                    System.out.print("  ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
