package ionela;

//  Write a return method that can remove the duplicated values from String
//  Ex:  removeDup("AAABBBCCC")  ==> ABC
public class Week06_RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println("removeDup = " + removeDup("AAABBBCCCAA"));
    }
    public static String removeDup(String given) {
        String unique = "";
        for (int i = 0; i < given.length(); i++) {
            if (!unique.contains(String.valueOf(given.charAt(i)))) {
                unique += given.charAt(i);

            }

        }
        return unique;
    }

}
