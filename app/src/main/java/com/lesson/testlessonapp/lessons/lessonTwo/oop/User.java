package com.lesson.testlessonapp.lessons.lessonTwo.oop;

public class User {

    private String name;
    private int age;
    private String email;



    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }




    public void printInfo() {
        System.out.println("User Info: Name=" + name + ", Age=" + age + ", Email=" + email);
    }







}