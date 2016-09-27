
package br.senac.rn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    
    public Connection connection;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DATABASE = "revisao_db";
    private final String URL = "jdbc:mysql//localhost:3306/" + DATABASE;
    private final String USER = "root";
    private final String PASSWORD = "senac";
    
    public boolean connect(){
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            return true;
        }catch(SQLException |ClassNotFoundException error){
            System.out.println("Erro: " + error.toString());
        }
        return false;
    }
    
    public boolean disconnect(){
        try{
            connection.close();
            return true;
        }catch(SQLException error){
            System.out.println("Erro: " + error.toString());
        }
        return false;
    }
}
