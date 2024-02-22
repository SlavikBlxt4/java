package com.example.Repositories;

import com.example.interfaces.Repository;
import com.example.utils.MotorSQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PostgreRepo implements Repository {

    public PostgreRepo(){
        MotorSQL.ejecutarSentencia("DROP TABLE  IF EXISTS Peliculas CASCADE");
        MotorSQL.ejecutarSentencia("CREATE TABLE IF NOT EXISTS PELICULA (id SERIAL, name VARCHAR(50), director VARCHAR(50), PRIMARY KEY(id))");
        MotorSQL.ejecutarSentencia("INSERT INTO PELICULA (name, director) VALUES ('Titanic', 'James Cameron')");
        MotorSQL.ejecutarSentencia("INSERT INTO PELICULA (name, director) VALUES ('Harry Potter', 'J. K. Rowling')");
        MotorSQL.ejecutarSentencia("INSERT INTO PELICULA (name, director) VALUES ('Star Wars', 'George Lucas')");
    }

    @Override
    public List<Pelicula> getMovies() {
        MotorSQL.connect(); // Establish database connection
        
        List<Pelicula> peliculas = new ArrayList<>();
        ResultSet resultSet = MotorSQL.ejecutarSentenciaConDatos("SELECT * FROM PELICULA");
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String director = resultSet.getString("director");
                Pelicula pelicula = new Pelicula(id, name, director);
                peliculas.add(pelicula);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            MotorSQL.disconnect(); // Close database connection
        }
        return peliculas;
    }

}
