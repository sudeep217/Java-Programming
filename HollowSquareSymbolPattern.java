import java.util.Scanner;

public class HollowSquareSymbolPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the symbol
        System.out.print("Enter the symbol to create the hollow square pattern: ");
        char symbol = scanner.next().charAt(0);

        // Input the size of the square
        System.out.print("Enter the size of the square: ");
        int size = scanner.nextInt();

        // Print the hollow square pattern
        printHollowSquarePattern(symbol, size);
    }

    private static void printHollowSquarePattern(char symbol, int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                // Print the symbol only for the first and last rows, and the first and last columns
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(symbol + " ");
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
