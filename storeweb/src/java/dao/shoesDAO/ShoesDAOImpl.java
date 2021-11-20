/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.shoesDAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.shoes.BrandShoes;
import model.shoes.ItemShoes;
import model.shoes.Shoes;

/**
 *
 * @author hoaha
 */
public class ShoesDAOImpl implements ShoesDAO{

    @Override
    public void addShoes(Shoes shoes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateShoes(Shoes shoes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteShoes(Shoes shoes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemShoes> getAllItemShoes() {
        List<ItemShoes> list = new ArrayList<>();
        String sql = "select shoes.*, itemshoes.*,brandshoes.*, shoes.ID as idShoes, itemshoes.ID as idItem, \n" +
                    "brandshoes.ID as idBrand, brandshoes.Name as nameBrand, shoes.Name as nameShoes\n" +
                    "from shoes, itemshoes, brandshoes\n" +
                    "where shoes.ID = itemshoes.ShoesID\n" +
                    "and shoes.BrandShoesID = brandshoes.ID;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                BrandShoes brandShoes = new BrandShoes(rs.getInt("idBrand"), rs.getString("nameBrand"), rs.getString("Address"));
                Shoes shoes = new Shoes(rs.getInt("idShoes"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getInt("Size"), rs.getString("Color"), rs.getString("Material"), brandShoes);
                ItemShoes itemShoes = new ItemShoes(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"), shoes);
                list.add(itemShoes);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ItemShoes> searchItemByName(String name) {
        List<ItemShoes> list = new ArrayList<>();
        String sql = "select shoes.*, itemshoes.*,brandshoes.*, shoes.ID as idShoes, itemshoes.ID as idItem, \n" +
                    "brandshoes.ID as idBrand, brandshoes.Name as nameBrand, shoes.Name as nameShoes\n" +
                    "from shoes, itemshoes, brandshoes\n" +
                    "where shoes.ID = itemshoes.ShoesID\n" +
                    "and shoes.BrandShoesID = brandshoes.ID and itemeshoes.Name like ?;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                BrandShoes brandShoes = new BrandShoes(rs.getInt("idBrand"), rs.getString("nameBrand"), rs.getString("Address"));
                Shoes shoes = new Shoes(rs.getInt("idShoes"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getInt("Size"), rs.getString("Color"), rs.getString("Material"), brandShoes);
                ItemShoes itemShoes = new ItemShoes(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"), shoes);
                list.add(itemShoes);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public ItemShoes searchItemByID(int id) {
        String sql = "select shoes.*, itemshoes.*,brandshoes.*, shoes.ID as idShoes, itemshoes.ID as idItem, \n" +
                    "brandshoes.ID as idBrand, brandshoes.Name as nameBrand, shoes.Name as nameShoes\n" +
                    "from shoes, itemshoes, brandshoes\n" +
                    "where shoes.ID = itemshoes.ShoesID\n" +
                    "and shoes.BrandShoesID = brandshoes.ID and itemshoes.ID = ?;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                BrandShoes brandShoes = new BrandShoes(rs.getInt("idBrand"), rs.getString("nameBrand"), rs.getString("Address"));
                Shoes shoes = new Shoes(rs.getInt("idShoes"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getInt("Size"), rs.getString("Color"), rs.getString("Material"), brandShoes);
                ItemShoes itemShoes = new ItemShoes(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"), shoes);
                return itemShoes;
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return null;
    }
    
}
