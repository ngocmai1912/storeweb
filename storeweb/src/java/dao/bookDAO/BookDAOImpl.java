/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.bookDAO;

import dao.DAO;
import model.book.Book;
import model.book.ItemBook;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoaha
 */
public class BookDAOImpl implements BookDAO {

    public BookDAOImpl() {
        DAO dao = new DAO();
    }

    @Override
    public List<ItemBook> getAllItemBook() {
        List<ItemBook> list = new ArrayList<>();
        String sql = "select itembook.*, book.*, itembook.ID as idItem, book.ID as idBook from itembook, book\n" +
                    "where itembook.BookID = book.ID";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book(rs.getInt("idBook"), rs.getString("ISBN"), rs.getString("Titile"), 
                        rs.getString("Summary"), rs.getDate("NumberOfDate"), rs.getString("Language"), 
                        rs.getDate("PublicationDate"));
                ItemBook itemBook = new ItemBook(rs.getInt("idItem"), rs.getString("Barcode"), rs.getFloat("Price"),
                        rs.getFloat("Discount"), rs.getString("Description"), rs.getString("Photo"), book);
                list.add(itemBook);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ItemBook> searchItemByTitle(String title) {
         List<ItemBook> list = new ArrayList<>();
        String sql = "select itembook.*, book.*, itembook.ID as idItem, book.ID as idBook from itembook, book\n" +
                    "where itembook.BookID = book.ID and titile like ?;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
             ps.setString(1, "%" + title + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book(rs.getInt("idBook"), rs.getString("ISBN"), rs.getString("Titile"), 
                        rs.getString("Summary"), rs.getDate("NumberOfDate"), rs.getString("Language"), 
                        rs.getDate("PublicationDate"));
                ItemBook itemBook = new ItemBook(rs.getInt("idItem"), rs.getString("Barcode"), rs.getFloat("Price"),
                        rs.getFloat("Discount"), rs.getString("Description"), rs.getString("Photo"), book);
                list.add(itemBook);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public ItemBook searchItemByID(int id) {
        String sql = "select itembook.*, book.*, itembook.ID as idItem, book.ID as idBook from itembook, book\n" +
                    "where itembook.BookID = book.ID and itembook.ID = ?;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
             ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Book book = new Book(rs.getInt("idBook"), rs.getString("ISBN"), rs.getString("Titile"), 
                        rs.getString("Summary"), rs.getDate("NumberOfDate"), rs.getString("Language"), 
                        rs.getDate("PublicationDate"));
                ItemBook itemBook = new ItemBook(rs.getInt("idItem"), rs.getString("Barcode"), rs.getFloat("Price"),
                        rs.getFloat("Discount"), rs.getString("Description"), rs.getString("Photo"), book);
                return itemBook;
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   
}
