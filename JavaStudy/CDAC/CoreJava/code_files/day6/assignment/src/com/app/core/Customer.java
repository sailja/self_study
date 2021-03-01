/**
 * Core class for the Exception handling assignment.
 */
package com.app.core;
public class Customer {

    private String email, password;
    private double regAmount;

    public Customer(String email, String password, double regAmount) {
        this.email = email;
        this.password = password;
        this.regAmount = regAmount;
    }

    @Override
    public String toString() {
        return "Email: " + email + "\nPassword: " + password + "\nRegistration Amount: Rs" + regAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Customer)) return false;
        Customer c = (Customer)o;
        if (email.equals(c.email)) return true;
        return false;
    }
}