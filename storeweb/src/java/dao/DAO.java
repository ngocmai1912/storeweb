/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hoaha
 */
public class DAO {
    public static Connection connection;
    private String DB_URL = "jdbc:mysql://localhost:3306/store?autoReconnect=true&useSSL=false";
    private String USER_NAME = "root";
    private String PASSWORD = "staywithme";
    
    public DAO() {
        if(connection==null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
                System.out.println(connection);
            } catch(Exception e){
                e.printStackTrace();
            }
        }   
        else{
            System.out.println("1" + connection);
        }
    }
   
}
