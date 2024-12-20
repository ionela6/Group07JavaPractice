package ionela;
// Write a return method that can find the frequency of characters
//  Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public class Week05_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(calculateFrequencyOfChars(new StringBuilder("fAABBTTPPPAlf")));

    }
    public static String calculateFrequencyOfChars(StringBuilder chars){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 1;) {
            int count = 0;
            char each = chars.charAt(i);
            result.append(each);
            for (int j = 0; j < chars.length(); j++) {
                if (chars.charAt(j) == each){
                    count++;
                    chars.deleteCharAt(j);
                    j--;

                }

            }
            result.append(count);
            if (chars.length()==0){
                break;
            }

        }
        return result.toString();
    }
}