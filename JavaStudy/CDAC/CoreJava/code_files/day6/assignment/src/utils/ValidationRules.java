/**
 * Util class to validate details and maintain a standard
 */
package utils;
import cust_excs.CustomerHandlingException;
import java.util.regex.Pattern;
public class ValidationRules {

    static int EMAIL_MIN_LEN, EMAIL_MAX_LEN;
    static {
        EMAIL_MAX_LEN = 10;
        EMAIL_MIN_LEN = 5;
    }
    public static String validateEmail(String email) throws CustomerHandlingException {
        if (email.length() < EMAIL_MIN_LEN)
            throw new CustomerHandlingException("The email is too short");
        if (email.length() > EMAIL_MAX_LEN)
            throw new CustomerHandlingException("The email is too long");
        return email;
    }

    public static String validatePassword(String password) throws CustomerHandlingException {
        /**
         * Password Validation Rules:
         * It contains at least 8 characters and at most 20 characters.
         * It contains at least one digit.
         * It contains at least one upper case alphabet.
         * It contains at least one lower case alphabet.
         * It contains at least one special character which includes !@#$%&*()-+=^.
         * It doesn’t contain any white space.
         */
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        if (!Pattern.matches(regex, password))
            throw new CustomerHandlingException("The password must be alpha numeric & a special character");
        return password;
    }
    public static double validateRegAmount(double regAmount) throws CustomerHandlingException {
        if (regAmount % 500 != 0)
            throw new CustomerHandlingException("The registration amount is not in the multiples of 500");
        return regAmount;
    }
}