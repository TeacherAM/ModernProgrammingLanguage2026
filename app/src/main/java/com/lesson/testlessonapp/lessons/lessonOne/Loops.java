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

    }
}
