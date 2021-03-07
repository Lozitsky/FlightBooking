package com.kirilo.flight.models.directories;


public class Passenger {

  private long id;
  private String firstName;
  private String middleName;
  private String lastName;
  private String docNumber;
  private String email;
  private String mobile;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getDocNumber() {
    return docNumber;
  }

  public void setDocNumber(String docNumber) {
    this.docNumber = docNumber;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

}
