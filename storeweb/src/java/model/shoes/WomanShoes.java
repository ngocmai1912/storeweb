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
public class WomanShoes extends Shoes implements Serializable{
    private String womanType;

    public WomanShoes(String womanType, int id, String name, float price, int size, String color, String material, BrandShoes brandShoes) {
        super(id, name, price, size, color, material, brandShoes);
        this.womanType = womanType;
    }

    public WomanShoes() {
    }

    public String getWomanType() {
        return womanType;
    }

    public void setWomanType(String womanType) {
        this.womanType = womanType;
    }
    
    
    
}
