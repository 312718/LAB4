package com.company.classes.NonStaticClasses;

import com.company.Exceptions.waitException;
import com.company.classes.AbstractClasses.Name;
import com.company.interfaces.Sayer;

import java.io.IOException;

public class Neznayka extends Name {

    private boolean isMoney = false;
    private boolean isEat = false;

    private String magazine = "";

    public String getMagazine() {
        return magazine;
    }
    public Neznayka(){
        name  = "Незнайка";
    }

    public void setMagazine() {
        say(name + " заполняет журнал");
        this.magazine = "Прогулка успешна";
        System.out.println(magazine);
    }

    public boolean isMoney() {
        return isMoney;
    }

    public void setMoney(boolean money) {
        isMoney = money;
        say(name + " получает жалование");
    }

    public boolean isEat() {
        return isEat;
    }

    public void setEat(boolean eat, String name) {
        isEat = eat;
        say(name + " кормит " + name);
    }
    public void Wait() throws waitException {
        try{
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            throw new waitException(this.name);
        }
    }
    public void GoSport() {
        say(name + " и Роланд ходили в спорт зал и бассейн");
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
    public void oslyshals(String name){
        say("он ослушался и пошел к " + name);
    }
    public void pleaseMoney(String name){
        say(name + " просит у " + name + " жалование");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getPlace(){
        return name + " в большом доме";
    }
    public void pay(String who, String name){
        isMoney = false;
        say("незнайка оплатил " + who + " для " + name);
    }
    public void see(String name, String name1){
        say(this.name + " смотрит " + name + " с " + name1);
    }
    public void setPlace(String place ,String name){
        say(this.name + " c " + name + " идут к " + place);
    }

}
