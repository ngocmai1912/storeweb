/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.shoes;

import java.io.Serializable;

/**
 *
 * @author hoaha
 */
public class ManShoes extends Shoes implements Serializable{
    private String manType;

    public ManShoes() {
    }

    public ManShoes(String manType, int id, String name, float price, int size, String color, String material, BrandShoes brandShoes) {
        super(id, name, price, size, color, material, brandShoes);
        this.manType = manType;
    }

    public String getManType() {
        return manType;
    }

    public void setManType(String manType) {
        this.manType = manType;
    }
    
}
