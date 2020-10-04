package com.example.members.controller;

public class ManageMembers {

    private String memberFirstName;
    private String memberLastName;
    private String memberStreet;
    private int memberStreetNumber;
    private int memberPostalCode;
    private String memberCity;
    private int memberMobileNumber;

    public ManageMembers(String memberFirstName, String memberLastName, String memberStreet, int memberStreetNumber,
                         int memberPostalCode, String memberCity, int memberMobileNumber) {
        this.memberFirstName = memberFirstName;
        this.memberLastName = memberLastName;
        this.memberStreet = memberStreet;
        this.memberStreetNumber = memberStreetNumber;
        this.memberPostalCode = memberPostalCode;
        this.memberCity = memberCity;
        this.memberMobileNumber = memberMobileNumber;
    }

    private String getMemberFirstName() {
        return memberFirstName;
    }

    public String getMemberLastName() {
        return memberLastName;
    }

    public String getMemberStreet() {
        return memberStreet;
    }

    public int getMemberStreetNumber() {
        return memberStreetNumber;
    }

    public int getMemberPostalCode() {
        return memberPostalCode;
    }

    public String getMemberCity() {
        return memberCity;
    }

    public int getMemberMobileNumber() {
        return memberMobileNumber;
    }

    public void setMemberFirstName(String memberFirstName) {
        this.memberFirstName = memberFirstName;
    }

    public void setMemberLastName(String memberLastName) {
        this.memberLastName = memberLastName;
    }

    public void setMemberStreet(String memberStreet) {
        this.memberStreet = memberStreet;
    }

    public void setMemberStreetNumber(int memberStreetNumber) {
        this.memberStreetNumber = memberStreetNumber;
    }

    public void setMemberPostalCode(int memberPostalCode) {
        this.memberPostalCode = memberPostalCode;
    }

    public void setMemberCity(String memberCity) {
        this.memberCity = memberCity;
    }

    public void setMemberMobileNumber(int memberMobileNumber) {
        this.memberMobileNumber = memberMobileNumber;
    }
}
