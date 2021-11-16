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
public class Laptop extends Electronic implements Serializable{
    private String cpu;
    private float cpuSpeed;
    private String typeHardDrive;
    private int hardDrive;
    private String graphicCard;
    private String dimemsions;
    private float weight;
    private int processorCount;
    private String displayTechnology;
    private String communicationStandard;
    private String design;
    private String note;

    public Laptop() {
    }

    public Laptop(String cpu, float cpuSpeed, String typeHardDrive, int hardDrive, String graphicCard, String dimemsions, float weight, int processorCount, String displayTechnology, String communicationStandard, String design, String note, int id, String name, float price, String type, int ram, String color, float screenSize, String screenType, String operatingSystem, Date releaseDate, int battery, int charger, Producer producer) {
        super(id, name, price, type, ram, color, screenSize, screenType, operatingSystem, releaseDate, battery, charger, producer);
        this.cpu = cpu;
        this.cpuSpeed = cpuSpeed;
        this.typeHardDrive = typeHardDrive;
        this.hardDrive = hardDrive;
        this.graphicCard = graphicCard;
        this.dimemsions = dimemsions;
        this.weight = weight;
        this.processorCount = processorCount;
        this.displayTechnology = displayTechnology;
        this.communicationStandard = communicationStandard;
        this.design = design;
        this.note = note;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public float getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(float cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public String getTypeHardDrive() {
        return typeHardDrive;
    }

    public void setTypeHardDrive(String typeHardDrive) {
        this.typeHardDrive = typeHardDrive;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getDimemsions() {
        return dimemsions;
    }

    public void setDimemsions(String dimemsions) {
        this.dimemsions = dimemsions;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getProcessorCount() {
        return processorCount;
    }

    public void setProcessorCount(int processorCount) {
        this.processorCount = processorCount;
    }

    public String getDisplayTechnology() {
        return displayTechnology;
    }

    public void setDisplayTechnology(String displayTechnology) {
        this.displayTechnology = displayTechnology;
    }

    public String getCommunicationStandard() {
        return communicationStandard;
    }

    public void setCommunicationStandard(String communicationStandard) {
        this.communicationStandard = communicationStandard;
    }

    public String getDesign() {
        return design;
    }

    public void setDesign(String design) {
        this.design = design;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
}
