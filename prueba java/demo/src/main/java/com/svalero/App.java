package com.svalero;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.svalero.utils.MotorSQL;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String url = "jdbc:postgre.c1iywqwec4uj.us-east-1.rds.amazonaws.com";

        String user = "postgres";
        String password = "s3cr3t";

        Properties properties = new Properties();
        properties.setProperty("user", "postgres");
        properties.setProperty("password", "postgres");
        properties.setProperty("ssl", "false");

        // Connection
        // Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "SELECT * FROM USUARIOS";
        MotorSQL.connnect();
        MotorSQL.ejectutarSentenciaConDatos();
        MotorSQL.disconnnect();
        try {
            Connection conn = DriverManager.getConnection(url, properties);
            if (conn != null) {
                System.out.println("Connected to the database!");
            }
            Statement stm = (Statement) conn.createStatement();
            String consulta = "SELECT * FROM user";
            // consulta += "where email = 'a@svalero.com' ";
            // consulta += " and ";
            // consulta += "password = '12344321'; ";

            ResultSet rs = (ResultSet) stm.executeQuery(consulta);

            while (rs.next()) { //
                // int id = rs.getInt(1);
                System.out.println("Hay registros!!!!");
                String name1 = rs.getString(1);
                // int id = rs.getInt(2);
                System.out.println("name=>" + name1);
                // System.out.println(id + " " + name);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // Statement
        // Resultset

        System.out.println("Hello World!");
    }
}
