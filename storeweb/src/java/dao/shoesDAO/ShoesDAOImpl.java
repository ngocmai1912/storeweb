/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.shoesDAO;

//import com.mysql.cj.xdevapi.Result;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.spi.http.HttpExchange;
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
        String sql = "select shoes.*, itemshoes.*, shoes.ID as idShoes, itemshoes.ID as idItem\n" +
                        "from shoes, itemshoes\n" +
                        "where shoes.ID = itemshoes.ShoesID;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Shoes shoes = new Shoes(rs.getInt("idShoes"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getInt("Size"), rs.getString("Color"), rs.getString("Material"));
                ItemShoes itemShoes = new ItemShoes(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"),rs.getInt("Amount"), shoes);
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
        String sql = "select shoes.*, itemshoes.*, shoes.ID as idShoes, itemshoes.ID as idItem\n" +
                        "from shoes, itemshoes\n" +
                        "where shoes.ID = itemshoes.ShoesID and name like ?;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Shoes shoes = new Shoes(rs.getInt("idShoes"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getInt("Size"), rs.getString("Color"), rs.getString("Material"));
                ItemShoes itemShoes = new ItemShoes(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"),rs.getInt("Amount"), shoes);
                list.add(itemShoes);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public ItemShoes searchItemByID(int id) {
        String sql = "select shoes.*, itemshoes.*, shoes.ID as idShoes, itemshoes.ID as idItem\n" +
                        "from shoes, itemshoes\n" +
                        "where shoes.ID = itemshoes.ShoesID and itemshoes.ID = ?;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Shoes shoes = new Shoes(rs.getInt("idShoes"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getInt("Size"), rs.getString("Color"), rs.getString("Material"));
                ItemShoes itemShoes = new ItemShoes(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"),rs.getInt("Amount"), shoes);
                return itemShoes;
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return null;
    }
    @Override
    public ItemShoes getItemShoes(String txt) {
        String query = "select * from itemshoes where ID = ?";
        //List<ItemElectronic> list = new ArrayList<>();
        try {
            PreparedStatement ps = dao.DAO.connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new ItemShoes(rs.getInt(1),
                        rs.getString(2),
                        rs.getFloat(3),
                        rs.getFloat(4),
                        rs.getString(5),
                        rs.getString(6),
                1);
            }
        } catch (Exception e) {
        }
        return null;
    }
    
}
