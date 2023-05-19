
package Guia9_extra2;

import java.util.Scanner;

public class Ahorcado {
    private char[] palabra;
    private boolean[] encontradas;
    private int maxJugadas;
    private int jugadasRealizadas;

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la palabra a buscar:");
        String palabraUsuario = scanner.nextLine();
        palabra = palabraUsuario.toCharArray();
        encontradas = new boolean[palabra.length];

        System.out.println("Ingresa la cantidad máxima de jugadas:");
        maxJugadas = scanner.nextInt();
        scanner.nextLine();

        jugadasRealizadas = 0;
    }

    public void longitud() {
        System.out.println("La longitud de la palabra a buscar es: " + palabra.length);
    }

    public void buscar(char letra) {
        boolean encontrada = false;

        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontradas[i] = true;
                encontrada = true;
            }
        }

        if (encontrada) {
            System.out.println("La letra '" + letra + "' está en la palabra.");
        } else {
            System.out.println("La letra '" + letra + "' no está en la palabra.");
            jugadasRealizadas++;
        }
    }

    public boolean encontradas(char letra) {
        int encontradasCount = 0;

        for (boolean encontrada : encontradas) {
            if (encontrada) {
                encontradasCount++;
            }
        }
        System.out.println("Letras encontradas: " + encontradasCount);
        System.out.println("Letras faltantes: " + (palabra.length - encontradasCount));
        return encontradasCount == palabra.length;
    }
    public void intentos() {
        int oportunidadesRestantes = maxJugadas - jugadasRealizadas;
        System.out.println("Tienes " + oportunidadesRestantes + " intentos restantes.");
    }
    public void juego() {
        crearJuego();
        while (jugadasRealizadas < maxJugadas) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingresa una letra:");            char letra = scanner.nextLine().charAt(0);
            buscar(letra);
            if (encontradas(letra)) {
                System.out.println("¡Has encontrado la palabra!");
                break;
            }
            intentos();
        }
        if (jugadasRealizadas == maxJugadas) {
            System.out.println("¡Te has quedado sin intentos! La palabra era: " + String.valueOf(palabra));
        }
    }
    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.juego();
    }
}

    

