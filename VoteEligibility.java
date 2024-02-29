import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the age of the person
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Determine eligibility and calculate the number of years left if not eligible
        checkVoteEligibility(age);
    }

    private static void checkVoteEligibility(int age) {
        // Define the minimum voting age
        int votingAge = 18;

        if (age >= votingAge) {
            System.out.println("You are eligible to vote!");
        } else {
            int yearsLeft = votingAge - age;
            System.out.println("You are not eligible to vote. You need to wait for " + yearsLeft + " more years.");
        }
    }
}
