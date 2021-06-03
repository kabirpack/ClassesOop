package com.abstraction;

abstract class Dog{
    String breed;
    public void bark() {
        System.out.println("Bark");
    }
    public abstract void run(); // not implemented abstract method
    // helps to organise the characters of a class
}

class GermanShepard extends Dog{

    public void run(){
        System.out.println("Dog runs fast");  // implementing abstract method
    }
}

public class AbstractMain {
    public static void main(String[] args){
    GermanShepard germanShepard = new GermanShepard();
    germanShepard.bark();
    germanShepard.run();
    }
}
