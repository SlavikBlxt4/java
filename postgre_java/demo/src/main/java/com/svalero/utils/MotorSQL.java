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
    static String url = "jdbc:postgresql://basedatosxavi.c1iywqwec4uj.us-east-1.rds.amazonaws.com/postgres";

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
    
    public static void ejectutarSentencia(String sentencia){
        try {
            stm = (Statement) conn.createStatement();
            stm.executeUpdate(sentencia);
            


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    public static void ejectutarSentenciaConDatos(String consulta){
        try {

            if (conn != null) {
                System.out.println("Connected to the database!");
            }
            stm = (Statement) conn.createStatement();

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