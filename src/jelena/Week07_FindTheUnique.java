package jelena;

import java.util.HashMap;
import java.util.Map;

public class Week07_FindTheUnique {
    public static String unique(String str) {
        // A HashMap to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Traverse the string and count frequencies
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // StringBuilder to build the result with unique characters
        StringBuilder result = new StringBuilder();

        // Iterate over the string again and collect characters that appear only once
        for (char ch : str.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {
                result.append(ch);
            }
        }

        // Return the result string
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        String result = unique(input);
        System.out.println(result); // Output: DEF
    }

}
