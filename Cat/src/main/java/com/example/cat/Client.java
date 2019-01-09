package com.example.cat;

import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>();

        MaineCoonCat maineCoonCat = new MaineCoonCat();
        //TODO подмена поведения
        maineCoonCat.setJump("Lol");
        cats.add(maineCoonCat);
        cats.add(new MunchkinCat());
        cats.add(new PiggyBankCat());
        cats.add(new ToyCat());

        for (Cat cat : cats) {
            cat.display();
            cat.purr();
            cat.meow();
            cat.jump();
            System.out.println();
        }
    }

}
