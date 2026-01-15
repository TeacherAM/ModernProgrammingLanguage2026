package com.lesson.testlessonapp.lessons.lessonTwo.oop;

public class Main {
    // kiss -- KEEP IT SIMPLE, STUPID
    public int sumNumbers(int a, int b) {
        int result = 0;
        if(a != 0 || b != 0) {
            result = a + b;
        } else {
            result = 0;
        }
        return result;
    }

    public float sumNumbers(float a, float b) {
        return a + b;
    }

    //YAGNI – “You Aren’t Gonna Need It



   // DRY – “Don’t Repeat Yourself”

    public static void main(String[] args) {
        System.out.println(UserValidator.isAdult(20));  // true
        System.out.println(UserValidator.isAdult(15));  // false

        System.out.println(UserValidator.isValidEmail("john.doe@gmail.com")); // true
        System.out.println(UserValidator.isValidEmail("johndoegmail.com"));  // false
    }
}
