package com.example.cat;

public class MaineCoonCat extends Cat {

    private String jump;

    @Override
    public void display() {
        //display implementation
        System.out.println("Maine coon cat is displayed, it is very big");
    }

    @Override
    public void jump() {
        if (getJump()!=null){
            System.out.println(jump);
        }
        else System.out.println("Its null thats why i jump high");
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }
}
