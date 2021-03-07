package com.kirilo.flight.models.directories;


import com.kirilo.flight.models.Aircraft;
import com.kirilo.flight.models.City;

import java.time.LocalDateTime;

public class Flight {

    private long id;
    private String code;
    private LocalDateTime dateTime;
    private Aircraft aircraft;
    private long duration;
    private City fromCity;
    private City toCity;

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(City fromCity) {
        this.fromCity = fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(City toCity) {
        this.toCity = toCity;
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

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }


}
