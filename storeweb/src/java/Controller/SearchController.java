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
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
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
@WebServlet("/search")
public class SearchController extends HttpServlet{
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
        List<ItemBook> listBook = new ArrayList<>();
        List<ItemShoes> listShoes = new ArrayList<>();
        List<ItemClothes> listClothes = new ArrayList<>();
        List<ItemElectronic> listElectronic = new ArrayList<>();
        String txtSearch = req.getParameter("txtS");
        System.out.println("txtSearch: " + txtSearch);
        listBook = bookDAOImpl.searchItemByTitle(txtSearch);
        listShoes = shoesDAOImpl.searchItemByName(txtSearch);
        listClothes = clothesDAOImpl.searchItemByName(txtSearch);
        listElectronic = electronicDAOImpl.searchItemByName(txtSearch);
//        System.out.println(listBook.size());
//        System.out.println(listClothes.size());
//        System.out.println(listElectronic.size());
//        System.out.println(listShoes.size());
        req.setAttribute("listBook", listBook);
        req.setAttribute("listShoes", listShoes);
        req.setAttribute("listClothes", listClothes);
        req.setAttribute("listElectronic", listElectronic);
        req.setAttribute("txtSearch", txtSearch);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Search.jsp");
        requestDispatcher.forward(req, resp);
    }
}
