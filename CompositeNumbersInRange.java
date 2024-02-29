import java.util.Scanner;

public class CompositeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lower bound (A)
        System.out.print("Enter the lower bound (A): ");
        int A = scanner.nextInt();

        // Input the upper bound (B)
        System.out.print("Enter the upper bound (B): ");
        int B = scanner.nextInt();

        // Print all composite numbers between A and B
        printCompositeNumbersInRange(A, B);
    }

    private static void printCompositeNumbersInRange(int A, int B) {
        System.out.print("Composite numbers between " + A + " and " + B + ": ");

        for (int i = A; i <= B; i++) {
            if (isComposite(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    private static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; // Found a factor, so it's composite
            }
        }

        return false; // No factors found, it's not composite
    }
}
