import java.util.Arrays;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of names
        System.out.print("Enter the number of names: ");
        int numberOfNames = scanner.nextInt();

        // Input the names
        String[] names = new String[numberOfNames];
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = scanner.next();
        }

        // Choose sorting order
        System.out.print("Enter sorting order (A for Ascending, D for Descending): ");
        char sortOrder = scanner.next().charAt(0);

        // Sort the names based on the user's choice
        if (sortOrder == 'A' || sortOrder == 'a') {
            Arrays.sort(names); // Ascending order
        } else if (sortOrder == 'D' || sortOrder == 'd') {
            Arrays.sort(names, (s1, s2) -> s2.compareTo(s1)); // Descending order
        } else {
            System.out.println("Invalid sorting order. Please enter A or D for Ascending or Descending.");
            return;
        }

        // Display the sorted names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
