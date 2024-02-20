package com.svalero.utils;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MotorSQL{

    private static Connection conn;
    private static Statement stm;
    private static ResultSet listaDatosBD;
    static String url = "jdbc:postgresql://basedatosxavi.c1iywqwec4uj.us-east-1.rds.amazonaws.com/";

    public static void connect(){
        try {
            PropertiesClass propertiesClass = new PropertiesClass();
            conn = DriverManager.getConnection(url, propertiesClass.properties);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void disconnect(){
        try {
            conn.close();
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static void ejectutarSentencia(){
        try {
            if (conn != null) {
                System.out.println("Connected to the database!");
            }
            stm = (Statement) conn.createStatement();
            String create = "CREATE TABLE IF NOT EXISTS user (name VARCHAR(255));";
            String insert = "INSERT INTO user (name) VALUES ('Xavi');";
            stm.executeUpdate(create);
            stm.executeUpdate(insert);
            


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void ejectutarSentenciaConDatos(){
        try {

            if (conn != null) {
                System.out.println("Connected to the database!");
            }
            stm = (Statement) conn.createStatement();
            String consulta = "SELECT * FROM user;";

            listaDatosBD = (ResultSet) stm.executeQuery(consulta);

            while (listaDatosBD.next()) { 
                System.out.println("Hay registros!!!!");
                String name1 = listaDatosBD.getString(1);
                System.out.println("name=>" + name1);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
}