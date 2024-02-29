import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the word
        System.out.print("Enter a word: ");
        String word = scanner.next();

        // Reverse the word using a loop
        String reversedWord = reverseWord(word);

        // Display the reversed word
        System.out.println("Reversed word: " + reversedWord);
    }

    private static String reverseWord(String word) {
        // Initialize an empty string to store the reversed word
        String reversed = "";

        // Iterate through the characters of the word in reverse order
        for (int i = word.length() - 1; i >= 0; i--) {
            // Append each character to the reversed string
            reversed += word.charAt(i);
        }

        // Return the reversed word
        return reversed;
    }
}
