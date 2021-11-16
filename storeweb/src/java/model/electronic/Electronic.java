/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.electronic;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author hoaha
 */
public class Electronic implements Serializable{
    private int id;
    private String name;
    private float price;
    private String type;
    private int ram;
    private String color;
    private float screenSize;
    private String screenType;
    private String operatingSystem;
    private Date releaseDate;
    private int battery;
    private int charger;
    private Producer producer;

    public Electronic() {
    }

    public Electronic(int id, String name, float price, String type, int ram, String color, float screenSize, String screenType, String operatingSystem, Date releaseDate, int battery, int charger) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.ram = ram;
        this.color = color;
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.operatingSystem = operatingSystem;
        this.releaseDate = releaseDate;
        this.battery = battery;
        this.charger = charger;
    }

    
    public Electronic(int id, String name, float price, String type, int ram, String color, float screenSize, String screenType, String operatingSystem, Date releaseDate, int battery, int charger, Producer producer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.ram = ram;
        this.color = color;
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.operatingSystem = operatingSystem;
        this.releaseDate = releaseDate;
        this.battery = battery;
        this.charger = charger;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getCharger() {
        return charger;
    }

    public void setCharger(int charger) {
        this.charger = charger;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
    
    
    
}
