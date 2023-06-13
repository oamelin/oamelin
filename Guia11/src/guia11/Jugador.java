/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11;

import java.util.Scanner;

public class Jugador {
    
    private String nombre;
    private String apllido;
    private String posición;
    private int numero;
    private Jugador jugador;

    public Jugador() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Nombre: ");
        this.setNombre(leer.next());
        System.out.print("Apellido: ");
        this.setApllido(leer.next());
        System.out.print("Posiion: ");
        this.setPosición(leer.next());
        System.out.print("Numero: ");
        this.setNumero(leer.nextInt());
    }

    public Jugador(String nombre, String apllido, String posición, int numero, Jugador jugador) {
        this.nombre = nombre;
        this.apllido = apllido;
        this.posición = posición;
        this.numero = numero;
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApllido() {
        return apllido;
    }

    public void setApllido(String apllido) {
        this.apllido = apllido;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
}
