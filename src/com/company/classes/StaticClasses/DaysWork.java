package com.company.classes.StaticClasses;

import com.company.Exceptions.ExceptionDay;
import com.company.enums.Days;

public class DaysWork {
    public static void SayDay(int index){
        try {
            System.out.println("сегодня " + Days.values()[index]);
            System.out.println("до жалования осталось " + (6 - index) + " дней");
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new ExceptionDay(index);
        }
    }
}
