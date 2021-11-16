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
public class ManClothes extends Clothes implements Serializable{
    private String manType;

    public ManClothes() {
    }

    public ManClothes(String manType, int id, String name, String type, int quantity, String barcode, String color, float price, String description, BrandClothes brandClothes) {
        super(id, name, type, quantity, barcode, color, price, description, brandClothes);
        this.manType = manType;
    }

    public String getManType() {
        return manType;
    }

    public void setManType(String manType) {
        this.manType = manType;
    }
    
    
    
}
