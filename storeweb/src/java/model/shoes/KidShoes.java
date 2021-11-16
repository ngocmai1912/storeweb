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
public class KidShoes extends Shoes implements Serializable{
    private String kidType;

    public KidShoes() {
    }

    public KidShoes(String kidType, int id, String name, float price, int size, String color, String material, BrandShoes brandShoes) {
        super(id, name, price, size, color, material, brandShoes);
        this.kidType = kidType;
    }

    public String getKidType() {
        return kidType;
    }

    public void setKidType(String kidType) {
        this.kidType = kidType;
    }
    
    
    
}
