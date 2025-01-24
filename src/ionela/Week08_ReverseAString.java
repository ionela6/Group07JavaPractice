package ionela;

public class Week08_ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("A1B2C3D4f5E6"));
    }


    public static String reverseString(String given){
        //--------------------------Solution 1---------------------------------
//        StringBuilder reversedSB = new StringBuilder(given);
//        reversedSB.reverse();
//        return reversedSB.toString();

        //--------------------------Solution 2---------------------------------
        StringBuilder reversedSB = new StringBuilder();

        for (int i = given.length()-1; i >=0 ; i--) {
            reversedSB.append(given.charAt(i));

        }

        return reversedSB.toString();
    }
}
