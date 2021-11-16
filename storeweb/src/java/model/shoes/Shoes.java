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
public class Shoes implements Serializable{
    private int id;
    private String name;
    private float price;
    private int size;
    private String color;
    private String material;
    private BrandShoes brandShoes;

    public Shoes() {
    }

    public Shoes(int id, String name, float price, int size, String color, String material) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.material = material;
    }

    
    public Shoes(int id, String name, float price, int size, String color, String material, BrandShoes brandShoes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.color = color;
        this.material = material;
        this.brandShoes = brandShoes;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public BrandShoes getBrandShoes() {
        return brandShoes;
    }

    public void setBrandShoes(BrandShoes brandShoes) {
        this.brandShoes = brandShoes;
    }
    
    
            
}
