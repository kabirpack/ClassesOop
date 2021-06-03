package com.encapsulation;

public class UnEncapsulatedPlayer {
//    Without Encapsulation Fields are public and without validation(less control)
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <=0){
            System.out.println("Player knocked out"); // reduce player lives

        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
