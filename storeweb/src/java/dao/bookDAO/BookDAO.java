/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.bookDAO;

import model.book.Book;
import model.book.ItemBook;

import java.util.List;

/**
 *
 * @author hoaha
 */
public interface BookDAO {
    public void addBook(Book book);
    public void  updateBook(Book book);
    public void deleteBook(Book book);
    public List<ItemBook> getAllItemBook();
    public List<ItemBook> searchItemByTitle(String title);
    public ItemBook getItemBook(String txt);
    public ItemBook searchItemByID(int id);
}
