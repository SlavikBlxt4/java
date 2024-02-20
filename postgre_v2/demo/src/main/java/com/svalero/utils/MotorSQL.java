package com.svalero.utils;


public class MotorSQL{

    private Connection conexion;
    private Statementent sentenciaSQL;
    private ResultSet listaDatosBD;
    public void connect();
    public void disconnect();
    public void ejectutarSentencia();
    public void ejectutarSentenciaConDatos();
}