/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.customer;

import java.io.Serializable;

/**
 *
 * @author hoaha
 */
public class Address implements Serializable{
    private int id;
    private String numberHouse;
    private String street;
    private String district;
    private String city;
    private String nation;

    public Address() {
    }

    public Address(int id, String numberHouse, String street, String district, String city, String nation) {
        this.id = id;
        this.numberHouse = numberHouse;
        this.street = street;
        this.district = district;
        this.city = city;
        this.nation = nation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
    
    
}
