package alireza;

public class Week08_ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("ABCD"));

    }
    public static String reverseString(String str){
        System.out.println("Orginal String is : \n" +
                ""+str);
        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);

        }
        System.out.println("Reverse String is : ");
        return reverse;
    }
}
