package com.company.classes.NonStaticClasses;

import com.company.classes.AbstractClasses.Name;
import com.company.interfaces.People;

public class Poor extends Name implements People {

    private Boolean havedog;

    public Poor(String name, boolean havedog) {
        this.name = name;
        this.havedog = havedog;
    }
    public void laugh (){
        if (havedog) {
            say("А вы оказывается не бедняк, " + name);
        }
        else {
            say("Все смеются над " + name);// тут мы просто вызываем метод котроый выводит текст на экран)
        }
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
}
