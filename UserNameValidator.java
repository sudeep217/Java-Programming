import java.util.Scanner;

public class UserNameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the user name
        System.out.print("Enter a user name: ");
        String userName = scanner.next();

        // Check if the user name is valid
        if (isValidUserName(userName)) {
            System.out.println("Valid user name!");
        } else {
            System.out.println("Invalid user name. Please follow the specified criteria.");
        }
    }

    private static boolean isValidUserName(String userName) {
        // Check if the user name meets the criteria (minimum length of 5 characters and consists of letters and digits)
        return userName.length() >= 5 && userName.matches("[a-zA-Z0-9]+");
    }
}
