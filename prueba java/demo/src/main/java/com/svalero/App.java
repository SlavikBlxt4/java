package com.svalero;


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
        MotorSQL.ejectutarSentencia();
        MotorSQL.ejectutarSentenciaConDatos();
        MotorSQL.disconnect();

        System.out.println("Hello World!");
    }
}
