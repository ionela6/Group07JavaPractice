package ionela;
    /*String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false
*/
import java.util.regex.*;

import java.util.regex.*;

public class Week09_PasswordValidation {
    public static void main(String[] args) {
        System.out.println("ladA123! = " + validatePassword("ladA123!"));
        System.out.println("lada123! = " + validatePassword("lada123!"));
        System.out.println("ladasfhjsdj! = " + validatePassword("ladasfhjsdj!"));
        System.out.println("3452435123! = " + validatePassword("3452435123!"));
        System.out.println("lada123A = " + validatePassword("lada123A"));
        System.out.println("Lad1! = " + validatePassword("Lad1!"));

    }

    public static boolean validatePassword(String password) {
        // Password must have at least 6 characters and no spaces
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Regular expressions to check the conditions
        boolean containsUpperCase = password.matches(".*[A-Z].*");
        boolean containsLowerCase = password.matches(".*[a-z].*");
        boolean containsDigit = password.matches(".*\\d.*");
        boolean containsSpecialChar = password.matches(".*[^a-zA-Z0-9].*");

        // If all conditions are met, return true
        return containsUpperCase && containsLowerCase && containsDigit && containsSpecialChar;
    }
}
