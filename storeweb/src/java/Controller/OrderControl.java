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
import dao.shoesDAO.ShoesDAOImpl;
import java.io.IOException;
import java.io.PrintWriter;
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
import model.book.ItemBook;
import model.clothes.ItemClothes;
import model.customer.Account;
import model.electronic.ItemElectronic;
import model.shoes.ItemShoes;
import utils.CartUtils;
import static utils.CartUtils.listBook;
import static utils.CartUtils.listClothes;
import static utils.CartUtils.listElectronic;

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
        List<ItemClothes> listC = new ArrayList<>();
        Set<Integer> set = listClothes.keySet();
        for (Integer key : set) {
            ItemClothes itemClothes = new ClothesDAOImpl().searchItemByID(key);
            itemClothes.setAmount(listClothes.get(key));
            listC.add(itemClothes);
        }
         
        List<ItemBook> listB = new ArrayList<>();
        Set<Integer> set2 = listBook.keySet();
        for (Integer key : set2) {
            ItemBook it = new BookDAOImpl().searchItemByID(key);
            it.setAmount(listBook.get(key));
            listB.add(it);
        }
        
        List<ItemElectronic> listE = new ArrayList<>();
        Set<Integer> set3 = CartUtils.listElectronic.keySet();
        for (Integer key : set3) {
            ItemElectronic it = new ElectronicDAOImpl().searchItemByID(key);
            listE.add(it);
        }
        
        List<ItemShoes> listS = new ArrayList<>();
        Set<Integer> set4 = CartUtils.listShoes.keySet();
        for (Integer key : set4) {
            ItemShoes it = new ShoesDAOImpl().searchItemByID(key);
            listS.add(it);
        }
        
        req.setAttribute("listBook", listB);
        req.setAttribute("listClothes", listC);
        req.setAttribute("listElectronic", listE);
        req.setAttribute("listShoes", listS);
        
        req.setAttribute("sum", total);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("CheckOut.jsp");
        requestDispatcher.forward(req, resp);
        
    }
 
        
  

}