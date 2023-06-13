/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia11;

import java.util.Scanner;

public class Equipo {
    private String NombreEquipo;
    private Jugador jugadores;

    public Equipo() {
    }

    public Equipo(String NombreEquipo, Jugador jugadores) {
        this.NombreEquipo = NombreEquipo;
        this.jugadores = jugadores;
    }

    public String getNombreEquipo() {
        return NombreEquipo;
    }

    public void setNombreEquipo(String NombreEquipo) {
        this.NombreEquipo = NombreEquipo;
    }

    public Jugador getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador jugadores) {
        this.jugadores = jugadores;
    }

    void crearEquipo() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("-------  Creara un Equipo  -------");
        System.out.println("Ingese el Equipo: ");
        this.setNombreEquipo(leer.next());
        System.out.print("Cargara Jugadores");
        if (leer.next().equalsIgnoreCase("S")){
             this.setJugadores(new Jugador()); 
        }else {System.out.println("No cargara jugador");
        }
    }

    void mostrarEquipo() {
        System.out.println(this.NombreEquipo);
        System.out.println(this.jugadores.toString());
    }
    
    
            
}
