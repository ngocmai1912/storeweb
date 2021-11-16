/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.clothesDAO;

import dao.DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.book.Book;
import model.book.ItemBook;
import model.clothes.Clothes;
import model.clothes.ItemClothes;

/**
 *
 * @author hoaha
 */
public class ClothesDAOImpl implements ClothesDAO{

    @Override
    public void addClothes(Clothes clothes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateClothes(Clothes clothes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteClothes(Clothes clothes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemClothes> getAllItemClothes() {
         List<ItemClothes> list = new ArrayList<>();
        String sql = "select clothes.*, itemclothes.*, clothes.ID as idClothes, itemclothes.ID as idItem\n" +
                    "from clothes, itemclothes\n" +
                    "where clothes.ID = itemclothes.ID;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Clothes clothes = new Clothes(rs.getInt("idClothes"), rs.getString("Name"), rs.getString("Type"), 
                        rs.getInt("Quanity"), rs.getString("Barcode"), rs.getString("Color"), 
                        rs.getFloat("Price"), rs.getString("Description"));
                ItemClothes itemClothes = new ItemClothes(rs.getInt("idItem"), rs.getString("Barcode"), rs.getFloat("Discount"), rs.getFloat("Price")
                        , rs.getString("Description"), rs.getString("Photo"), clothes);
                list.add(itemClothes);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ItemClothes> searchItemByName(String name) {
         List<ItemClothes> list = new ArrayList<>();
        String sql = "select clothes.*, itemclothes.*, clothes.ID as idClothes, itemclothes.ID as idItem\n" +
                    "from clothes, itemclothes\n" +
                    "where clothes.ID = itemclothes.ClothesID  and name like ?;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
             ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Clothes clothes = new Clothes(rs.getInt("idClothes"), rs.getString("Name"), rs.getString("Type"), 
                        rs.getInt("Quanity"), rs.getString("Barcode"), rs.getString("Color"), 
                        rs.getFloat("Price"), rs.getString("Description"));
                ItemClothes itemClothes = new ItemClothes(rs.getInt("idItem"), rs.getString("Barcode"), rs.getFloat("Discount"), rs.getFloat("Price")
                        , rs.getString("Description"), rs.getString("Photo"), clothes);
                list.add(itemClothes);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    
    }

    @Override
    public ItemClothes searchItemByID(int id) {
         
        String sql = "select clothes.*, itemclothes.*, clothes.ID as idClothes, itemclothes.ID as idItem\n" +
                    "from clothes, itemclothes\n" +
                    "where clothes.ID = itemclothes.ClothesID  and itemclothes.ID = ?;";
        
        try {
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
             ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Clothes clothes = new Clothes(rs.getInt("idClothes"), rs.getString("Name"), rs.getString("Type"), 
                        rs.getInt("Quanity"), rs.getString("Barcode"), rs.getString("Color"), 
                        rs.getFloat("Price"), rs.getString("Description"));
                ItemClothes itemClothes = new ItemClothes(rs.getInt("idItem"), rs.getString("Barcode"), rs.getFloat("Discount"), rs.getFloat("Price")
                        , rs.getString("Description"), rs.getString("Photo"), clothes);
                return itemClothes;
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return null;
    }
    
}
