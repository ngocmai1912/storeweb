/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.electronicDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.electronic.Electronic;
import model.electronic.ItemElectronic;
import model.shoes.ItemShoes;
import model.shoes.Shoes;

/**
 *
 * @author hoaha
 */
public class ElectronicDAOImpl implements ElectronicDAO{

    @Override
    public void addElectronic(Electronic electronic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateElectronic(Electronic electronic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteElectronic(Electronic electronic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemElectronic> getAllItemElectronic() {
        List<ItemElectronic> list = new ArrayList<>();
        String sql = "select electronic.*, itemelectronic.*, electronic.ID as idElectronic, itemelectronic.ID as idItem\n" +
                    "from electronic, itemelectronic\n" +
                    "where electronic.ID = itemelectronic.ElectronicID;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Electronic electronic = new Electronic(rs.getInt("idElectronic"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getString("Type"), rs.getInt("Ram"), rs.getString("Color"),
                        rs.getFloat("ScreenSize"), rs.getString("ScreenType"), rs.getString("OperatingSystem"),
                        rs.getDate("ReleaseDate"), rs.getInt("Battery"),rs.getInt("Charger"));
                ItemElectronic itemElectronic = new ItemElectronic(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"),rs.getInt("Amount"), electronic);
                list.add(itemElectronic);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ItemElectronic> searchItemByName(String name) {
        List<ItemElectronic> list = new ArrayList<>();
        String sql = "select electronic.*, itemelectronic.*, electronic.ID as idElectronic, itemelectronic.ID as idItem\n" +
                    "from electronic, itemelectronic\n" +
                    "where electronic.ID = itemelectronic.ElectronicID and name like ?;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Electronic electronic = new Electronic(rs.getInt("idElectronic"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getString("Type"), rs.getInt("Ram"), rs.getString("Color"),
                        rs.getFloat("ScreenSize"), rs.getString("ScreenType"), rs.getString("OperatingSystem"),
                        rs.getDate("ReleaseDate"), rs.getInt("Battery"),rs.getInt("Charger"));
                ItemElectronic itemElectronic = new ItemElectronic(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"),rs.getInt("Amount"), electronic);
                list.add(itemElectronic);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public ItemElectronic searchItemByID(int id) {
        String sql = "select electronic.*, itemelectronic.*, electronic.ID as idElectronic, itemelectronic.ID as idItem\n" +
                    "from electronic, itemelectronic\n" +
                    "where electronic.ID = itemelectronic.ElectronicID and itemelectronic.ID = ?;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Electronic electronic = new Electronic(rs.getInt("idElectronic"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getString("Type"), rs.getInt("Ram"), rs.getString("Color"),
                        rs.getFloat("ScreenSize"), rs.getString("ScreenType"), rs.getString("OperatingSystem"),
                        rs.getDate("ReleaseDate"), rs.getInt("Battery"),rs.getInt("Charger"));
                ItemElectronic itemElectronic = new ItemElectronic(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"),rs.getInt("Amount"), electronic);
                return itemElectronic;
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return null;
    }
    @Override
    public ItemElectronic getItemElectronic(String txt) {
        String query = "select * from itemelectronic where ID = ?";
        //List<ItemElectronic> list = new ArrayList<>();
        try {
            PreparedStatement ps = dao.DAO.connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new ItemElectronic(rs.getInt(1),
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
