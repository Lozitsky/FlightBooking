package com.kirilo.flight.models;


public class Country {

    private long id;
    private String name;
    private String shortName;
    private byte[] flag;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }


    public byte[] getFlag() {
        return flag;
    }

    public void setFlag(byte[] flag) {
        this.flag = flag;
    }

}
