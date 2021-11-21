/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.electronicDAO;

import java.util.List;
import model.clothes.ItemClothes;
import model.electronic.Electronic;
import model.electronic.ItemElectronic;

/**
 *
 * @author hoaha
 */
public interface ElectronicDAO {
    
    public void addElectronic(Electronic electronic);
    public void  updateElectronic(Electronic electronic);
    public void deleteElectronic(Electronic electronic);
    public List<ItemElectronic> getAllItemElectronic();
    public List<ItemElectronic> searchItemByName(String name);
    public ItemElectronic getItemElectronic(String txt);
    public ItemElectronic searchItemByID(int id);
}
