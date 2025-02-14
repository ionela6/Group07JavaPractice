package basir;

import java.util.HashSet;
import java.util.Set;

/*
String-- Remove Duplicates
Write a return method that can remove the duplicated values from String
EX: removeDup("AAABBBCCC") ==>ABC
*/
public class week06_task_RemoveDup {
    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String output = removeDup(input);
        System.out.println(output);
    }

    public static String removeDup(String input) {

        StringBuilder result = new StringBuilder();

        Set<Character> unique = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (!unique.contains(currentChar)) {
                result.append(currentChar);
                unique.add(currentChar);
            }
        }

        return result.toString();
    }

}
