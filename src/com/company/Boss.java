package com.company;

import java.util.Random;

public class Boss extends Player {
    private int bossDefence;


    public int getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(int bossDefence) {
        this.bossDefence = bossDefence;
    }

    public void changeBossDefence() {
        Random r = new Random();
        int randomNumber = r.nextInt(3) + 1;
        setBossDefence(randomNumber);}



}
