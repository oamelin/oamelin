/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class Ahorcado {
    private String palabra[];
    private int encontradas;
    private boolean encontrada[];
    private int intentos;

    public Ahorcado(){}
    public Ahorcado(String[] palabra, int intentos) {
        
        this.palabra = palabra;
        this.intentos = intentos;
        this.encontrada= new boolean[palabra.length];
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
        this.encontrada= new boolean[palabra.length];
    }

    public boolean[] getEncontrada() {
        return encontrada;
    }

    public void setEncontrada(int i ,boolean encontrada) {
        this.encontrada[i] = encontrada;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
}

