/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.DAO;
import dao.bookDAO.BookDAOImpl;
import dao.clothesDAO.ClothesDAOImpl;
import dao.electronicDAO.ElectronicDAOImpl;
import dao.shoesDAO.ShoesDAOImpl;
import java.io.Console;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.book.ItemBook;
import model.clothes.ItemClothes;
import model.electronic.ItemElectronic;
import model.shoes.ItemShoes;

/**
 *
 * @author hoaha
 */
@WebServlet("/detail")
public class DetailController extends HttpServlet{

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
        String id = req.getParameter("pid");
        String type = req.getParameter("type");
        if(type.compareToIgnoreCase("book") == 0){
            ItemBook itemBook = bookDAOImpl.searchItemByID(Integer.parseInt(id));

            req.setAttribute("detail", itemBook);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("ItemDetailBook.jsp");
            requestDispatcher.forward(req, resp);
        }
        else if(type.compareToIgnoreCase("clothes") == 0){
            ItemClothes itemClothes = clothesDAOImpl.searchItemByID(Integer.parseInt(id));
            req.setAttribute("detail", itemClothes);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("ItemDetailClothes.jsp");
            requestDispatcher.forward(req, resp);
        }
        else if(type.compareToIgnoreCase("electronic") == 0){
            ItemElectronic itemElectronic = electronicDAOImpl.searchItemByID(Integer.parseInt(id));
            req.setAttribute("detail", itemElectronic);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("ItemDetailElectronic.jsp");
            requestDispatcher.forward(req, resp);
        }
        else{
            ItemShoes itemShoes = shoesDAOImpl.searchItemByID(Integer.parseInt(id));
            req.setAttribute("detail", itemShoes);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("ItemDetailShoes.jsp");
            requestDispatcher.forward(req, resp);
        }
        
    }
    
}
