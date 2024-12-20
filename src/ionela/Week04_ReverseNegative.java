package ionela;


/*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int */

public class Week04_ReverseNegative {
    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber("-345"));
    }

    public static int reverseNegativeNumber(String num) {
        String reversedNum = "";
        for (int i = 0; i < 1; i++) {
            reversedNum += num.charAt(i);
            for (int j = num.length() - 1; j > 0; j--) {
                reversedNum += num.charAt(j);
            }
        }

        int reversed = Integer.parseInt(reversedNum);
        return reversed;
    }


}
