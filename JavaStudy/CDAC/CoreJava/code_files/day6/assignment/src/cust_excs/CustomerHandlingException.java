/**
 * Custom Exception Handling class for any customer related exceptions generated
 */
package cust_excs;
public class CustomerHandlingException extends Exception {
    public CustomerHandlingException(String message) {
        super(message);
    } 
}