package com.company;

import com.company.Exceptions.ExceptionDay;
import com.company.classes.NonStaticClasses.*;
import com.company.classes.StaticClasses.Day;
import com.company.classes.StaticClasses.DaysWork;
import com.company.classes.StaticClasses.Garder;
import com.company.classes.StaticClasses.SportZal;
import com.company.enums.DayTime;
import com.company.enums.Perfomance;

import java.awt.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Dog[] Dogs = new Dog[2];
        Dogs[0] = new Dog("Роланд",8);
        Dogs[1] = new Dog("Мимишка",7);
        Neznayka neznayka = new Neznayka();
        Minoga minoga = new Minoga();
        Kozlik kozlik = new Kozlik();

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
                Poor Tom = new Poor("Бедняк " + i, new Random().nextBoolean());
                Tom.laugh();
            }
            neznayka.GoSport();
            if(SportZal.setFightDogs()){
                neznayka.see("состязание" , Dogs[0].getName());
            }
            else{
                neznayka.setPlace(kozlik.getName(),Dogs[0].getName());
            }
        }

        neznayka.pleaseMoney(minoga.getName());
        int i = 0;
        while (i < 8){
            try {
                DaysWork.SayDay(i);
            }
            catch (ExceptionDay e){
                System.out.println(e.getMessage());
            }
            neznayka.Wait();
            i++;
        }
        neznayka.setMoney(true);
        kozlik.eat(neznayka);
        kozlik.getPlace();
        neznayka.getPlace();
        minoga.Varning(neznayka.getName(), kozlik.getName());
        neznayka.oslyshals(kozlik.getName());
        neznayka.pay("доктора", kozlik.getName());
    }

}