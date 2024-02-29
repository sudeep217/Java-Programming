import java.util.Scanner;
public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();
        int specialCharCount = 0;
        System.out.println("Special characters:");
        for (int i = 0; i < inputLine.length(); i++) {
            char currentChar = inputLine.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)) {
                System.out.println(currentChar);
                specialCharCount++;
            }
        }
        System.out.println("Number of special characters: " + specialCharCount);
    }
}