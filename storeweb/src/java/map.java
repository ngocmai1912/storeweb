/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoaha
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class map {
    public static void main(String args[]) {
        // init map
        
        // show map
        Map<Integer, Integer> hashMap = new LinkedHashMap<>();
        int arr[] = {1, 3, 1, 2, 4};
        for(int i = 0; i < 5; i++){
            if (hashMap.get(arr[i]) != null) {
                    hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            } else hashMap.put(arr[i], 1);
        }
        Set<Integer> set = hashMap.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }

}
