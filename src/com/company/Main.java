package com.company;

public class Main {

    public static void main(String[] args) {
        Heroes[] heroes = {new Warrior(), new Mental(), new Magical()};
        for (int i=0; i<heroes.length; i++ ){
            heroes[i].supAbApp();
        }



    }
}
