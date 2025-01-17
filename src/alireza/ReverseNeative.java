package alireza;

public class ReverseNeative {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumber(-1234));
    }
    public static int reverseNegativeNumber(int number){

        String num = String.valueOf(number);
        String reverseNum = "-";
        System.out.println(num);
        for (int i = num.length()-1,j = 0 ; i > 0 ; i--,j++) {
            reverseNum += num.charAt(i);
        }
        return Integer.valueOf(reverseNum);
    }
}

