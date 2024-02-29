import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the N-digit number
        System.out.print("Enter an N-digit number: ");
        int nDigitNumber = scanner.nextInt();

        // Find and print the sum of digits (single digit sum)
        int singleDigitSum = findSingleDigitSum(nDigitNumber);
        System.out.println("Sum of digits (single digit sum): " + singleDigitSum);
    }

    private static int findSingleDigitSum(int number) {
        int sum = 0;

        // Calculate the sum of digits
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        // If the sum is still not a single digit, repeat the process
        while (sum >= 10) {
            sum = findSingleDigitSum(sum);
        }

        return sum;
    }
}
