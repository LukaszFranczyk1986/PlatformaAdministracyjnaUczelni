package com.studentdatabaseapp;

//package StudentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // Konstruktor: nazwisko i imie studenta, rok

    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.print("Wprowadz imię studenta");
        this.firstName = in.nextLine();

        System.out.print("Wprowadz nazwisko studenta");
        this.lastName = in.nextLine();

        System.out.print("1 - pierwszy rok\n2 - drugi rok\n3 - trzeci rok\n4 - czwarty rok: ");
        this.gradeYear = in.nextInt();

        setStudentID();

        //System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);


    }

    // stworzenie numeru ID
    private void setStudentID() {
        //poziom + ID
        id++;
        this.studentID = gradeYear + " " + id;

    }


    // Zapisanie się na kursy
    public void enroll() {
        //wchodzimy w pętlę, użytkownik 0
        do {
            System.out.print("Wprowadź kurs do zapisania (Q dla wyjścia): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }

        } while (1 != 0);

        //System.out.println("ZAPISANY NA: " + courses);
        //System.out.println("saldo studenta: " + tuitionBalance);
    }

    // Saldo
    public void viewBalance() {
        System.out.println("Twoje saldo to: PLN" + tuitionBalance);
    }


    //Opłata
    public void payTuition() {
        viewBalance();
        System.out.print("Wpisz swoją płatność w PLN:");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Dziękujemy za twoją płatność" + payment + "PLN");
        viewBalance();
    }


    //Status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level1: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: PLN" + tuitionBalance;
    }
}
