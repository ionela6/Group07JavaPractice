package alireza;

public class Week06_RemoveDuplicates_task {
    public static void main(String[] args) {
        System.out.println(removeDuplicated());

    }
    public static String removeDuplicated() {
        String strWithoutDuplicate = "";
        String str = "AAABBBCCCDDD";

        for (int i = 0; i < str.toCharArray().length; i++) {
            if (!strWithoutDuplicate.contains(String.valueOf(str.charAt(i)))){
                strWithoutDuplicate += str.charAt(i);
            }

        }
        System.out.println("String with duplicates = "+str);
        String result = "String without duplicates = "+strWithoutDuplicate;
        return result;
    }
}
