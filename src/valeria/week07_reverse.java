public class ReverseNegative {

        public static int reverseNegative(int number) {
            if (number >= 0) {
                throw new IllegalArgumentException("The input must be a negative number.");
            }


            int reversed = 0;
            number = -number;

            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            return -reversed;
        }

        public static void main(String[] args) {
            int negativeNumber = -12345;
            int reversedNumber = reverseNegative(negativeNumber);
            System.out.println("Original number: " + negativeNumber);
            System.out.println("Reversed number: " + reversedNumber);


        }
    }

