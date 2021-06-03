package com.inheritance;
// multiple inheritance
public class GrayWolf extends Dog{
    private String huntingAbility;

    public GrayWolf(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat, String huntingAbility) {
        super(name, size, weight, eyes, legs, tail, teeth, coat);
        this.huntingAbility = huntingAbility;
    }

    public void hunt(){
        System.out.println("The gray wolf hunts");
    }

    public String getHuntingAbility() {
        return huntingAbility;
    }

    private void chew(){
        System.out.println("grayWolf.chew() called");
    }

    // method overriding Animal.eat()
    @Override
    public void eat() {
        System.out.println("grayWolf.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("grayWolf.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("grayWolf.run() called");
        move(10); // calling overridden method
    }

    private void moveLegs(int speed){
        System.out.println("grayWolf.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("grayWolf.move() called");
        moveLegs(speed);
        super.move(speed); // calling original non-overridden method
    }

}
