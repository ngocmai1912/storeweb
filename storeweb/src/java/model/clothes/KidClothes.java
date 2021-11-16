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
public class KidClothes extends Clothes implements Serializable{
    private String kidType;

    public KidClothes() {
    }

    public KidClothes(String kidType, int id, String name, String type, int quantity, String barcode, String color, float price, String description, BrandClothes brandClothes) {
        super(id, name, type, quantity, barcode, color, price, description, brandClothes);
        this.kidType = kidType;
    }

    public String getKidType() {
        return kidType;
    }

    public void setKidType(String kidType) {
        this.kidType = kidType;
    }
    
}
