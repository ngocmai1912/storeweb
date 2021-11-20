/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import dao.bookDAO.BookDAOImpl;
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
import utils.CartUtils;
import static utils.CartUtils.listBook;

/**
 *
 * @author trinh
 */

@WebServlet("/cart")
public class CartControl extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ItemBook> list = new ArrayList<>();
        Set<Integer> set = listBook.keySet();
        for (Integer key : set) {
            list.add(new BookDAOImpl().searchItemByID(key));
        }
        request.setAttribute("list", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("Cart.jsp");
        requestDispatcher.forward(request, response);
    }

   
}
