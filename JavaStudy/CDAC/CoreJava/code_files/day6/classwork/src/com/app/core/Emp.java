package com.app.core;

public class Emp {
	private int id;
	private String email, name, dept;
	private double basic;
	public static int idGenerator;
	static {
		idGenerator = 100;
	}

	public Emp(String email, String name, String dept, double basic) {
		super();
		this.email = email;
		this.name = name;
		this.dept = dept;
		this.basic = basic;
		id=idGenerator++;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", email=" + email + ", name=" + name + ", dept=" + dept + ", basic=" + basic + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Emp)
			return id == ((Emp) o).id;
		return false;
	}
}
