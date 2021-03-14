package com.company.classes.StaticClasses;

import com.company.enums.DayTime;

public class Day {
    private static DayTime time;

    public static DayTime getTime() {
        return time;
    }

    public static void setTime(DayTime time) {
        Day.time = time;
        System.out.println("Сейчас " + time);
    }
}
