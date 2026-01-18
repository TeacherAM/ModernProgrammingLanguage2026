package com.lesson.testlessonapp.lessons.lessonTwo.oop;

//public enum Day {
//    MONDAY,
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
//    SATURDAY,
//    SUNDAY
//}


public enum Day {
    MONDAY("BE"),
    TUESDAY("Çərşənbə axşamı"),
    WEDNESDAY("Çərşənbə"),
    THURSDAY("Cümə axşamı"),
    FRIDAY("Cümə"),
    SATURDAY("Şənbə"),
    SUNDAY("Bazar");

    public final String azName;

    Day(String azName) {
        this.azName = azName;
    }


}