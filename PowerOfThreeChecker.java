import java.util.Scanner;

public class PowerOfThreeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the integer
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        // Check if the integer is a power of three
        if (isPowerOfThree(n)) {
            System.out.println(n + " is a power of three");
        } else {
            System.out.println(n + " is not a power of three");
        }
    }

    private static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false; // Negative numbers and zero are not powers of three
        }

        // Keep dividing the number by 3 until it is no longer divisible by 3
        while (n % 3 == 0) {
            n /= 3;
        }

        // After the division, if the remaining value is 1, it's a power of three
        return n == 1;
    }
}
