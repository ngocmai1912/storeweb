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
import model.book.Author;
import model.book.Publisher;

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
        String sql = "select  author.*, itembook.*, book.*, \n" +
                    "itembook.ID as idItem, book.ID as idBook, \n" +
                    "publisher.ID as idPublisher, author.ID as idAuthor,\n" +
                    "publisher.Name as namePublisher, author.Name as nameAuthor,\n" +
                    "publisher.Address as addressPublisher, author.Address as addressAuthor\n" +
                    "from itembook, book, author, publisher\n" +
                    "where itembook.BookID = book.ID\n" +
                    "and book.AuthorID = author.ID\n" +
                    "and book.PublisherID = publisher.ID;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Author author = new Author(rs.getInt("idAuthor"), rs.getString("nameAuthor"), rs.getString("Biography"), rs.getString("Email"), rs.getString("addressAuthor"));
                Publisher publisher = new Publisher(rs.getInt("idPublisher"), rs.getString("namePublisher"), rs.getString("addressPublisher"));
                Book book = new Book(rs.getInt("idBook"), rs.getString("ISBN"), rs.getString("Titile"), 
                        rs.getString("Summary"), rs.getDate("NumberOfDate"), rs.getString("Language"), 
                        rs.getDate("PublicationDate"), author, publisher);
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
        String sql = "select  author.*, itembook.*, book.*, \n" +
                    "itembook.ID as idItem, book.ID as idBook, \n" +
                    "publisher.ID as idPublisher, author.ID as idAuthor,\n" +
                    "publisher.Name as namePublisher, author.Name as nameAuthor,\n" +
                    "publisher.Address as addressPublisher, author.Address as addressAuthor\n" +
                    "from itembook, book, author, publisher\n" +
                    "where itembook.BookID = book.ID\n" +
                    "and book.AuthorID = author.ID\n" +
                    "and book.PublisherID = publisher.ID and titile like ?;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
            ps.setString(1, "%" + title + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Author author = new Author(rs.getInt("idAuthor"), rs.getString("nameAuthor"), rs.getString("Biography"), rs.getString("Email"), rs.getString("addressAuthor"));
                Publisher publisher = new Publisher(rs.getInt("idPublisher"), rs.getString("namePublisher"), rs.getString("addressPublisher"));
                Book book = new Book(rs.getInt("idBook"), rs.getString("ISBN"), rs.getString("Titile"), 
                        rs.getString("Summary"), rs.getDate("NumberOfDate"), rs.getString("Language"), 
                        rs.getDate("PublicationDate"), author, publisher);
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
        String sql = "select  author.*, itembook.*, book.*, \n" +
                    "itembook.ID as idItem, book.ID as idBook, \n" +
                    "publisher.ID as idPublisher, author.ID as idAuthor,\n" +
                    "publisher.Name as namePublisher, author.Name as nameAuthor,\n" +
                    "publisher.Address as addressPublisher, author.Address as addressAuthor\n" +
                    "from itembook, book, author, publisher\n" +
                    "where itembook.BookID = book.ID\n" +
                    "and book.AuthorID = author.ID\n" +
                    "and book.PublisherID = publisher.ID and itembook.ID = ?";
        
        try {
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Author author = new Author(rs.getInt("idAuthor"), rs.getString("nameAuthor"), rs.getString("Biography"), rs.getString("Email"), rs.getString("addressAuthor"));
                Publisher publisher = new Publisher(rs.getInt("idPublisher"), rs.getString("namePublisher"), rs.getString("addressPublisher"));
                Book book = new Book(rs.getInt("idBook"), rs.getString("ISBN"), rs.getString("Titile"), 
                        rs.getString("Summary"), rs.getDate("NumberOfDate"), rs.getString("Language"), 
                        rs.getDate("PublicationDate"), author, publisher);
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
