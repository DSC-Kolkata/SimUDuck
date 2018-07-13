package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.swim();
        redheadDuck.quack();
        mallardDuck.swim();

//        //TODO: 02-Make the Wooden Duck Quack
//        WoodenDuck woodenDuck = new WoodenDuck();
//        woodenDuck.quack();

//        //TODO: 04-See the Ducks Fly- The Fall of Inheritance
//        mallardDuck.fly();
//        redheadDuck.fly();
//        woodenDuck.fly();
//        rubberDuck.fly();

    }
}
