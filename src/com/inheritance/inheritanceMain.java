package com.inheritance;

public class InheritanceMain {
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("woofie", 8, 20, 2, 4, 1, 32, "black silky");

        dog.eat(); // testing overriding
        dog.walk();
        dog.run();
    }
}
