package jelena;

public class Week08_ReverseString {
    public static String reverseString (String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }

            return reversed;
    }
    public static void main (String[] args) {
        String original = "ABCD";
        String reversed = reverseString(original);
        System.out.println("reversed = " + reversed);
    }
}


/*
public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println(reversed);
    }
 */