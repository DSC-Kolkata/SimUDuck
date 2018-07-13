package com.company;


public abstract class Duck implements Quackable, Flyable {
    void display(){
        System.out.println("Hello! I am a Duck");
    }

    void swim(){
        System.out.println("I am a Duck and I'm swimming");
    }

}
