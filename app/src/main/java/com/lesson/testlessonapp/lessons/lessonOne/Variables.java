package com.lesson.testlessonapp.lessons.lessonOne;

public class Variables {
    //psvm   --> public static void main
    //sout   --> System.out.println();

   //access modifier - public , protected, private
    public static void main(String[] args){

                 //primitive data types , reference data types


        //Primitive data types
        // Byte (-128 to 127)
        byte age = 25;
        final byte MIN_AGE = 18;

        // Short (-32,768 to 32,767)
        short productCount = 1500;
        final short MAX_PRODUCTS = 5000;

        // Int
        int userId = 10245;
        int salary = 1200;
        final int MAX_USERS = 100000;

        // Long
        long phoneNumber = 994502223344L;
        long timestamp = System.currentTimeMillis();
        final long COMPANY_ID = 12345678901L;

        // Float
        float productPrice = 19.99f;
        final float PI_FLOAT = 3.14f;

        //Char
        final char CURRENCY = '$';

        // String

        String name = "John";
        String email = "John@example.com";
        final String APP_NAME = "MyAndroidApp";

        System.out.println("Hello world");
    }



}
