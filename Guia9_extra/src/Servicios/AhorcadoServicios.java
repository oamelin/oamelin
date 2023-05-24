/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;


public class AhorcadoServicios {

    public AhorcadoServicios() {
    }
    Ahorcado a =new Ahorcado();
   
    public void crearJuego(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        System.out.print("Ingrese la palavra a encontrar: ");
        String entrada=leer.next();
        System.out.print("Ingrese la cantiadad de intentos: ");
        int intentos = leer.nextInt();
        String[] p= new String[entrada.length()];
        for (int i = 0; i < entrada.length(); i++) {
            p[i]=entrada.substring(i,i+1);
        }
        a.setPalabra(p);
        a.setIntentos(intentos);
    }
    private void longitud() {
        System.out.println("Longitud de la pabra a encontrar: "+a.getPalabra().length );
    }
    private void buscar(String letra) {
        String[] p=a.getPalabra();
        boolean encontrada=false;
        for (int i = 0; i < p.length; i++) {
                    if ( p[i].equals(letra)){
                
                encontrada=true;
                break;
            }
        }
        if (encontrada){
                System.out.println("La letra "+letra+" perteneca a la palabra");
            }else{
                System.out.println("La letra "+letra+" NO perteneca a la palabra");
        }
    }
    public void juego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        this.crearJuego();
        this.longitud();
        System.out.print("Ingresar una letra: ");
        this.buscar(leer.next());
    }
}

//Definir los siguientes métodos en AhorcadoService:
//Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
//Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.