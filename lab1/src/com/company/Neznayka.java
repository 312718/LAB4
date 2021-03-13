package com.company;

public class Neznayka {
    private boolean isMoney = false;
    private boolean isEat = false;

    private String magazine = "";

    public String getMagazine() {
        return magazine;
    }

    public void setMagazine() {
        System.out.println("Незнайка заполняет журнал");
        this.magazine = "Прогулка успешна";
        System.out.println(magazine);
    }

    public boolean isMoney() {
        return isMoney;
    }

    public void setMoney(boolean money) {
        isMoney = money;
    }

    public boolean isEat() {
        return isEat;
    }

    public void setEat(boolean eat) {
        isEat = eat;
    }
    public void GoSport() {
        System.out.println("Незнайка и Роланд ходили в спорт зал и бассейн");
    }


}
