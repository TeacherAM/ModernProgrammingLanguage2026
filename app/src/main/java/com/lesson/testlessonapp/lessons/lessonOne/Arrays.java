package com.lesson.testlessonapp.lessons.lessonOne;

import com.lesson.testlessonapp.lessons.lessonTwo.oop.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arrays {


    public static void main(String[] args) {



        int[] numbers = {10, 20, 30, 40};
        String[] users = new String[2];

        User[] teachers = new User[] {
                new User("Jane", 20, "jane@example.com"),
                new User("John", 25, "john@example.com")
        };


        users[0]= "Jane";
        users[1]= "John";
        System.out.println(users[1]);


        // List
        List<String> students = new ArrayList<>();
        students.add("Jane");
        students.add("Kate");


        System.out.println(students.get(1));


        // Set

        Set<String> emails = new HashSet<>();

        emails.add("Jane@gmail.com");
        emails.add("Jane@gmail.com");
        emails.add("Kate@gmail.com");
        emails.remove("Jane@gmail.com");



        // Map

        Map<String,String> countryCodes = new HashMap<>();

        countryCodes.put("AZ", "Azerbaijan");
        countryCodes.put("TR", "Turkey");
        countryCodes.put("US", "United States");
        countryCodes.remove("AZ");
        System.out.println( countryCodes.get("TR"));


        System.out.println(countryCodes.containsKey("US"));
        System.out.println(countryCodes.containsValue("Turkey"));


    }
}
