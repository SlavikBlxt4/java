package com.example;
import java.util.*;
import com.example.Repositories.*;
import com.example.service.*;
import com.example.interfaces.*;

public class App {

    public static void main(String[] args) {

        List<Repository> lstRepositories = new ArrayList<>();
        lstRepositories.add(new MemoryRepo());
        lstRepositories.add(new PostgreRepo());
        lstRepositories.add(new FileRepo());

        Service service;
        for (Repository repository : lstRepositories) {
            service = new Service(repository);
            List<Pelicula> movies = service.getMovies();
            for (Pelicula movie : movies) {
                System.out.println(movie.toString());
            }
        }
    }
}
