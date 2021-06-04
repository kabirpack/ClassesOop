package com.inheritanceTrainScenario;
// Base class
interface Tatkal {
    int tatkalFare = 250;
    int getTatkalFare();
}

public class Ticket {
    private String fromAddress;
    private String destination;
    public int baseFare;
    private String pnrNumber;
    private String date;

    public Ticket(String fromAddress, String destination, int baseFare, String pnrNumber, String date) {
        this.fromAddress = fromAddress;
        this.destination = destination;
        this.baseFare = baseFare;
        this.pnrNumber = pnrNumber;
        this.date = date;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public String getDestination() {
        return destination;
    }

    public int getBaseFare() {
        return baseFare;
    }

    public String getPnrNumber() {
        return pnrNumber;
    }

    public String getDate() {
        return date;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setBaseFare(int baseFare) {
        this.baseFare = baseFare;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
