package Guia10_4;
public class Pelicula {
     private String título;
     private String director;
     private double duración; /// película (en horas).

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuración() {
        return duración;
    }

    public void setDuración(double duración) {
        this.duración = duración;
    }

    public Pelicula(String título, String director, double duración) {
        this.título = título;
        this.director = director;
        this.duración = duración;
    }
    public Pelicula() {
    }

    @Override
    public String toString() {
        return "Pelicula{" + "t\u00edtulo=" + título + ", director=" + director + ", duraci\u00f3n=" + duración + '}';
    }
    
}


