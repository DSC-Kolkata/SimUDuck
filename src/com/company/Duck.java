package com.company;



//TODO: 08: Power of Composition- Make Duck Recieve a QuackBehavior and a FlyBehavior

public abstract class Duck implements Quackable, Flyable {
    void display(){
        System.out.println("Hello! I am a Duck");
    }

    void swim(){
        System.out.println("I am a Duck and I'm swimming");
    }

}
//
//public abstract class Duck{
//    FlyBehavior flyBehavior;
//    QuackBehavior quackBehavior;
//    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
//        this.flyBehavior = flyBehavior;
//        this.quackBehavior = quackBehavior;
//    }
//    void display(){
//        System.out.println("Hello! I am a Duck");
//    }
//
//    void swim(){
//        System.out.println("I am a Duck and I'm swimming");
//    }
//
////    //TODO: 09: Make the Duck use the FlyBehavior and QuackBehavior
////    void fly(){
////        flyBehavior.fly();
////    }
////
////    void quack(){
////        quackBehavior.quack();
////    }
//
//}
