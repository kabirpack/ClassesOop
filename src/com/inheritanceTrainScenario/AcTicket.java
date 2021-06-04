package com.inheritanceTrainScenario;
// multi level inheritance
public class AcTicket extends NonAcTicket {

    private int acCharge;
    private String foodService;

    public AcTicket(String fromAddress, String destination, int baseFare, String pnrNumber, String date, int reservationPrice, int acCharge, String foodService) {
        super(fromAddress, destination, baseFare, pnrNumber, date, reservationPrice);
        this.acCharge = acCharge;
        this.foodService = foodService;
    }

    @Override
    public int getReservationFare() {
        return super.getReservationFare() + acCharge;
    }

    public int getAcTierCost(){
        return acCharge;
    }

    public int getAcCharge() {
        return acCharge;
    }

    public String getFoodService() {
        return foodService;
    }
}
