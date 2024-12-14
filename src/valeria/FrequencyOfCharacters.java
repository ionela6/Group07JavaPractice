package valeria;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {



    public static String frequencyOfChars(String str) {

        Map<Character, Integer> frequencyMap = new HashMap<>();


        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }


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

