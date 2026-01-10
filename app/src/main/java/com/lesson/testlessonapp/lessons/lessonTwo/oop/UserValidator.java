package com.lesson.testlessonapp.lessons.lessonTwo.oop;

public class UserValidator {


    public static boolean isAdult(int age) {
        return age >= 18;
    }


    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static void main(String[] args) {
        System.out.println(isAdult(20));  // true
        System.out.println(isAdult(15));  // false

        System.out.println(isValidEmail("john.doe@gmail.com")); // true
        System.out.println(isValidEmail("johndoegmail.com"));  // false
    }
}
