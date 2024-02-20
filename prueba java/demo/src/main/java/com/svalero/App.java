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
        
        // Connection
        // Connection conn = DriverManager.getConnection(url, user, password);
        MotorSQL.connect();
        MotorSQL.ejectutarSentenciaConDatos();
        MotorSQL.disconnect();

        System.out.println("Hello World!");
    }
}
