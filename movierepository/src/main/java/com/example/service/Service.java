package com.example.service;
import java.util.List;
import com.example.Repositories.*;
import com.example.interfaces.repo_interface;


public class Service {
     private repo_interface repository;

    public Service(repo_interface repository) {
        this.repository = repository;
    }

    public List<Pelicula> getMovies() {
        return repository.getMovies();
    }
}
