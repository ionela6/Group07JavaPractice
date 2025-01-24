package basir;

import java.util.HashMap;

public class week07_task_uniqueCharacters {
    //String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));
    }
    public static String unique(String str) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        StringBuilder uniqueChars = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {
                uniqueChars.append(ch);
            }
        }
        return uniqueChars.toString();
    }
}
