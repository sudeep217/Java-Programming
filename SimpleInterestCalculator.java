import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter the principal amount: ");
        double principalAmount = scanner.nextDouble();

        // Input time (in years)
        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        // Check if the customer is a senior citizen
        System.out.print("Is the customer a senior citizen? (true/false): ");
        boolean isSeniorCitizen = scanner.nextBoolean();

        // Calculate and display simple interest
        double rateOfInterest = isSeniorCitizen ? 0.12 : 0.10;
        double simpleInterest = calculateSimpleInterest(principalAmount, rateOfInterest, time);

        System.out.println("Simple Interest: " + simpleInterest);
    }

    private static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time);
    }
}
