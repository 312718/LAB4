package com.company.classes.NonStaticClasses;

import com.company.classes.AbstractClasses.Name;
import com.company.interfaces.People;
import com.company.enums.Perfomance;

public class Minoga extends Name implements People  {
    private Perfomance perfomance;

    public Perfomance getPerfomance() {
        return perfomance;
    }

    public Minoga(){
        name = "Минога";
    }

    public void setPerfomance(Perfomance perfomance) {
        this.perfomance = perfomance;
        say("У Миноги сегодня " + perfomance);
    }

    public void GetDog(){
        say("Минога взяла Мимишку в театр");
    }

    @Override// так как мы наследовали интерфейс (череез implements) мы обязаны реализовать этот метод
    public void say(String text) {
        System.out.println(text);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    public void Varning(String name, String name1){
        say(this.name + " сказала, что " + name + " не должен общатся с " + name1);

    }
}
