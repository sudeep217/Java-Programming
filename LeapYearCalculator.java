import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the date in the format MM/DD/YYYY
        System.out.print("Enter Date (MM/DD/YYYY): ");
        String inputDate = scanner.nextLine();

        // Extract the year from the input date
        int year = extractYearFromDateString(inputDate);

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println("Given year is a Leap Year");
        } else {
            System.out.println("Given year is a Non Leap Year");
        }
    }

    private static int extractYearFromDateString(String dateString) {
        // Assuming date format MM/DD/YYYY
        String[] parts = dateString.split("/");
        return Integer.parseInt(parts[2]);
    }

    private static boolean isLeapYear(int year) {
        // A leap year is divisible by 4, except for years that are divisible by 100.
        // However, years divisible by 400 are leap years.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
