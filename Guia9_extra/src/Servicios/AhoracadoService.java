/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhoracadoService {
    Ahorcado a=new Ahorcado();
    int acierto[];
    public void crearJuego(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        System.out.print("Ingresar la palabra a encontrar: ");
        palabra=leer.next();
        System.out.print("Ingresar la cantidad de jugadas máxima: ");
        a.setCantidadMaximas(leer.nextInt());
        a.setLetras_encontradas(0);
        // return a;
///     
        
    } 
    public void longitud(){
        System.out.println("Longitud de la palabra ;"+a.getPalabra().length );
    } 
    
    public void buscar(String c){
    Ahorcado a=new Ahorcado();
        int b=0;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if ((a.getPalabra())[i].equalsIgnoreCase(c)){
                System.out.println("El Caracter "+c+" esta en la posision "+i+1);
                a.setLetras_encontradas(i);
                b=1;
            }
        }
        if b==0 {
            System.out.println("El Caracter "+c+" No esta");
        }
    }  
   public boolean encontradas(String c){
       
   }  
   
que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. 
Este método además deberá devolver true si la letra estaba y false si la letra no estaba, 
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
//Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.

}
