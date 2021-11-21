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
public class ItemClothes implements Serializable{
    private int id;
    private String barcode;
    private float discount;
    private float price;
    private String description;
    private String photo;
    private int amount;
    private Clothes clothes;

    public ItemClothes() {
    }

    public ItemClothes(int id, String barcode, float discount, float price, String description, String photo) {
        this.id = id;
        this.barcode = barcode;
        this.discount = discount;
        this.price = price;
        this.description = description;
        this.photo = photo;
    }

    public ItemClothes(int id, String barcode, float discount, float price, String description, String photo, int amount) {
        this.id = id;
        this.barcode = barcode;
        this.discount = discount;
        this.price = price;
        this.description = description;
        this.photo = photo;
        this.amount = amount;
    }

    public ItemClothes(int id, String barcode, float discount, float price, String description, String photo, int amount, Clothes clothes) {
        this.id = id;
        this.barcode = barcode;
        this.discount = discount;
        this.price = price;
        this.description = description;
        this.photo = photo;
        this.amount = amount;
        this.clothes = clothes;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
    
    
    
}
