package com.company;

public class Heroes extends Player implements SuperAbilityApplicable{
    private String hitType;

    public String getHitType() {
        return hitType;
    }

    public void setHitType(String hitType) {
        this.hitType = hitType;
    }

    @Override
    public void supAbApp() {

    }
}
