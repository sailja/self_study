/**
 * 
 */
package com.cdac.tester;
import java.util.Scanner;
import java.util.InputMismatchException;
import com.cdac.core.*;

/**
 * @author Umang Sharma
 *
 */
public class EventOrganizer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Enter the size of the hall:");
			Person[] hall = new Person[sc.nextInt()];
			boolean exit = false;
			int counter = -1;
			
			while(!exit) {
				try {
					System.out.println("--------------MENU------------");
					System.out.println("1. Register Faculty.");
					System.out.println("2. Register Student.");
					System.out.println("3. Display info of all registered members.");
					System.out.println("4. Introduce yourself.");
					System.out.println("5. Submit Feedback or Evaluation.");
					System.out.println("0. Exit");
					System.out.println("------------------------------");
					
					System.out.print("Enter your desired choice:");
					switch (sc.nextInt()) {
					case 1:
						if (counter == hall.length -1) {
							System.out.println("The hall is booked out. Please select another option.");
							break;
						}
						System.out.println("Enter the First name, Last name, Years of Experience and Working domain:");
						hall[++counter] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
						break;
						
					case 2:
						if (counter == hall.length -1) {
							System.out.println("The hall is booked out. Please select another option.");
							break;
						}
						System.out.println("Enter the First name, Last name, Grad year and Course name:");
						hall[++counter] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next());
						break;
						
					case 3:
						System.out.println("\n\nThe details of all registered members are:");
						System.out.println("********************************");
						for ( int i=0; i<=counter; i++) {
							System.out.println(hall[i]);
							System.out.println("********************************");
						}
						break;
						
					case 4:
						System.out.print("Enter the seat number:");
						int seatNo = sc.nextInt();
						if (seatNo <= 0 || seatNo>(counter+1)) {
							System.out.println("The seat no given does not exist or has not been allocated.");
							break;
						}
						Person p = hall[seatNo - 1];
						p.introduce();
						break;
						
					case 5:
						System.out.print("Enter the seat number:");
						int seat = sc.nextInt();
						if (seat <= 0 || seat>(counter+1)) {
							System.out.println("The seat no given does not exist or has not been allocated.");
							break;
						}
						Person p1 = hall[seat - 1];
						if (p1 instanceof Faculty) {
							((Faculty)p1).evaluate();
						} else {
							((Student)p1).feedback();
						}
						break;
						
					case 0:
						System.out.println("Exiting the program.");
						exit = true;
						break;
						
					default: 
						System.out.println("Please choose a valid option.");
					}
					
				} catch(InputMismatchException e) {
					System.out.println("Please enter the data in the correct format.");
					sc.nextLine();
				}
			}
		} catch(InputMismatchException e) {
			System.out.println("The data entered is not in a valid format.\nExiting the program.");
		} finally {
			sc.close();
		}

	}
}
