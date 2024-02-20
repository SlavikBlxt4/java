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
    static String url = "jdbc:postgresql://postgresdb.cg6vma2ag6q6.us-east-1.rds.amazonaws.com/CareConnect";

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
        
    }
    public static void ejectutarSentenciaConDatos(){
        try {

            if (conn != null) {
                System.out.println("Connected to the database!");
            }
            stm = (Statement) conn.createStatement();
            String consulta = "SELECT * FROM user";

            ResultSet listaDatosBD = (ResultSet) stm.executeQuery(consulta);

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