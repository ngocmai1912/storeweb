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
public class Cart {
    private int id;
    private int quanity;
    private float totalPrice;
    private String cartStatus;

    public Cart() {
    }

    public Cart(int id, int quanity, float totalPrice, String cartStatus) {
        this.id = id;
        this.quanity = quanity;
        this.totalPrice = totalPrice;
        this.cartStatus = cartStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCartStatus() {
        return cartStatus;
    }

    public void setCartStatus(String cartStatus) {
        this.cartStatus = cartStatus;
    }
    @Override
    public String toString() {
        return "Cart{" + "id=" + id + ", quanity=" + quanity + ", totalPrice=" + totalPrice + ", cartStatus=" + cartStatus +"}";
    }
}
