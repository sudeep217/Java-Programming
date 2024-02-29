import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        // Input array
        int[] array = {1, 2, 3, 4, 1, 2, 3, 5, 1, 2, 3, 6};

        // Find and print the frequency of each element in the array
        findElementFrequency(array);
    }

    private static void findElementFrequency(int[] array) {
        // Use a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array to count the frequency
        for (int element : array) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }

        // Print the frequency of each element
        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
}
