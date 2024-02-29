import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the paragraph
        System.out.print("Enter the paragraph: ");
        String paragraph = scanner.nextLine();

        // Input the banned words as a comma-separated string
        System.out.print("Enter the banned words (comma-separated): ");
        String bannedWordsInput = scanner.nextLine();

        // Split the banned words into an array
        String[] banned = bannedWordsInput.split(", ");

        // Find and print the most frequent word that is not banned
        String result = mostFrequentWord(paragraph, banned);
        System.out.println("Most frequent word not banned: " + result);
    }

    private static String mostFrequentWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase(); // Convert to lowercase for case-insensitivity
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        Map<String, Integer> wordFrequencyMap = new HashMap<>();
        String[] words = paragraph.split("\\W+");

        for (String word : words) {
            if (!bannedSet.contains(word)) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        String mostFrequentWord = "";
        int maxFrequency = 0;

        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        return mostFrequentWord;
    }
}
