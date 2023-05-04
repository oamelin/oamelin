package Entidades;

public class Cafetera {
    private int capacidadMáxima; /// (la cantidad máxima de café que puede contener la cafetera)
    private int cantidadActual; /// (la cantidad actual de café que hay en la cafetera)

    public Cafetera() {
    }

    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}

