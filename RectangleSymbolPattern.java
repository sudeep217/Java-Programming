import java.util.Scanner;

public class RectangleSymbolPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the symbol
        System.out.print("Enter the symbol to create the rectangle pattern: ");
        char symbol = scanner.next().charAt(0);

        // Input the number of rows and columns for the rectangle
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        // Print the rectangle pattern
        printRectanglePattern(symbol, numRows, numCols);
    }

    private static void printRectanglePattern(char symbol, int numRows, int numCols) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}