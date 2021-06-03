package com.inheritance;

public class InheritanceMain {
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("woofie", 8, 20, 2, 4, 1, 32, "black silky");
        //inherited from animal class
        System.out.println("Single inheritance------------------");
        dog.eat(); // testing overriding
        dog.walk();
        dog.run();

        System.out.println("Multiple inheritance-----------------");
        // inherited from dog class
        GrayWolf grayWolf = new GrayWolf("snow", 10, 50, 2, 4, 1, 40, "thick fur","Excellent");
        grayWolf.move(5);
        System.out.println(grayWolf.getName());

        System.out.println("Hierarchical inheritance-----------------");
        // inherited from animal class
        Fish fish = new Fish("pomfret",1,1,3,2,4,"surface feeder","salt water");
        fish.move(5);
        fish.eat();
        
    }
}
