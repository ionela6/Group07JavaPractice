package basir;

public class week09_task_validPassword {
    /*
     Write a return method that can verify if a password is valid or not.
requirements:
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
     */
    public static boolean validPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }
    public static void main(String[] args) {
        System.out.println(validPassword("Password1$"));
        System.out.println(validPassword("password"));
        System.out.println(validPassword("PASSWORD1!"));
        System.out.println(validPassword("123"));
        System.out.println(validPassword("USA"));
    }
}
