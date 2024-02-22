package com.example;
import java.util.*;
import com.example.Repositories.*;
import com.example.service.*;
import com.example.interfaces.*;

public class App {

    public static void main(String[] args) {

        repo_interface repository = new memory_repo();
        Service service = new Service(repository);
        List<Pelicula> movies = service.getMovies();
        for (Pelicula movie : movies) {
            System.out.println(movie.toString());
        }

    }


}
