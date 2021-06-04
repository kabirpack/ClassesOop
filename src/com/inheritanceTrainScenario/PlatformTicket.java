package com.inheritanceTrainScenario;
// Hierarchical inheritance
public class PlatformTicket extends Ticket {

    private int platformTicketPrice;
    private String validFrom;
    private String validTo;

    public PlatformTicket(String fromAddress, String destination, int baseFare, String pnrNumber, String date, int platformTicketPrice, String validFrom, String validTo) {
        super("null", "", 0, "null", date);
        this.platformTicketPrice = platformTicketPrice;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public int getPlatformTicketPrice() {
        return platformTicketPrice;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    {

    }
}
