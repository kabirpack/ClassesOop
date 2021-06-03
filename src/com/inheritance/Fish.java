package com.inheritance;
//Hierarchical Inheritance
public class Fish extends Animal{
    private int fins;
    private String feedType;
    private String habitat;

    public Fish(String name, int brain, int body, int size, int weight, int fins, String feedType, String habitat) {
        super(name, brain, body, size, weight);
        this.fins = fins;
        this.feedType = feedType;
        this.habitat = habitat;
    }

    public void swim(){
        System.out.println("fish.swim() called");
    }

    @Override
    public void move(int speed) {
        swim();
        super.move(speed);
    }

    public void swallow(){
        System.out.println("fish swallowed");
    }

    @Override
    public void eat() {
        swallow();
    }

    public int getFins() {
        return fins;
    }

    public String getFeedType() {
        return feedType;
    }

    public String getHabitat() {
        return habitat;
    }
}
