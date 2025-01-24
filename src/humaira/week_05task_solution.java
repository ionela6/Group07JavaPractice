package humaira;

import java.util.HashMap;
import java.util.Map;

public class week_05task_solution {

    public class FrequencyOfCharacters {
        public static String frequencyOfChars(String str) {
            // Create a map to store character frequencies
            Map<Character, Integer> frequencyMap = new HashMap<>();

            // Loop through each character in the string
            for (char ch : str.toCharArray()) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }

            // Build the resulting string
            StringBuilder result = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                result.append(entry.getKey()).append(entry.getValue());
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            System.out.println(frequencyOfChars(input));
        }
    }

}
