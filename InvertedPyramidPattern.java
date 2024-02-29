import java.util.Scanner;

public class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the inverted pyramid
        System.out.print("Enter the number of rows for the inverted pyramid: ");
        int numRows = scanner.nextInt();

        // Print the inverted pyramid pattern
        printInvertedPyramid(numRows);
    }

    private static void printInvertedPyramid(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print spaces before the stars
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * (numRows - i) - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
