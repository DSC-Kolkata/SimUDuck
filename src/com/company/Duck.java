package com.company;


//TODO: 04: Make the Duck class Implement the Flyable and Quackable Interfaces, make it Abstract
public class Duck {
//public abstract class Duck implements Quackable, Flyable {
    void display(){
        System.out.println("Hello! I am a Duck");
    }

    void swim(){
        System.out.println("I am a Duck and I'm swimming");
    }

    //TODO: 01-Remove quack() and fly() from the Duck class
    void quack(){
        System.out.println("I am a Duck and Quack Quack Quack Quack");
    }

    void fly(){
        System.out.println("Flap Flap FLap FLap FLap");
    }
}
