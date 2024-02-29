import java.util.Scanner;

public class LCMGCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of values
        System.out.print("Enter the number of values (N): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input for N. Please enter a positive integer.");
            return;
        }

        int[] numbers = new int[n];

        // Input the numbers
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate and display LCM and GCD
        calculateAndDisplayLCMGCD(numbers);
    }

    private static void calculateAndDisplayLCMGCD(int[] numbers) {
        int lcm = calculateLCM(numbers);
        int gcd = calculateGCD(numbers);

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }

    private static int calculateLCM(int[] numbers) {
        int lcm = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            lcm = lcm(lcm, numbers[i]);
        }

        return lcm;
    }

    private static int calculateGCD(int[] numbers) {
        int gcd = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            gcd = gcd(gcd, numbers[i]);
        }

        return gcd;
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
