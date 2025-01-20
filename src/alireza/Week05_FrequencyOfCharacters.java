package alireza;

public class Week05_FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequncyCharacter("AAABBCDD"));
    }
    public static String frequncyCharacter(String str){
        String strwithoutDup = "";//ABCD
        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            if (!strwithoutDup.contains(""+str.charAt(i))){
                strwithoutDup +=""+str.charAt(i);
            }
        }
        for (int i = 0; i < strwithoutDup.length(); i++) {
            int count = 0 ;
            for (int j = 0; j < str.length(); j++) {
                if (strwithoutDup.charAt(i) == str.charAt(j)){
                    count ++;
                }
            }
            result += strwithoutDup.charAt(i) +""+ count;

        }
        return result;
    }
}
