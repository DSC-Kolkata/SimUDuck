package com.company;

public class RubberDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("No can fly not");
    }

    @Override
    public void quack() {
        System.out.println("Squeaks Squeak Squeaks Squeak Squeaks Squeak ");
    }
}
