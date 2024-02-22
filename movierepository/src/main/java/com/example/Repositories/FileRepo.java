package com.example.Repositories;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.interfaces.Repository;

public class FileRepo implements Repository {
    
    @Override
    public List<Pelicula> getMovies() {
        List<Pelicula> movies = new ArrayList<>();
        String filePath = "c:/Users/S2-PC00/Desktop/java/movierepository/src/main/java/com/example/Repositories/peliculas.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Pelicula pelicula = parsePeliculaFromLine(line);
                movies.add(pelicula);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return movies;
    }
    
    private Pelicula parsePeliculaFromLine(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0]);
            String title = parts[1];
            String director = parts[2];
        return new Pelicula(id, title, director);
    }
}