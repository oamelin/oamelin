package Entidades;

public class Ahorcado {
    private String[] palabra;
    private int letras_encontradas;
    private int cantidadMaximas;

    public Ahorcado() {
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras_encontradas() {
        return letras_encontradas;
    }

    public void setLetras_encontradas(int letras_encontradas) {
        this.letras_encontradas = letras_encontradas;
    }

    public int getCantidadMaximas() {
        return cantidadMaximas;
    }

    public void setCantidadMaximas(int cantidadMaximas) {
        this.cantidadMaximas = cantidadMaximas;
    }

 }
