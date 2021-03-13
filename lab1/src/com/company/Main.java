package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Dog [] Dogs = new Dog[2];
        Dogs[0] = new Dog("Роланд",8);
        Dogs[1] = new Dog("Мимишка",7);
        Neznayka neznayka = new Neznayka();
        Minoga minoga = new Minoga();


        for (int i = 0; i< Dogs.length; i++) {
            Dogs[i].Phys();
        }
        for (int i = 0; i< Dogs.length; i++) {
            Dogs[i].setHealth(Dogs[i].getHealth()+1);
        }

        Garder.anger();

        for (int i = 0; i< Dogs.length; i++) {
            Dogs[i].relax();
        }

        neznayka.setMagazine();
        Day.setTime(DayTime.Ужин);

        int per = new Random().nextInt(2);
        if (per == 0) {
            minoga.setPerfomance(Perfomance.Ужин);
            for (int i = 0; i< Dogs.length; i++) {
                Dogs[i].ViewDog();
            }

        }
        else {
            minoga.setPerfomance(Perfomance.Театр);
            minoga.GetDog();
            for (int i = 0; i<5; i++){
                Poor Tom = new Poor("Бедняк " + i, new Random().nextInt(2) == 1);
                Tom.laugh();
                Neznayka.G
            }
        }

    }

}