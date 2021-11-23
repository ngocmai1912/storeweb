/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.bookDAO.BookDAOImpl;
import dao.clothesDAO.ClothesDAOImpl;
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
import model.electronic.ItemElectronic;
import model.shoes.ItemShoes;
import utils.CartUtils;
import static utils.CartUtils.listBook;
import static utils.CartUtils.listClothes;
import static utils.CartUtils.listElectronic;

/**
 *
 * @author trinh
 */

@WebServlet("/cart")
public class CartControl extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("id") != null) handle(request, response);
        if(request.getParameter("dl") != null ) delete(request, response);
        double total = 0;
        List<ItemClothes> listC = new ArrayList<>();
        Set<Integer> set = listClothes.keySet();
        for (Integer key : set) {
            if(listClothes.get(key) != -1){
                ItemClothes itemClothes = new ClothesDAOImpl().searchItemByID(key);
                itemClothes.setAmount(listClothes.get(key));
                listC.add(itemClothes);
                total += (itemClothes.getPrice()*listClothes.get(key));
                System.out.println("total " + total);
            }
            
        }
         
        List<ItemBook> listB = new ArrayList<>();
        Set<Integer> set2 = listBook.keySet();
        for (Integer key : set2) {
            if(listBook.get(key) != -1){
                ItemBook it = new BookDAOImpl().searchItemByID(key);
                it.setAmount(listBook.get(key));
                listB.add(it);
                total += (it.getPrice()*listBook.get(key));
                System.out.println("total " + total);
            }
        }
        
        List<ItemElectronic> listE = new ArrayList<>();
        Set<Integer> set3 = CartUtils.listElectronic.keySet();
        for (Integer key : set3) {
            if(listElectronic.get(key) != -1){
                ItemElectronic it = new ElectronicDAOImpl().searchItemByID(key);
                it.setAmount(CartUtils.listElectronic.get(key));
                listE.add(it);
                total += (it.getPrice()*listElectronic.get(key));
                System.out.println("total " + total);
            }
            
        }
        
        List<ItemShoes> listS = new ArrayList<>();
        Set<Integer> set4 = CartUtils.listShoes.keySet();
        for (Integer key : set4) {
            if(CartUtils.listShoes.get(key) != -1){
                ItemShoes it = new ShoesDAOImpl().searchItemByID(key);
                it.setAmount(CartUtils.listShoes.get(key));
                listS.add(it);
                total += it.getPrice()*CartUtils.listShoes.get(key);
                System.out.println("total " + total);
            }
            
        }
        
        request.setAttribute("listBook", listB);
        request.setAttribute("listClothes", listC);
        request.setAttribute("listElectronic", listE);
        request.setAttribute("listShoes", listS);
        request.setAttribute("total", total);
        
        request.setAttribute("sum", total);
        
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Cart.jsp");
        requestDispatcher.forward(request, response);
    }

    
    public void handle(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String type = req.getParameter("type");
        if(type.compareToIgnoreCase("book") == 0) CartUtils.addBookToCart(id);
        else if(type.compareToIgnoreCase("clothes") == 0) CartUtils.addClothesToCart(id);
        else if(type.compareToIgnoreCase("electronic") == 0) CartUtils.addElectronicToCart(id);
        else CartUtils.addShoesToCart(id);
    }
   public void delete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("dl"));
        String type = req.getParameter("type");
        if(type.compareToIgnoreCase("book") == 0) listBook.put(id, -1);
        else if(type.compareToIgnoreCase("clothes") == 0) listClothes.put(id, -1);
        else if(type.compareToIgnoreCase("electronic") == 0) listElectronic.put(id, -1);
        else CartUtils.listShoes.put(id, -1);
    }
}
