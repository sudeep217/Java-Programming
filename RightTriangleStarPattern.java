import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows for the right-angled triangle
        System.out.print("Enter the number of rows for the right-angled triangle: ");
        int numRows = scanner.nextInt();

        // Print the right-angled triangle star pattern
        printRightTriangle(numRows);
    }

    private static void printRightTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
