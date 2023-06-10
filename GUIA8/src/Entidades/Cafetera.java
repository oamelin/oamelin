package Entidades;

public class Cafetera {
    private int capacidadMáxima = 20 ; /// (la cantidad máxima de café que puede contener la cafetera)
    private int cantidadActual; /// (la cantidad actual de café que hay en la cafetera)

    public Cafetera() {
    }

    public Cafetera(int cantidadActual) {
        this.cantidadActual = cantidadActual;
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

