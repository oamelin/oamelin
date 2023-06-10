/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import Entidades.Persona;
import Servicios.PersonaServicio;
/**
 *
 * @author CECI
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona[] p = new Persona[4];
     
        PersonaServicio sp1 = new PersonaServicio();
        for (int i = 0; i < 4; i++) {
            p[i]=new Persona();
            sp1.crearPersona(p[i]);
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("--------------------------");
            System.out.println(p[i]);
        }
        
        /// boolean b=sp1.esMayorDeEdad(p1);
        
        /// sp1.calcularIMC(p1);
        
        int[] IMC= new int[4];
        boolean[] edad= new boolean[4];
        
        int sp=0,bp=0,id=0;
        int ma=0,me=0;
        for (int i = 0; i < 4; i++) {
            IMC[i] = sp1.calcularIMC(p[i]);
            switch (IMC[i]){
                case 1:
                    sp++;
                    break;
                case 0:
                    id++;
                    break;
                case -1:
                    bp++;
                    break;
            }
            edad[i] = sp1.esMayorDeEdad(p[i]);
            if (edad[i]) {
                ma++;
            }else{
                me++;
            }
        }
        
        System.out.println("Mayores de edad "+(ma*100)/4);
        System.out.println("Menores de edad "+(me*100)/4);
        System.out.println("Sobre peso: "+(sp*100)/4);
        System.out.println("Bajo peso: "+(bp*100)/4);
        System.out.println("Peso ideal: "+(id*100)/4);
    }
    
    
}







