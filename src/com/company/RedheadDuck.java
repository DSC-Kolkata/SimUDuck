package com.company;

//TODO: 11: Implement RedheadDuck constructor
public class RedheadDuck extends Duck {
//    RedheadDuck() {
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
