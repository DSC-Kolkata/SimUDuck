package com.company;

//TODO: 13: Implement the WoodenDuck constructor with its relevant Behaviors
public class WoodenDuck extends Duck{

//    WoodenDuck() {
//        super(new FlyNoWay(), new MuteQuack());
//    }

    @Override
    public void quack() {
        System.out.println("I am a wooden duck so no quack");
    }

    @Override
    public void fly() {
        System.out.println("No can not Fly");
    }
}
