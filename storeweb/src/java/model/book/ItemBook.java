/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.book;

import java.io.Serializable;

/**
 *
 * @author hoaha
 */
public class ItemBook implements Serializable{
    private int id;
    private String barcode;
    private float price;
    private float discount;
    private String description;
    private String photo;
    private Book book;
    private int amount;

    public ItemBook() {
    }

    public ItemBook(int id, String barcode, float price, float discount, String description, String photo, Book book) {
        this.id = id;
        this.barcode = barcode;
        this.price = price;
        this.discount = discount;
        this.description = description;
        this.photo = photo;
        this.book = book;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
