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
public class Mobilephone extends Electronic implements Serializable{
    private String chip;
    private float primaryCamera;
    private float selfiCamera;
    private int memory;
    private String sim;
    private String note;

    public Mobilephone(String chip, float primaryCamera, float selfiCamera, int memory, String sim, String note, int id, String name, float price, String type, int ram, String color, float screenSize, String screenType, String operatingSystem, Date releaseDate, int battery, int charger, Producer producer) {
        super(id, name, price, type, ram, color, screenSize, screenType, operatingSystem, releaseDate, battery, charger, producer);
        this.chip = chip;
        this.primaryCamera = primaryCamera;
        this.selfiCamera = selfiCamera;
        this.memory = memory;
        this.sim = sim;
        this.note = note;
    }

    public Mobilephone() {
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public float getPrimaryCamera() {
        return primaryCamera;
    }

    public void setPrimaryCamera(float primaryCamera) {
        this.primaryCamera = primaryCamera;
    }

    public float getSelfiCamera() {
        return selfiCamera;
    }

    public void setSelfiCamera(float selfiCamera) {
        this.selfiCamera = selfiCamera;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
   
    
    
}
