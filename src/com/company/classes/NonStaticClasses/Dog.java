package com.company.classes.NonStaticClasses;

import com.company.classes.AbstractClasses.Animal;
import com.company.classes.AbstractClasses.Name;
import com.company.interfaces.Sayer;

public class Dog extends Animal {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        say("Собака "+ name + " стала здоровее");
    }

    public void Phys() {
        say("Собака "+ name + " начала физ-зарядку");
        say("Собака "+ name + " бегает, прыгает");
    }

    public Dog(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void relax(){
        say("Собака " + name + " отдыхала");
    }

    public void ViewDog() {
        say("Собака " + name + " показана гостям");

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
