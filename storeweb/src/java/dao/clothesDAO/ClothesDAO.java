/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao.clothesDAO;

import java.util.List;
import model.clothes.Clothes;
import model.clothes.ItemClothes;

/**
 *
 * @author hoaha
 */
public interface ClothesDAO {
    public void addClothes(Clothes clothes);
    public void  updateClothes(Clothes clothes);
    public void deleteClothes(Clothes clothes);
    public List<ItemClothes> getAllItemClothes();
    public List<ItemClothes> searchItemByName(String name);
    public ItemClothes searchItemByID(int id);
}
