package alireza;

import java.util.Scanner;

public class Week09_PasswordValidation {
    public static void main(String[] args) {
        password();

    }

    public static boolean password() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Password : ");
        String password = scanner.next();
        boolean result = true;
        boolean hasUpperCase = true;
        boolean hasLowerCase = true;
        boolean hasDigit = true;
        boolean hasMoreThan5Characters = true;
        boolean hasSpecialChar = true;

        if (!password.matches(".*[A-Z].*")) {
            hasUpperCase = false;
            System.out.println("password should contains at least one UpperCase character ");

        }
        if (!password.matches(".*[a-z].*")) {
            hasLowerCase = false;
            System.out.println("password should contains at least one LowerCase Character ");
        }
        if (!password.matches(".*[0-9].*")) {
            hasDigit = false;
            System.out.println("password should contains at least one Digit ");

        }
        if (password.length() < 6 || password.contains(" ")) {
            hasMoreThan5Characters = false;
            System.out.println("Password should be 6 or more characters and do not have any space");

        }
        if (!password.matches(".*[^a-zA-Z0-9].*")) {
            hasSpecialChar = false;
            System.out.println("password should contain at least one Special characters");
        }


        if (hasUpperCase && hasLowerCase && hasDigit && hasMoreThan5Characters && hasSpecialChar) {
            result = true;
            System.out.println("result = " + result);
            System.out.println("Great, your password match all conditions");
        } else {
            result = false;
            System.out.println("result = " + result);
            System.out.println("Sorry, your password is not match the conditions");
        }
        return result;
    }
}
