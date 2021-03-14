package com.company.classes.StaticClasses;

import java.util.Random;

public class SportZal {
    private static boolean isFightDogs;

    public static boolean isFightDogs() {
        return isFightDogs;
    }

    public static boolean setFightDogs() {
        isFightDogs = new Random().nextBoolean();
        if(isFightDogs){
            System.out.println("сегоня проходит состязание собак");
        }
        else{
            System.out.println("сегодня нет состязания собак");
        }
        return  isFightDogs();
    }
}
