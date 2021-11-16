/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.orderDAO;

import model.book.ItemBook;
import model.clothes.ItemClothes;
import model.customer.Account;
import model.electronic.ItemElectronic;
import model.shoes.ItemShoes;

/**
 *
 * @author hoaha
 */
public interface CartDAO {
    public void getAccountCustomer(Account account);
    public void addBookToCart(ItemBook itemBook);
    public void addClothesToCart(ItemClothes itemClothes);
    public void addShoesToCart(ItemShoes itemShoes);
    public void addElectronicToCart(ItemElectronic itemElectronic);
}
