/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.customerDAO;

import dao.DAO;
import static dao.DAO.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.customer.Account;
import model.customer.Customer;
import model.order.Order;
/**
 *
 * @author Admin
 */
public class CustomerDAOImpl implements CustomerDAO{

    public CustomerDAOImpl() {
        super();
    }
    
    PreparedStatement ps = null; 
    ResultSet rs = null;

  
     @Override
    public Account checkLogin(String username, String password) {
        String sql = "SELECT * FROM account WHERE username = ? AND password = ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return null;
    }
    
    public void signUp(Customer customer) {
        String query = "INSERT INTO account(username, password) VALUES (?, ?);";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, customer.getAccount().getUsername());
            ps.setString(2, customer.getAccount().getPassword());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void addCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void viewOrder(Order order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    
}
