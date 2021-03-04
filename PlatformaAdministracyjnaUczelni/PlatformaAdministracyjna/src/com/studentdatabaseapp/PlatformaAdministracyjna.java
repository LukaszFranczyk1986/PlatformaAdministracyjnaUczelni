package com.studentdatabaseapp;
//package StudentDatabaseApp;

import java.util.Scanner;

public class PlatformaAdministracyjna {

    public static void main(String[] args) {


        //Student stu2 = new Student();
        //stu2.enroll();
        //stu2.payTuition();
        //System.out.println(stu2.toString());

        //Student stu3 = new Student();
        //stu3.enroll();
        //stu3.payTuition();
        //System.out.println(stu3.toString());

        // Jak dużo użytkowników chcemy dodać

        System.out.println("Wpisz liczbę nowych studentów do zapisania: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        //Student[] students = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Stworzenie n liczby nowych studentów
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }

        //for (int n = 0; n < numOfStudents; n++) {
            //System.out.println(students[n].toString());
        //}
    }

}
