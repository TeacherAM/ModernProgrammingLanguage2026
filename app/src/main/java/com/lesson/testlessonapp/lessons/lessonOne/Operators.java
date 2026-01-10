package com.lesson.testlessonapp.lessons.lessonOne;

public class Operators {

    public static void main(String[] args) {

        // Operators
        int price = 50;

        price = price + 1;

        price++;  //increment
        price--;  //decrement

        price = price * 5;
        price *= 5;

        price = price / 2;

        int remainder = price % 3;


        // if statements

        int temperature = 25;
        boolean isRaining = false;

        if (temperature > 30 && !isRaining) {
            System.out.println("Go to beach");
        } else if (temperature <= 30 && !isRaining) {
            System.out.println("Go for a walk");
        } else {
            System.out.println("Stay home");
        }

        int day = 3;
        String dayString = "";

        switch(day) {
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Sunday";
                break;
        }

        System.out.println(dayString);





    }
}
