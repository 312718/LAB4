package com.company.classes.NonStaticClasses;

import com.company.classes.AbstractClasses.Animal;
import com.company.interfaces.Sayer;

import java.security.DrbgParameters;

public class Kozlik extends Animal implements Sayer {

    @Override
    public void setHealth(int health) {
        this.health = health;
        say("здоровье " + name + " увеличилось");
    }
    public Kozlik(){/* смотри. Ты же видела что прими ValueOf там была куча методов с одним названием.
        Так вот. Мы создали два конструктора, и если мы звхотим мы можем вызвать так:
        new Kozlik() и по умолчанию имя будет Козлик
        или
        new Kozlik(и здесь вписать его имя)))) */
        name = "Козлик";
    }
    public Kozlik(String name){
        this.name = name;
    }
    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say(String text) {
        System.out.println(text);
    }

    public void eat(Neznayka neznayka){
        neznayka.setEat(false, name);
    }
    public String getPlace(){
        return name + " в ночлежке";
    }

}
