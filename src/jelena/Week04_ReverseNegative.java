package jelena;

public class Week04_ReverseNegative {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-123));
    }

    public static int reverseNegativeNumber(int num) {
if (num < 0) {
    String reversedString = new StringBuilder(String.valueOf(Math.abs(num))).reverse().toString();
    return Integer.parseInt(reversedString) * -1;

}
return num;

    }
}

