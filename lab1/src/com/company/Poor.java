package com.company;

public class Poor {
    private String name;
    private Boolean havedog;

    public Poor(String name, boolean havedog) {
        this.name = name;
        this.havedog = havedog;
    }
    public void laugh (){
        if (havedog) {
            System.out.println("А вы оказывается не бедняк, " + name);
        }
        else {
            System.out.println("Все смеются над " + name);
        }

    }
}
