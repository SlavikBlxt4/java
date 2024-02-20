package com.svalero.utils;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MotorSQL{

    private Connection conexion;
    private Statement sentenciaSQL;
    private ResultSet listaDatosBD;
    public void connect();
    public void disconnect();
    public void ejectutarSentencia();
    public void ejectutarSentenciaConDatos();
}