import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the character to be printed
        System.out.print("Enter the character to be printed: ");
        char characterToPrint = scanner.next().charAt(0);

        // Input the maximum number of times to print the pattern
        System.out.print("Max Number of times to be printed: ");
        int maxTimes = scanner.nextInt();

        // Print the pattern
        printCharacterPattern(characterToPrint, maxTimes);
    }

    private static void printCharacterPattern(char characterToPrint, int maxTimes) {
        for (int i = 1; i <= maxTimes; i++) {
            // Print the character 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(characterToPrint + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}