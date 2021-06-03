package com.classIntro;

public class ClassMain {
    public static void main(String[] args){
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.serviceCar("waterwash","oilwash");
        porsche.serviceCar("brake check", "Air Check", "Tyrechange");
    }
}
