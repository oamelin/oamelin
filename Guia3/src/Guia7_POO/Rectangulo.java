/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7_POO;
import java.util.Scanner;

class Rectangulo {
    Scanner leer = new Scanner(System.in);
    private int altura;
    private int base;

    public Rectangulo() {
        System.out.print("Altura ");this.altura=leer.nextInt();
        System.out.print("Base ");this.base=leer.nextInt();
    }

    public int Superficie(){
       return this.base * this.altura;
    }
    public int Perímetro (){
        return (this.base + this.altura) * 2;
    }
    public void graficar(){
        for(int i=0;i<this.altura;i++){
        for(int j=0;j<this.base;j++){
            if (i==0 || i+1==this.altura || j==0 || j+1== base )
            {
                System.out.print("* ");
            }
            else 
            {
                System.out.print("  ");
            }
        }
        System.out.println("");
    }
    }
}
