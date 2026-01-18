package com.lesson.testlessonapp.lessons.lessonTwo.oop;

import java.util.ArrayList;
import java.util.List;

public class UserDataSource {
    private List<User> users;

    public UserDataSource() {
        users = new ArrayList<>(); // n
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getId());
    }

    public void deleteUser(int id) {
        User user = getUserById(id);
        if (user != null) {
            user.printInfo();
            users.remove(user);
            System.out.println("User deleted");

        } else {
            System.out.println("User not found " + id);
        }
    }



    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }


    public void updateUser(int id, String newName, int newAge, String newEmail) {
        User user = getUserById(id);
        if (user != null) {
            user.setName(newName);
            user.setAge(newAge);
            user.setEmail(newEmail);
            System.out.println("User updated");
            user.printInfo();
        } else {
            System.out.println("User not found " + id);
        }
    }

    public void getAllUsers() {
        System.out.println("All Users:");
        for (User user : users) {
            user.printInfo();
        }
    }







}
