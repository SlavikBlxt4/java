import java.util.ArrayList;

public class PeliculaRepository{
    private ArrayList<Pelicula> peliculas;

    public PeliculaRepository() {
        this.peliculas = new ArrayList<>();
    }

    public void insertar(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void eliminar(Pelicula pelicula) {
        peliculas.remove(pelicula);
    }

    public ArrayList<Pelicula> obtenerTodos() {
        return peliculas;
    }
}
