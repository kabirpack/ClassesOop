package com.inheritanceTrainScenario;
// multiple inheritance
public class NonAcTicket extends Ticket implements Tatkal {

    private int reservationPrice;

    public NonAcTicket(String fromAddress, String destination, int baseFare, String pnrNumber, String date, int reservationPrice) {
        super(fromAddress, destination, baseFare, pnrNumber, date);
        this.reservationPrice = reservationPrice;
    }

    public int getReservationFare(){
        return super.getBaseFare() + reservationPrice;
    }

    @Override
    public int getTatkalFare() {
        return super.getBaseFare() + reservationPrice + tatkalFare;
    }

    public int getReservationPrice() {
        return reservationPrice;
    }
}
