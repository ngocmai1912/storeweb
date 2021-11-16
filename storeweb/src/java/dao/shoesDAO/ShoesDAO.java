/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.shoesDAO;

import java.util.List;
import model.shoes.ItemShoes;
import model.shoes.Shoes;

/**
 *
 * @author hoaha
 */
public interface ShoesDAO {
      public void addShoes(Shoes shoes);
    public void  updateShoes(Shoes shoes);
    public void deleteShoes(Shoes shoes);
    public List<ItemShoes> getAllItemShoes();
    public List<ItemShoes> searchItemByName(String name);
    public ItemShoes searchItemByID(int id);
}
