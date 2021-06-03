package com.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
//      without any Encapsulation, fields are directly accessible (code may break if wrong logic implemented)
        UnEncapsulatedPlayer player = new UnEncapsulatedPlayer();
        player.name = "kab";
        player.health = 60;
        player.weapon = "sword";
        int damage = 10;
        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//      Encapsulated objects
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("kab", 200, "Sword");
        System.out.println("Initial health : " + enhancedPlayer.getHealth()); // fields are not directly accessed but with getter.
    }
}
