package com.example.service;
import java.util.List;
import com.example.Repositories.*;
import com.example.interfaces.Repository;


public class Service {
     private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Pelicula> getMovies() {
        return repository.getMovies();
    }
}
