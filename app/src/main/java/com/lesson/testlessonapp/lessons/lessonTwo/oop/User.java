package com.lesson.testlessonapp.lessons.lessonTwo.oop;

public class User {

    private int id;

    private String name;
    private int age;
    private String email;


    // constructor -- default metoddur  ilk ise dusen
    public User(int id,String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }



    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }



    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }





    public void printInfo() {
        System.out.println("User Info: Name=" + name + ", Age=" + age + ", Email=" + email);
    }







}