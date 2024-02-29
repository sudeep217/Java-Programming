import java.util.Scanner;

public class DecimalToBinaryReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert the decimal number to binary
        String binaryRepresentation = convertToBinary(decimalNumber);

        // Print the binary representation
        System.out.println("Binary representation: " + binaryRepresentation);

        // Reverse the binary representation
        String reversedBinary = reverseBinary(binaryRepresentation);

        // Print the reversed binary representation
        System.out.println("Reversed binary: " + reversedBinary);
    }

    private static String convertToBinary(int decimalNumber) {
        // Using Integer.toBinaryString for simplicity
        return Integer.toBinaryString(decimalNumber);
    }

    private static String reverseBinary(String binaryRepresentation) {
        // Converting the string to a StringBuilder for easy reversal
        StringBuilder reversedBinary = new StringBuilder(binaryRepresentation);
        return reversedBinary.reverse().toString();
    }
}
