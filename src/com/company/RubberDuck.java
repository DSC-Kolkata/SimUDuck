package com.company;

//TODO: 12: Implement the RubberDuck constructor with relevant behaviors
public class RubberDuck extends Duck {
//    RubberDuck() {
//        super(new FlyNoWay(), new SqeakQuack());
//    }
    @Override
    public void fly() {
        System.out.println("No can fly not");
    }

    @Override
    public void quack() {
        System.out.println("Squeaks Squeak Squeaks Squeak Squeaks Squeak ");
    }
}
