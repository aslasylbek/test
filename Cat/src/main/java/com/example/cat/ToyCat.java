package com.example.cat;

public class ToyCat extends Cat {


    public void display() {
        //display implementation
        System.out.println("Toy cat is displayed, it is soft");
    }

    @Override
    public void purr() {
        //do nothing
        System.out.println("This cat does not purr!");
    }

    @Override
    public void jump() {
        //do nothing
        System.out.println("This cat does not jump!");
    }
}
