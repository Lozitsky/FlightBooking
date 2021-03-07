package com.kirilo.flight.models.directories;


import com.kirilo.flight.models.Place;

import java.time.LocalDateTime;

public class Reservation {

  private long id;
  private String code;
  private Flight flight;
  private Place place;
  private Passenger passenger;
  private LocalDateTime reserveDate;

  public Flight getFlight() {
    return flight;
  }

  public void setFlight(Flight flight) {
    this.flight = flight;
  }

  public Place getPlace() {
    return place;
  }

  public void setPlace(Place place) {
    this.place = place;
  }

  public Passenger getPassenger() {
    return passenger;
  }

  public void setPassenger(Passenger passenger) {
    this.passenger = passenger;
  }

  public LocalDateTime getReserveDate() {
    return reserveDate;
  }

  public void setReserveDate(LocalDateTime reserveDate) {
    this.reserveDate = reserveDate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

}
