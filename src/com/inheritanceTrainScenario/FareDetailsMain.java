package com.inheritanceTrainScenario;

public class FareDetailsMain {
    public static void main(String[] args){
        NonAcTicket nonAcTicket = new NonAcTicket("Mayiladuturai","chennai", 1200, "DFR34","12/06/21",350);
        System.out.println("for booking non-Ac coach in tatkal, the fare is: " + nonAcTicket.getTatkalFare());
        System.out.println("reservation cost for non-Ac coach is " + nonAcTicket.getReservationPrice());
    }
}
