package Controller;


import com.mysql.cj.xdevapi.Result;
import dao.bookDAO.BookDAOImpl;
import dao.clothesDAO.ClothesDAOImpl;
import dao.electronicDAO.ElectronicDAOImpl;
import dao.shoesDAO.ShoesDAOImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpExchange;

import model.book.ItemBook;
import model.clothes.ItemClothes;
import model.electronic.ItemElectronic;
import model.shoes.ItemShoes;
import utils.CartUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoaha
 */
@WebServlet(urlPatterns = "/")
public class HomeController extends HttpServlet{
     private BookDAOImpl bookDAOImpl;
     private ShoesDAOImpl shoesDAOImpl;
     private ClothesDAOImpl clothesDAOImpl;
     private ElectronicDAOImpl electronicDAOImpl;
     
     
    @Override
    public void init() {
        bookDAOImpl = new BookDAOImpl();
        shoesDAOImpl = new ShoesDAOImpl();
        clothesDAOImpl = new ClothesDAOImpl();
        electronicDAOImpl = new ElectronicDAOImpl();
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        CartUtils.request = req;
        fillAll(req, resp);
        
    }
    
    
    private void fillAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<ItemBook> listBook = new ArrayList<>();
        List<ItemShoes> listShoes = new ArrayList<>();
        List<ItemClothes> listClothes = new ArrayList<>();
        List<ItemElectronic> listElectronic = new ArrayList<>();
        
        listBook = bookDAOImpl.getAllItemBook();
        listShoes = shoesDAOImpl.getAllItemShoes();
        listClothes = clothesDAOImpl.getAllItemClothes();
        listElectronic = electronicDAOImpl.getAllItemElectronic();
        
        req.setAttribute("listBook", listBook);
        req.setAttribute("listShoes", listShoes);
        req.setAttribute("listClothes", listClothes);
        req.setAttribute("listElectronic", listElectronic);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Home.jsp");
        requestDispatcher.forward(req, resp);

    }
   
}

