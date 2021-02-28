package utils;

import cust_excs.EmpHandlingException;

public class ValidationRules {
	public static final int MIN_LEN;
	public static final int MAX_LEN;
	public static final double MIN_BASIC;
	static {
		MIN_LEN = 4;
		MAX_LEN = 10;
		MIN_BASIC=5000;
	}

	// method to validate emp name
	public static void validateEmpName(String nm) throws Exception {
		if (nm.length() < MIN_LEN || nm.length() > MAX_LEN)
			throw new EmpHandlingException("Invalid emp name");
		System.out.println("valid name");
	}
	// method to validate email

	public static void validateEmpEmail(String email) throws Exception {
		if (email.length() < MIN_LEN || email.length() > MAX_LEN || !email.contains("@"))
			throw new EmpHandlingException("invalid email");
	}

	// validate dept id
	public static void validateDept(String deptId) throws Exception {
		switch (deptId) {
		case "rnd":
		case "hr":
		case "mktg":

			break;

		default:
			throw new EmpHandlingException("Invalid dept id!!!!");
		}
	}
	public static void validateBasic(double basic) throws Exception {
		if (basic < MIN_BASIC)
			throw new EmpHandlingException("min wages condition not met!!!!!");
	}
}
