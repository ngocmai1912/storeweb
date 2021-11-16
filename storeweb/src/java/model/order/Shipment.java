/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.order;

/**
 *
 * @author Admin
 */
public class Shipment {
    private int id;
    private String shipment;
    private float price;
    public Shipment(){}

    public Shipment(int id, String shipment, float price) {
        this.id = id;
        this.shipment = shipment;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShipment() {
        return shipment;
    }

    public void setShipment(String shipment) {
        this.shipment = shipment;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shipment{" + "id=" + id + ", shipment=" + shipment + ", price=" + price + '}';
    }
    
}
