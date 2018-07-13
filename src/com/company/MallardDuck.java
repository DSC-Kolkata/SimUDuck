package com.company;

//TODO: 10: Make MallardDuck give Behavior to Constructor
public class MallardDuck extends Duck {
//    MallardDuck() {
//        super(new FlyWithWings(), new QuackQuack());
//    }

    @Override
    public void fly() {
        System.out.println("Flap Flap Flap Flap Flap");
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack Quack Quack Quack Quack Quack ");
    }
}
