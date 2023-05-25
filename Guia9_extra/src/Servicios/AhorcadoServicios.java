/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;


public class AhorcadoServicios {

    Ahorcado a =new Ahorcado();
  
    public AhorcadoServicios() {
    }
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
                a.setEncontrada(i,true);
                a.setEncontradas((a.getEncontradas()+1));
                encontrada=true;
            }
        }
        if (encontrada){
                System.out.println("La letra "+letra+" perteneca a la palabra");
            }else{
                System.out.println("La letra "+letra+" NO perteneca a la palabra");
        }
    }
    public boolean encontradas(String letra){
        boolean encontrada=false;
        buscar(letra);
        String[] p=a.getPalabra();
        for (int i = 0; i < p.length; i++) {
            if ( p[i].equals(letra)){
                encontrada=true;
                break;
            }
        }
        if (!(encontrada)){
            a.setIntentos((a.getIntentos()-1));
        }
        System.out.println("Letras encontradas "+a.getEncontradas());
        System.out.println("Le restan encontgar "+(a.getEncontradas()-a.getPalabra().length));
        System.out.println("Intentos "+intentos());
        return encontrada;
    }
    public int intentos(){
        return a.getIntentos();
    }
    public void juego() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
        this.crearJuego();
        do{
            System.out.print("Ingresar una letra: ");
            this.longitud();
            this.encontradas(leer.next());
            if (a.getEncontradas()==a.getPalabra().length){
                System.out.println("FELICIDADES la palabra era "+a.getPalabra().toString());
            }
        }while (a.getIntentos()>0);
        if (intentos()==0){
            System.out.println("PErdiste la palabra era "+a.getPalabra());
        }
    }
}
