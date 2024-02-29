import java.util.Scanner;

public class SkipNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the starting number (M)
        System.out.print("Enter the starting number (M): ");
        int M = scanner.nextInt();

        // Input the ending number (N)
        System.out.print("Enter the ending number (N): ");
        int N = scanner.nextInt();

        // Input the number to skip (K)
        System.out.print("Enter the number to skip (K): ");
        int K = scanner.nextInt();

        // Print numbers from M to N by skipping K numbers
        printSkippedNumbers(M, N, K);
    }

    private static void printSkippedNumbers(int M, int N, int K) {
        System.out.print("Numbers from " + M + " to " + N + " by skipping " + K + " numbers: ");

        for (int i = M; i <= N; i += K) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
