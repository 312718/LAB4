package com.company;

public class Minoga {
    private Perfomance perfomance;

    public Perfomance getPerfomance() {
        return perfomance;
    }

    public void setPerfomance(Perfomance perfomance) {
        this.perfomance = perfomance;
        System.out.println("У Миноги сегодня " + perfomance);
    }

    public void GetDog(){
        System.out.println("Минога взяла Мимишку в театр");
    }
}
