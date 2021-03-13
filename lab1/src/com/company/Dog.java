package com.company;

public class Dog {
    private String name;
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        System.out.println("Собака "+ name + " стала здоровее");
    }

    public void Phys() {
        System.out.println("Собака "+ name + " начала физ-зарядку");
        System.out.println("Собака "+ name + " бегает, прыгает");
    }

    public Dog(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void relax(){
        System.out.println("Собака " + name + " отдыхала");
    }

    public void ViewDog() {
        System.out.println("Собака " + name + " показана гостям");

    }
}
