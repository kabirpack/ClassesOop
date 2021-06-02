package com.classIntro;

public class classMain {
    public static void main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
