package jelena;

public class Week06_RemoveDuplicates {

    //  Write a return method that can remove the duplicated values from String
    //  Ex:  removeDup("AAABBBCCC")  ==> ABC

    public static String removeDup(String str) {
        // Use a StringBuilder to build the result string
        StringBuilder result = new StringBuilder();

        // Create a set to track the characters we've already seen
        StringBuilder seen = new StringBuilder();

        // Iterate over each character in the string
        for (char ch : str.toCharArray()) {
            // If the character has not been seen before, add it to the result
            if (seen.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
                seen.append(ch); // Mark this character as seen
            }
        }

        // Return the result as a string
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDup(input);
        System.out.println(result); // Output: ABC
    }
}
