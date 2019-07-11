package com.company;

public class Warrior extends Heroes implements SuperAbilityApplicable {

    @Override
    public void supAbApp() {
        System.out.println("Воин наносит критический урон");

    }
}
