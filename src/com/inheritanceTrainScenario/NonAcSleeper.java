package com.inheritanceTrainScenario;
// multilevel inheritance
public class NonAcSleeper extends NonAcTicket{

    private int sleeperClassCost;

    public NonAcSleeper(String fromAddress, String destination, int baseFare, String pnrNumber, String date, int reservationPrice, int sleeperClassCost) {
        super(fromAddress, destination, baseFare, pnrNumber, date, reservationPrice);
        this.sleeperClassCost = sleeperClassCost;
    }

    @Override
    public int getReservationFare() {
        return super.getReservationFare() + sleeperClassCost;
    }

    @Override
    public int getTatkalFare() {
        return super.getTatkalFare() + super.getReservationFare() + super.getTatkalFare();
    }

    public int getSleeperClassCost() {
        return sleeperClassCost;
    }
}
