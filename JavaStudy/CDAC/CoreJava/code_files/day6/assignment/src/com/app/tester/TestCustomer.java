/**
 * Tester Class to implement all the functionality reated to a customer
 */
package com.app.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.app.core.Customer;
import cust_excs.CustomerHandlingException;
import static utils.ValidationRules.*;
public class TestCustomer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = -1;
        boolean exit = false;
        try {
            System.out.println("Enter the length of the array:");
            Customer[] customers = new Customer[sc.nextInt()];
            while (!exit) {
                System.out.println("------------NENU-----------");
                System.out.println("1. Register new Customer.");
                System.out.println("2. Display all customers.");
                System.out.println("0. Exit");
                System.out.println("---------------------------");

                try {
                    System.out.println("Enter your choice:");
                switch (sc.nextInt()) {
                    case 1:
                        if (counter == customers.length -1)
                            throw new CustomerHandlingException("The array defined is full");
                        System.out.println("Enter the name, password and the registration amount:");
                        Customer c = new Customer(validateEmail(sc.next()), validatePassword(sc.next()), validateRegAmount(sc.nextDouble()));
                        customers[++counter] = c;
                        System.out.println("The customer has successfully registered.");
                        break;

                    case 2:
                        if (counter < 0)
                            throw new CustomerHandlingException("The array is empty");
                        System.out.println("The list of the customers are:\n------------");
                        for (int i = 0; i<=counter; i++){
                            System.out.println(customers[i] + "\n-----------------");
                        }
                        break;

                    case 0:
                        exit = true;
                        System.out.println("Exiting the program.");
                        break;

                    default:
                        break;
                }
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                } catch (CustomerHandlingException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                sc.nextLine();
            }

        }catch (InputMismatchException e) {
            System.out.println("The data entered is not a parsable integer.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sc!= null) {
                sc.close();
            }
        }
    }
}