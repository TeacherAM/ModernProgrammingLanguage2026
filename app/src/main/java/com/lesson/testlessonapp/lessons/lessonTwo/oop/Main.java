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
        System.out.println(UserValidator.isValidEmail("user12@gmail.com"));  // false

        System.out.println(Day.MONDAY.azName);
        User u1 = new User(1,"Elvin", 22, "elvin@email.com");

        User u2 = new User(1,"Elnur", 22, "elnur@email.com");

        System.out.println(u1);
        // instance -- obyektini yaratmaq
        UserDataSource dataSource = new UserDataSource();
        dataSource.getAllUsers();






        dataSource.addUser(u1);
        dataSource.addUser(u2);


        System.out.println(UserValidator.isValidEmail("john.doe@gmail.com")); // true
        System.out.println(UserValidator.isValidEmail("johndoegmail.com"));  // false
    }
}
