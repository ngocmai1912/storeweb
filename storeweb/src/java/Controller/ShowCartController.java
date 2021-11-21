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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
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

/**
 *
 * @author hoaha
 */
@WebServlet(name = "ShowCartControl", urlPatterns = {"/print"})
public class ShowCartController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Cookie arr[] = request.getCookies();
        PrintWriter out = response.getWriter();
        List<ItemBook> list1 = new ArrayList<>();
        BookDAOImpl bdao = new BookDAOImpl();
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                String txt[] = o.getValue().split(",");
                for (String s : txt) {
                    list1.add(bdao.getItemBook(s));
                }
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            int count = 1;
            for (int j = i+1; j < list1.size(); j++) {
                if(list1.get(i).getId() == list1.get(j).getId()){
                    count++;
                    list1.remove(j);
                    j--;
                    list1.get(i).setAmount(count);
                }
            }
        }
        List<ItemElectronic> list2 = new ArrayList<>();
        ElectronicDAOImpl edao = new ElectronicDAOImpl();
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                String txt[] = o.getValue().split(",");
                for (String s : txt) {
                    list2.add(edao.getItemElectronic(s));
                }
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            int count = 1;
            for (int j = i+1; j < list2.size(); j++) {
                if(list2.get(i).getId() == list2.get(j).getId()){
                    count++;
                    list2.remove(j);
                    j--;
                    list2.get(i).setAmount(count);
                }
            }
        }
        List<ItemShoes> list3 = new ArrayList<>();
        ShoesDAOImpl sdao = new ShoesDAOImpl();
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                String txt[] = o.getValue().split(",");
                for (String s : txt) {
                    list3.add(sdao.getItemShoes(s));
                }
            }
        }
        for (int i = 0; i < list3.size(); i++) {
            int count = 1;
            for (int j = i+1; j < list3.size(); j++) {
                if(list3.get(i).getId() == list3.get(j).getId()){
                    count++;
                    list3.remove(j);
                    j--;
                    list3.get(i).setAmount(count);
                }
            }
        }
        List<ItemClothes> list4 = new ArrayList<>();
        ClothesDAOImpl cdao = new ClothesDAOImpl();
        for (Cookie o : arr) {
            if (o.getName().equals("id")) {
                String txt[] = o.getValue().split(",");
                for (String s : txt) {
                    list4.add(cdao.getItemClothes(s));
                }
            }
        }
        for (int i = 0; i < list4.size(); i++) {
            int count = 1;
            for (int j = i+1; j < list4.size(); j++) {
                if(list4.get(i).getId() == list4.get(j).getId()){
                    count++;
                    list4.remove(j);
                    j--;
                    list4.get(i).setAmount(count);
                }
            }
        }
        double total = 0;
        for (ItemBook o : list1) {
            total = total + o.getPrice();
        }
        for (ItemElectronic o : list2) {
            total = total + o.getPrice();
        }
        for (ItemShoes o : list3) {
            total = total + o.getPrice();
        }
        for (ItemClothes o : list4) {
            total = total + o.getPrice();
        }
        request.setAttribute("list1", list1);
        request.setAttribute("list2", list2);
        request.setAttribute("list3", list3);
        request.setAttribute("list4", list4);
        request.setAttribute("total", total);
        request.setAttribute("vat", 0.1 * total);
        request.setAttribute("sum", 1.1 * total);
        request.getRequestDispatcher("Cart.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
