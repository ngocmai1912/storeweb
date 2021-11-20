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
import model.electronic.Laptop;
import model.electronic.Mobilephone;
import model.electronic.Producer;
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
        String sql = "select producer.*, itemelectronic.*,  electronic.ID as idElectronic, itemelectronic.ID as idItem,\n" +
                    "producer.ID as idProducer, producer.Name as nameProducer\n" +
                    "from electronic, itemelectronic, producer\n" +
                    "where electronic.ID = itemelectronic.ElectronicID\n" +
                    "and electronic.ProducerID = producer.ID;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producer producer = new Producer(rs.getInt("idProducer"), rs.getString("nameProducer"), rs.getString("Address"));
                Electronic electronic = new Electronic(rs.getInt("idElectronic"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getString("Type"), rs.getInt("Ram"), rs.getString("Color"),
                        rs.getFloat("ScreenSize"), rs.getString("ScreenType"), rs.getString("OperatingSystem"),
                        rs.getDate("ReleaseDate"), rs.getInt("Battery"),rs.getInt("Charger"), producer);
                ItemElectronic itemElectronic = new ItemElectronic(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"), electronic);
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
        String sql = "select producer.*, itemelectronic.*, electronic.ID as idElectronic, itemelectronic.ID as idItem,\n" +
                    "producer.ID as idProducer, producer.Name as nameProducer\n" +
                    "from electronic, itemelectronic, producer\n" +
                    "where electronic.ID = itemelectronic.ElectronicID\n" +
                    "and electronic.ProducerID = producer.ID and itemelectronic.Name like ?;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setString(1, "%" + name + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producer producer = new Producer(rs.getInt("idProducer"), rs.getString("nameProducer"), rs.getString("Address"));
                Electronic electronic = new Electronic(rs.getInt("idElectronic"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getString("Type"), rs.getInt("Ram"), rs.getString("Color"),
                        rs.getFloat("ScreenSize"), rs.getString("ScreenType"), rs.getString("OperatingSystem"),
                        rs.getDate("ReleaseDate"), rs.getInt("Battery"),rs.getInt("Charger"), producer);
                ItemElectronic itemElectronic = new ItemElectronic(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"), electronic);
                list.add(itemElectronic);
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return list;
    }

    @Override
    public ItemElectronic searchItemByID(int id) {
         String sql = "select producer.*, itemelectronic.*, electronic.ID as idElectronic, itemelectronic.ID as idItem,\n" +
                    "producer.ID as idProducer, producer.Name as nameProducer\n" +
                    "from electronic, itemelectronic, producer\n" +
                    "where electronic.ID = itemelectronic.ElectronicID\n" +
                    "and electronic.ProducerID = producer.ID and itemelectronic.ID = ?;";
        
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producer producer = new Producer(rs.getInt("idProducer"), rs.getString("nameProducer"), rs.getString("Address"));
                Electronic electronic = new Electronic(rs.getInt("idElectronic"), rs.getString("Name"), 
                        rs.getFloat("Price"), rs.getString("Type"), rs.getInt("Ram"), rs.getString("Color"),
                        rs.getFloat("ScreenSize"), rs.getString("ScreenType"), rs.getString("OperatingSystem"),
                        rs.getDate("ReleaseDate"), rs.getInt("Battery"),rs.getInt("Charger"), producer);
                ItemElectronic itemElectronic = new ItemElectronic(rs.getInt("idItem"), rs.getString("Barcode"),rs.getFloat("Discount"),rs.getFloat("Price"),
                         rs.getString("Description"), rs.getString("Photo"), electronic);
                return itemElectronic;
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return null;
    }

    @Override
    public Laptop getLaptopByID(int id) {
        String sql = "select laptop.*, itemelectronic.*\n" +
                    "from laptop, electronic, itemelectronic\n" +
                    "where laptop.ElectronicID = electronic.ID\n" +
                    "and electronic.ID = ?;";
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Laptop laptop = new Laptop();
                // handle
                return laptop;
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return null;
    }

    @Override
    public Mobilephone getMobilephoneByID(int id) {
         String sql = "select mobilephone.*, itemelectronic.*\n" +
                    "from mobilephone, electronic, itemelectronic\n" +
                    "where mobilephone.ElectronicID = electronic.ID\n" +
                    "and electronic.ID = ?;";
        try {
            
            PreparedStatement ps = dao.DAO.connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Mobilephone mb = new Mobilephone();
               //handle
                return mb;
            }
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return null;
    }
    
}
