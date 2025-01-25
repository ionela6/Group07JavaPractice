package valeria;

public class PasswordValidator {


        public static boolean isValidPassword(String password) {
            // Requirement 1: Password must have at least 6 characters and no spaces
            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            // Flags for other requirements
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            // Check each character in the password
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }

            // Requirement 2, 3, 4, and 5: Verify all flags are true
            return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(isValidPassword("Passw0rd!")); // true
            System.out.println(isValidPassword("passw0rd"));  // false (no uppercase)
            System.out.println(isValidPassword("PASSW0RD"));  // false (no lowercase)
            System.out.println(isValidPassword("Pass word")); // false (contains space)
            System.out.println(isValidPassword("Passw!"));    // false (no digit)
        }
    }


