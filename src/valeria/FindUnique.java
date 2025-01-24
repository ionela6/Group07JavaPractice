package valeria;

public class FindUnique {
        public static String unique(String str) {
            StringBuilder uniqueChars = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    uniqueChars.append(ch);
                }
            }

            return uniqueChars.toString();
        }

        public static void main(String[] args) {
            String result = unique("AAABBBCCCDEF");
            System.out.println("Unique characters: " + result); // Output: "DEF"
        }
    }


