package com.app.tester;

import java.util.Scanner;
import java.util.InputMismatchException;
import static utils.ValidationRules.*;
import com.app.core.Emp;

public class TestEmpOrg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			// emp array
			Emp[] emps = new Emp[10];
			int counter = 0;
			boolean exit = false;
			while (!exit) {
				System.out.println("1 : Hire Emp 2 : Display Info 10:Exit");
				System.out.println("Choose option");
				try {
					switch (sc.nextInt()) {
					case 1: // hire
						System.out.println("Enter emp dtls : em nm dept basic");
						String em = sc.next();
						String nm = sc.next();
						String dept = sc.next();
						double basic123 = sc.nextDouble();
						validateEmpEmail(em);
						validateEmpName(nm);
						validateDept(dept);
						validateBasic(basic123);
						emps[counter++] = new Emp(em, nm, dept, basic123);
						break;

					case 2:
						for (int i = 0; i < counter; i++)
							System.out.println(emps[i]);
						break;
					case 10:
						exit = true;
						break;
					}
				} catch(InputMismatchException e) {
                    e.printStackTrace();
                    sc.next();
                } catch (Exception e) {
					e.printStackTrace();
				}
				//clear off pending i/ps from scanner's buffer
				sc.nextLine();
			}
		} finally {
			if (sc != null)
				sc.close();
		}
	}
}
