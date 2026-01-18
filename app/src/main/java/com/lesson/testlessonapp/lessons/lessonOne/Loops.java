package com.lesson.testlessonapp.lessons.lessonOne;

import java.util.List;

public class Loops {

    public static void main(String[] args) {


        int[] prices = {120, 150, 200, 90, 300};
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }

        double average = (double) sum / prices.length;
        System.out.println("Average: " + average);


        List<String> productNames = List.of("Laptop", "Keyboard", "Mouse");

        for (String product : productNames) {
            System.out.println(product);
        }

        int listIndex = 0;
        while (listIndex < productNames.size()) {
            System.out.println(productNames.get(listIndex));
            listIndex++;
        }


        int number = 453; // 4
        int result = 0;  // 50



        // T1
        do {
            int digit = number % 10;
            result += digit*digit;    // 34+16=50   result = result + digit*digit
            number /= 10;   //   45/ 10 =45     number = number / 10
        } while (number != 0);

        ///


        System.out.println("Rəqəmlərin kvadratları cəmi: " + result);


        int hours = 2;

        int minutes = 10;

        int seconds = 0;
        // T3
        for (int h = hours; h >= 0; h--) {   // 1
            for (int m = minutes; m >= 0; m--) {  // 7,6,5,4,3.....0
                for (int s = seconds; s >= 0; s--) {
                    System.out.println(h + " : " + m + " : " + s); //9,8,7,6,5,...1,0, 59,58,57....0,59....0

                }
                seconds = 59;
            }
            minutes = 59;
        }

    }
}
