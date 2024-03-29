package com.example.Repositories;
import com.example.interfaces.Repository;

import java.util.ArrayList;
import java.util.List;

public class MemoryRepo implements Repository {

    List<Pelicula> lstPel = new ArrayList<>();
        Pelicula pelicula = new Pelicula(1, "Titanic", "James Cameron" );
        Pelicula pelicula1 = new Pelicula(2, "Harry Potter", "J. K. Rowling" );
        Pelicula pelicula2 = new Pelicula(3, "Star Wars", "George Lucas" );

    public MemoryRepo() {
        lstPel.add(pelicula);
        lstPel.add(pelicula1);
        lstPel.add(pelicula2);
    }

    @Override
    public List<Pelicula> getMovies() {
        return lstPel;
    }
    
}
