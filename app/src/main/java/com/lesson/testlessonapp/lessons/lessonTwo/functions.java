package com.lesson.testlessonapp.lessons.lessonTwo;

import com.lesson.testlessonapp.lessons.lessonTwo.oop.UserValidator;

public class functions {



    double sum(double a, double b) { return a + b; }

    // T2
    int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        int age = 20;
        String email = "john.doe@gmail.com";

        System.out.println(email + " is valid? " + UserValidator.isValidEmail(email));

        System.out.println(age + " is adult? " + UserValidator.isAdult(age));


    }
}
