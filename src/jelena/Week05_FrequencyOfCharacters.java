package jelena;

import java.util.HashMap;
import java.util.Map;

public class Week05_FrequencyOfCharacters {
    public static String FrequencyOfChars(String str) {
        // A HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse the string and count frequencies
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Build the result string in the format "A3B2C1D2"
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBCDD";
        String result = FrequencyOfChars(input);
        System.out.println(result); // Output: A3B2C1D2
    }

}