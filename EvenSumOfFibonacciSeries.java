import java.util.Scanner;

public class EvenSumOfFibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number 'N' up to which Fibonacci series should be considered
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Calculate and print the sum of even terms in the Fibonacci series up to N
        int evenSum = calculateEvenSumOfFibonacci(N);
        System.out.println("Sum of even terms in Fibonacci series up to " + N + ": " + evenSum);
    }

    private static int calculateEvenSumOfFibonacci(int N) {
        int firstTerm = 0, secondTerm = 1;
        int evenSum = 0;

        while (firstTerm <= N) {
            // Check if the current term is even
            if (firstTerm % 2 == 0) {
                evenSum += firstTerm;
            }

            // Calculate the next term in the Fibonacci series
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return evenSum;
    }
}
