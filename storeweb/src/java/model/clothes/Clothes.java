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
public class Clothes implements Serializable{
    private int id;
    private String name;
    private String type;
    private int quantity;
    private String barcode;
    private String color;
    private float price;
    private String description;
    private BrandClothes brandClothes;

    public Clothes() {
    }

    public Clothes(int id, String name, String type, int quantity, String barcode, String color, float price, String description) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.barcode = barcode;
        this.color = color;
        this.price = price;
        this.description = description;
    }

    
    public Clothes(int id, String name, String type, int quantity, String barcode, String color, float price, String description, BrandClothes brandClothes) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.barcode = barcode;
        this.color = color;
        this.price = price;
        this.description = description;
        this.brandClothes = brandClothes;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BrandClothes getBrandClothes() {
        return brandClothes;
    }

    public void setBrandClothes(BrandClothes brandClothes) {
        this.brandClothes = brandClothes;
    }
    
    
    
}
