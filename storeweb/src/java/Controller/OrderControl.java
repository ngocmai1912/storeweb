/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.bookDAO.BookDAOImpl;
import dao.clothesDAO.ClothesDAOImpl;
import dao.customerDAO.CustomerDAOImpl;
import dao.electronicDAO.ElectronicDAOImpl;
import dao.orderDAO.OrderDAOImpl;
import dao.shoesDAO.ShoesDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.book.ItemBook;
import model.clothes.ItemClothes;
import model.customer.Account;
import model.electronic.ItemElectronic;
import model.shoes.ItemShoes;
import utils.CartUtils;
import static utils.CartUtils.listBook;
import static utils.CartUtils.listClothes;
import static utils.CartUtils.listElectronic;
import static utils.CartUtils.request;

/**
 *
 * 
 */
@WebServlet(name = "OrderControl", urlPatterns = {"/order"})
public class OrderControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int total = (int) Float.parseFloat(req.getParameter("total"));
        req.setAttribute("total", total);
        
        HttpSession session = req.getSession();
        Account a = (Account) session.getAttribute("acc");
        int quantity = (int) session.getAttribute("quantity");
        if(a != null){
//            int idCustomer = new CustomerDAOImpl().getCustomerID(a.getId());
//            OrderDAOImpl orderDAO= new OrderDAOImpl();
//            boolean cartStatus =true;
//            orderDAO.insertCart(idCustomer, quantity, cartStatus, total);
////            Date date = new Date();
////            orderDAO.addOrder(idCustomer, "1", , "order");
        }
        else{
            request.setAttribute("mess", "Vui lòng đăng nhập trước khi thanh toán");
        }
        
        
        
        
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("CheckOut.jsp");
        requestDispatcher.forward(req, resp);
        
    }
 
        
  

}