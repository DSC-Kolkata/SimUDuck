package com.company;

public class WoodenDuck extends Duck{
    @Override
    public void quack() {
        System.out.println("I am a wooden duck so no quack");
    }

    @Override
    public void fly() {
        System.out.println("No can not Fly");
    }
}
