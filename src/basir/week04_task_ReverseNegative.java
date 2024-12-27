package basir;

public class week04_task_ReverseNegative {

    /*2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int */

    public static int reverseNeg(int n) {

        int rev = 0;

        while (n < 0) {
            int lastnum = n % 10;
            rev = rev * 10 + lastnum;

            n /= 10;

        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reverseNeg(-987));
        System.out.println(reverseNeg(-12345));

    }

}



