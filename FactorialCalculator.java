import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number (N)
        System.out.print("Enter a number (N): ");
        int N = scanner.nextInt();

        // Calculate and print the factorial of N
        long factorial = calculateFactorial(N);
        System.out.println(N + " Factorial = " + factorial);
    }

    private static long calculateFactorial(int N) {
        if (N < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1; // Indicate an error
        }

        long result = 1;

        for (int i = 1; i <= N; i++) {
            result *= i;
        }

        return result;
    }
}
