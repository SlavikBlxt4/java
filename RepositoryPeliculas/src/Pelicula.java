public class Pelicula {
    private String titulo;
    private String director;
    private int anioEstreno;



    public Pelicula(String titulo, String director, int anioEstreno) {
        this.titulo = titulo;
        this.director = director;
        this.anioEstreno = anioEstreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }


}
