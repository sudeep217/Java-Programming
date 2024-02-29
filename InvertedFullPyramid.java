import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the inverted full pyramid
        System.out.print("Enter the number of rows for the inverted full pyramid: ");
        int numRows = scanner.nextInt();

        // Print the inverted full pyramid pattern
        printInvertedFullPyramid(numRows);
    }

    private static void printInvertedFullPyramid(int numRows) {
        for (int i = numRows; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
