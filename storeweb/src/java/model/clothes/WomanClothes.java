/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.clothes;

import java.io.Serializable;

/**
 *
 * @author hoaha
 */
public class WomanClothes extends Clothes implements Serializable{
    private String womanType;

    public WomanClothes() {
    }

    public WomanClothes(String womanType, int id, String name, String type, int quantity, String barcode, String color, float price, String description, BrandClothes brandClothes) {
        super(id, name, type, quantity, barcode, color, price, description, brandClothes);
        this.womanType = womanType;
    }

    public String getWomanType() {
        return womanType;
    }

    public void setWomanType(String womanType) {
        this.womanType = womanType;
    }
    
    
}
