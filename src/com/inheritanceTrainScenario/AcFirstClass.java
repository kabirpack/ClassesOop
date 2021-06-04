package com.inheritanceTrainScenario;

public class AcFirstClass extends AcTicket{

    private int tierOneCost;

    public AcFirstClass(String fromAddress, String destination, int baseFare, String pnrNumber, String date, int reservationPrice, int acCharge, String foodService, int tierOneCost) {
        super(fromAddress, destination, baseFare, pnrNumber, date, reservationPrice, acCharge, "Available");
        this.tierOneCost = tierOneCost;
    }

    @Override
    public int getReservationFare() {
        return super.getReservationFare()+this.tierOneCost;
    }
}
