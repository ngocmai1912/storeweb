/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.orderDAO;

import static dao.DAO.connection;
import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.clothes.ItemClothes;
import model.customer.Customer;
import model.order.Cart;
import model.order.Order;
import model.order.Payment;
import model.order.Shipment;

/**
 *
 * @author hoaha
 */
public class OrderDAOImpl implements OrderDAO{
    public OrderDAOImpl() {
        super();
    }
    
    PreparedStatement ps = null; 
    ResultSet rs = null;

    @Override
    public void addOrder(Order o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateOrder(Order o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteOrder(Order o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getCustomerByUsername(String username) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewCart(Cart cart) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Shipment> getAllShipment() {
        List<Shipment> list = new ArrayList<>();
        String query = "select * from Shipment";
        try {
            PreparedStatement ps = connection.prepareStatement(query);//nem cau lenh query sang sql
            ResultSet rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Shipment(rs.getInt(1),
                        rs.getString(2),
                        rs.getFloat(3)));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    @Override
    public List<Payment> getAllPayment() {
        List<Payment> list = new ArrayList<>();
        String query = "select * from Payment";
        try {
            PreparedStatement ps = connection.prepareStatement(query);//nem cau lenh query sang sql
            ResultSet rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Payment(rs.getInt(1),
                        rs.getString(2)));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
     public void sign(String sum) {
        String query = "INSERT INTO orderr(sum) VALUES ('d');";
        try {
            ps = connection.prepareStatement(query);
         //   ps.setArray(1, (Array) get);
            ps.setString(1, sum);
            ps.executeUpdate();
        } catch (Exception e) {
             System.out.println(e);
        }
    }

    
    
}
