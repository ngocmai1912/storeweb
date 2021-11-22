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
import model.clothes.BrandClothes;
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
        String sql = "select clothes.*, itemclothes.*,brandclothes.*, clothes.ID as idClothes, itemclothes.ID as idItem, \n" +
                    "brandclothes.ID as idBrand, brandclothes.Name as nameBrand, clothes.Name as nameClothes\n" +
                    "from clothes, itemclothes, brandclothes\n" +
                    "where clothes.ID = itemclothes.ClothesID\n" +
                    "and clothes.BrandClothesID = brandclothes.ID;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BrandClothes brandClothes = new BrandClothes(rs.getInt("idBrand"), rs.getString("nameBrand"), rs.getString("Address"));
                Clothes clothes = new Clothes(rs.getInt("idClothes"), rs.getString("Name"), rs.getString("Type"), 
                        rs.getInt("Quanity"), rs.getString("Barcode"), rs.getString("Color"), 
                        rs.getFloat("Price"), rs.getString("Description"), brandClothes);
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
        String sql = "select clothes.*, itemclothes.*,brandclothes.*, clothes.ID as idClothes, itemclothes.ID as idItem, \n" +
                    "brandclothes.ID as idBrand, brandclothes.Name as nameBrand, clothes.Name as nameClothes\n" +
                    "from clothes, itemclothes, brandclothes\n" +
                    "where clothes.ID = itemclothes.ClothesID\n" +
                    "and clothes.BrandClothesID = brandclothes.ID and clothes.Name like ?;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BrandClothes brandClothes = new BrandClothes(rs.getInt("idBrand"), rs.getString("nameBrand"), rs.getString("Address"));
                Clothes clothes = new Clothes(rs.getInt("idClothes"), rs.getString("Name"), rs.getString("Type"), 
                        rs.getInt("Quanity"), rs.getString("Barcode"), rs.getString("Color"), 
                        rs.getFloat("Price"), rs.getString("Description"), brandClothes);
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
        String sql = "select clothes.*, itemclothes.*,brandclothes.*, clothes.ID as idClothes, itemclothes.ID as idItem, \n" +
                    "brandclothes.ID as idBrand, brandclothes.Name as nameBrand, clothes.Name as nameClothes\n" +
                    "from clothes, itemclothes, brandclothes\n" +
                    "where clothes.ID = itemclothes.ClothesID\n" +
                    "and clothes.BrandClothesID = brandclothes.ID and itemclothes.ID = ?;";
        
        try {
            
            PreparedStatement ps = DAO.connection.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BrandClothes brandClothes = new BrandClothes(rs.getInt("idBrand"), rs.getString("nameBrand"), rs.getString("Address"));
                Clothes clothes = new Clothes(rs.getInt("idClothes"), rs.getString("Name"), rs.getString("Type"), 
                        rs.getInt("Quanity"), rs.getString("Barcode"), rs.getString("Color"), 
                        rs.getFloat("Price"), rs.getString("Description"), brandClothes);
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
