package com.classIntro;
// encapsulation is done here.
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        // encapsulation validation
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
    // overloading
    public void serviceCar(String service1, String service2){
        System.out.println("This car is done with " + service1 + ", " + service2 + " services");
    }

    public void serviceCar(String service1, String service2, String service3){
        System.out.println("This car is done with " + service1 + ", " + service2 + ", " + service3 +  " services");
    }
}
