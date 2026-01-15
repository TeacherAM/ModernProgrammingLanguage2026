package com.lesson.testlessonapp.lessons.lessonTwo.oop;

public class UserValidator {


    public static boolean isAdult(int age) {
        return age >= 18;
    }


    public static boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }


}
