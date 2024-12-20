package ionela;
// Write a return method that can find the frequency of characters
//  Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
public class Week05_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(calculateFrequencyOfChars(new StringBuilder("fAABBTTPPPAlf")));

    }
    public static String calculateFrequencyOfChars(StringBuilder givenSTB){
        StringBuilder resultSTB = new StringBuilder();
        for (int i = 0; i < 1;) {
            int count = 0;
            char each = givenSTB.charAt(i);
            resultSTB.append(each);
            for (int j = 0; j < givenSTB.length(); j++) {
                if (givenSTB.charAt(j) == each){
                    count++;
                    givenSTB.deleteCharAt(j);
                    j--;

                }

            }
            resultSTB.append(count);
            if (givenSTB.length()==0){
                break;
            }

        }
        return resultSTB.toString();
    }
}