package valeria;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

        public static String removeDup(String input) {
            StringBuilder result = new StringBuilder();
            // Set to keep track of characters that have already appeared
            Set<Character> seen = new HashSet<>();

            // Iterate through the string
            for (char c : input.toCharArray()) {
                // If the character has not been seen before, add it to the result and mark it as seen
                if (!seen.contains(c)) {
                    result.append(c);
                    seen.add(c);
                }
            }

            // Convert the StringBuilder to a String and return it
            return result.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBBCCC";
            System.out.println(removeDup(input));  // Output: "ABC"
        }
    }


