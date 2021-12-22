/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.orderDAO;

import java.sql.Date;
import java.util.List;
import model.customer.Customer;
import model.order.Cart;
import model.order.Order;
import model.order.Payment;
import model.order.Shipment;

/**
 *
 * @author hoaha
 */
public interface OrderDAO {
    public void addOrder(int CustomerID, int CartID, Date date, String status); 
    public void updateOrder(Order o);
    public void deleteOrder(Order o);
    public Customer getCustomerByUsername(String username);
    public void viewCart(Cart cart);
    public List<Shipment> getAllShipment();
    public List<Payment> getAllPayment();
}
