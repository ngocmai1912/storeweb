/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.customerDAO;

import model.customer.Account;
import model.customer.Customer;
import model.order.Order;

/**
 *
 * @author hoaha
 */
public interface CustomerDAO {
    public void addCustomer(Customer customer);
    public void updateCustomer(Customer customer);
    public void deleteCustomer(Customer customer);
    public void viewOrder(Order order);
    public Account checkLogin(String username, String password);
    public void signUp(String username, String password);
    public Account checkAccountExist(String user);
}
