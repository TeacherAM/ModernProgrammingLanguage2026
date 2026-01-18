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

        // referance data tipler

        int[] numbers = {10, 20, 30, 40};
        String[] users = new String[2];

        User[] teachers = new User[] {
                new User(1,"Jane", 20, "jane@example.com"),
                new User(2,"John", 25, "john@example.com")
        };


        users[0]= "Jane";
        users[1]= "John";
        users[3]= "Kate";
        System.out.println(users[1]);


        // List
        List<String> students = new ArrayList<>();
        students.add("Jane");
        students.add("Kate");


        System.out.println(students.get(1));


        // Set   -- element tekrari olmur

        Set<String> emails = new HashSet<>();

        emails.add("Jane@gmail.com");
        emails.add("Jane@gmail.com");
        emails.add("Kate@gmail.com");
        emails.remove("Jane@gmail.com");



        // Map
          // key , value
        Map<String,Float> countryCodes = new HashMap<>();

        countryCodes.put("AZ", 1.0f);
        countryCodes.put("TR", 0.50f);
        countryCodes.put("US", 1.70f);
        countryCodes.remove("AZ");
        System.out.println( countryCodes.get("TR"));


        System.out.println(countryCodes.containsKey("US"));
        System.out.println(countryCodes.containsValue("Turkey"));


    }
}
