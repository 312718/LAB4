package com.company.classes.StaticClasses;

import com.company.interfaces.Sayer;

public class Garder {

    public static void anger() {
        say("Садовник злиться");
    }

    public static void say(String text) {
        Sayer sayer = new Sayer() {// мы создали  обьект(как обьект класса) но так как это интерфейс, то он требует с нас его  реализации
            @Override
            public void say(String text) {
                System.out.println(text);
            }
        };
        sayer.say(text);
    }
}
