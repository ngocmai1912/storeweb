/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import dao.bookDAO.BookDAOImpl;
import dao.clothesDAO.ClothesDAOImpl;
import dao.electronicDAO.ElectronicDAOImpl;
import dao.shoesDAO.ShoesDAOImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.book.ItemBook;
import model.clothes.ItemClothes;
import model.electronic.ItemElectronic;
import model.order.Cart;
import model.shoes.ItemShoes;

/**
 *
 * @author TGDD
 */
public class CartUtils {
    public static Map<Integer, Integer> listBook = new LinkedHashMap<>();
    public static Map<Integer, Integer> listClothes = new LinkedHashMap<>();
    public static Map<Integer, Integer> listElectronic= new LinkedHashMap<>();
    public static Map<Integer, Integer> listShoes = new LinkedHashMap<>();
    public static HttpServletRequest request;
    
    public static void addBookToCart(int id){
        if (listBook.get(id) != null) {
            listBook.put(id, listBook.get(id) + 1);
        } else listBook.put(id, 1);
        HttpSession httpSession = request.getSession();
        int quantity = listBook.size() + listClothes.size() + listElectronic.size() + listShoes.size();
        Cart cart = new Cart();
        cart.setQuanity(quantity);
        
        httpSession.setAttribute("cart", cart);
        httpSession.setAttribute("quantity", quantity);
    }
    
    public static void addClothesToCart(int clothesID){
        if (listClothes.get(clothesID) != null) {
            listClothes.put(clothesID, listClothes.get(clothesID) + 1);
        } else listClothes.put(clothesID, 1);
        HttpSession httpSession = request.getSession();
        int quantity = listBook.size() + listClothes.size() + listElectronic.size() + listShoes.size();
        Cart cart = new Cart();
        cart.setQuanity(quantity);
        
        httpSession.setAttribute("cart", cart);
        httpSession.setAttribute("quantity", quantity);
    }
    public static void addElectronicToCart(int electronicID){
        if (listElectronic.get(electronicID) != null) {
            listElectronic.put(electronicID, listElectronic.get(electronicID) + 1);
        } else listElectronic.put(electronicID, 1);
        HttpSession httpSession = request.getSession();
        int quantity = listBook.size() + listClothes.size() + listElectronic.size() + listShoes.size();
        Cart cart = new Cart();
        cart.setQuanity(quantity);
        
        httpSession.setAttribute("cart", cart);
        httpSession.setAttribute("quantity", quantity);
    }
    public static void addShoesToCart(int shoesID){
        if (listShoes.get(shoesID) != null) {
            listShoes.put(shoesID, listShoes.get(shoesID) + 1);
        } else listShoes.put(shoesID, 1);
        HttpSession httpSession = request.getSession();
        int quantity = listBook.size() + listClothes.size() + listElectronic.size() + listShoes.size();
        Cart cart = new Cart();
        cart.setQuanity(quantity);
        
        httpSession.setAttribute("cart", cart);
        httpSession.setAttribute("quantity", quantity);
    }
    public static void calTotalPrice(HttpServletRequest request) {
        BookDAOImpl bookDAOImpl = new BookDAOImpl();
        ShoesDAOImpl shoesDAOImpl = new ShoesDAOImpl();
        ClothesDAOImpl clothesDAOImpl = new ClothesDAOImpl();
        ElectronicDAOImpl electronicDAOImpl = new ElectronicDAOImpl();
        HttpSession httpSession = request.getSession();
        float totalPrice = 0;
        Set<Integer> set = listBook.keySet();
        for (Integer key : set) {
            totalPrice += bookDAOImpl.searchItemByID(key).getPrice()*listBook.get(key);
        }
        
        set = listClothes.keySet();
        for (Integer key : set) {
            totalPrice += clothesDAOImpl.searchItemByID(key).getPrice()*listClothes.get(key);
        }
        
        set = listElectronic.keySet();
        for (Integer key : set) {
            totalPrice += electronicDAOImpl.searchItemByID(key).getPrice()*listElectronic.get(key);
        }
        
        set = listShoes.keySet();
        for (Integer key : set) {
            totalPrice += shoesDAOImpl.searchItemByID(key).getPrice()*listShoes.get(key);
        }
        httpSession.setAttribute("totalPrice", totalPrice);
    }
    
//    <% 
//        int id = Integer.parseInt(request.getParameter("pid"));
//        CartUtils.addBook(id); 
//    %>
}
