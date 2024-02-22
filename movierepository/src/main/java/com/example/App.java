package com.example;
import java.util.*;
import com.example.Repositories.*;
import com.example.service.*;
import com.example.interfaces.*;

public class App {

    public static void main(String[] args) {

        repo_interface repository1 = new memory_repo();
        repo_interface repository2 = new postgres_repo();
        repo_interface repository3 = new file_repo();

        Service service1 = new Service(repository1); //memory
        Service service2 = new Service(repository2); //postgres
        Service service3 = new Service(repository3);  //file

        List<Pelicula> movies1 = service1.getMovies();
        List<Pelicula> movies2 = service2.getMovies();
        List<Pelicula> movies3 = service3.getMovies();

        for (Pelicula movie : movies1) {
            System.out.println(movie.toString());
        }

        for (Pelicula movie : movies2) {
            System.out.println(movie.toString());
        }

        for (Pelicula movie : movies3) {
            System.out.println(movie.toString());
        }


    }


}
