package com.example;
import java.util.*;
import com.example.Repositories.*;
import com.example.service.*;
import com.example.interfaces.*;

public class App {

    public static void main(String[] args) {

        List<repo_interface> repositories = new ArrayList<>();
        repositories.add(new memory_repo());
        repositories.add(new postgres_repo());
        repositories.add(new file_repo());

        Service service;
        for (repo_interface repository : repositories) {
            service = new Service(repository);
            List<Pelicula> movies = service.getMovies();
            for (Pelicula movie : movies) {
                System.out.println(movie.toString());
            }
}

}

}
