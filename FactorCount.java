import java.util.Scanner;

public class FactorCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate and print the number of factors
        int factorCount = countFactors(number);
        System.out.println("Number of factors = " + factorCount);
    }

    private static int countFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        return count;
    }
}
