package com.app.core;
public class Student {
    
    private static int idGenarator = 1000;
    private int id, age;
    private String name;
    private String email;
    private double gpa;

    public Student(String name, String email, int age, double score1, double score2, double score3) {
        this.id = idGenarator++;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gpa = (score1 + score2 + score3)/30; 
    }

    public String fetchDetails() {
        return "ID: " + id + "\nName: " + name + "\nEmail: " + email + "\nAge: " + age + "\nGPA: " + gpa;
    }

}