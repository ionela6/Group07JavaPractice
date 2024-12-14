package humaira;

public class week_04_solution {
    public static int reverseNegative(int number) {
        // Check if the number is negative
        if (number >= 0) {
            throw new IllegalArgumentException("The input must be a negative number.");
        }

        // Convert the number to positive, reverse it, and then make it negative again
        int reversed = 0;
        number = -number; // Make the number positive temporarily

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