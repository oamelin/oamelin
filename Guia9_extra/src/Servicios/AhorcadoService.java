/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    public Ahorcado a=new Ahorcado();

    public AhorcadoService() {
        
    }
    private boolean[] aciertos;
    public void crearJuego(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra;
        System.out.print("Ingresar la palabra a encontrar: ");
        palabra=leer.next();
        aciertos=new boolean[palabra.length()];
        System.out.print("Ingresar la cantidad de jugadas máxima: ");
        a.setCantidadMaximas(leer.nextInt());
        a.setLetras_encontradas(0);
        // return a;
    } 
    public void longitud(){
        System.out.println("Longitud de la palabra ;"+a.getPalabra().length );
    } 
    
    public boolean buscar(String c){
        int b=0;
        for (int i = 0; i < a.getPalabra().length; i++) {
            if ((a.getPalabra())[i].equalsIgnoreCase(c)){
                System.out.println("El Caracter "+c+" esta en la posision "+i+1);
                a.setLetras_encontradas(a.getLetras_encontradas()+1);
                aciertos[i]=true;
                b=1;
            }
        }
        if (b==0) {
            System.out.println("El Caracter "+c+" No esta");
            return false;
        }else{
            return true;
        }
    }  
   public boolean encontradas(String c){
       int ac=0,fa=0;
       if (this.buscar(c)){
           this.toString();
           for (int i = 0; i < aciertos.length; i++) {
                if (aciertos[i]){
                    System.out.print(" "+a.palabra[i]+" " );
                    ac++;
                }else{
                    fa++;
                    System.out.print(" - " );
                }
           }System.out.print("Numero de letras(encontradas,faltantes): ("+ac+","+fa+")");
       }
   }  

    @Override
    public String toString() {
        return "AhoracadoService{" + "a=" + a + ", aciertos=" + aciertos + '}';
    }

   public void intentos(boolean b){
       if (b) {
           System.out.println("le quedan "+a.getCantidadMaximas());
       }else{
           a.setCantidadMaximas(a.getCantidadMaximas()-1);
           System.out.println("le quedan "+a.getCantidadMaximas());
       }
   }
   public void juego(){
       Scanner leer=new Scanner(System.in).useDelimiter("\n");
        do{
            this.crearJuego();
            do{
                System.out.print("ingresar una letra: ");
                this.buscar(leer.next());
                this.toString();
            }while(true);
        }while(true);
        
      
   }
}
//Ingrese una letra:
//a
// 6
//Mensaje: La letra pertenece a la palabra
//Número de letras (encontradas, faltantes): (3,4)
//Número de oportunidades restantes: 4
