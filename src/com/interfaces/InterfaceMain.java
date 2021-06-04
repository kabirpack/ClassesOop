package com.interfaces;

interface CarDesign{
    //outline of car
    void startUp();
    void accelerate();
}

public class InterfaceMain implements CarDesign {

    public static void main(String[] args){
        String model = "SUV";
        String color = "black";
        String brand = "Audi";
        System.out.println(model + "," + color + "," + brand);
        InterfaceMain car = new InterfaceMain();
        car.startUp();
        car.accelerate();
    }
    // implementation of interface
    @Override
    public void startUp() {
        System.out.println("Started up and ready to race!");
    }

    @Override
    public void accelerate() {
        System.out.println("Race begins....");
    }
}
