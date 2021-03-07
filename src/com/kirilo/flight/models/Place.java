package com.kirilo.flight.models;


public class Place {

    private long id;
    private String rRow;
    private long rSeat;
    private TravelClass travelClass;

    public TravelClass getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(TravelClass travelClass) {
        this.travelClass = travelClass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getRRow() {
        return rRow;
    }

    public void setRRow(String rRow) {
        this.rRow = rRow;
    }


    public long getRSeat() {
        return rSeat;
    }

    public void setRSeat(long rSeat) {
        this.rSeat = rSeat;
    }


}
