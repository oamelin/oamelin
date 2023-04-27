package Guia7_POO;

import java.util.Scanner;
public class Operacion {
    Scanner leer = new Scanner(System.in);
    private int nro1,nro2;
//Método constructor con todos los atributos pasados por parámetro.
    public Operacion(int nro1, int nro2) {
        this.nro1 = nro1;
        this.nro2 = nro2;
    }
//Método constructor sin los atributos pasados por parámetro.
    public Operacion() {
    }
///Métodos get y set.
    public int getNro1() {
        return nro1;
    }
    public int getNro2() {
        return nro2;
    }
    public void setNro1() {
        System.out.print("Ingreso 1er nro: ");
        this.nro1 = leer.nextInt();
    }
    public void setNro2() {
//        do
//        {
            System.out.print("Ingreso 2do nro debe ser distinto de cero: ");
            this.nro2 = leer.nextInt();
//        }while (this.nro2 ==0);
    }
// Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
    public void crearOperacion(){
        System.out.println("Ingresar los valores de dos numero ");
        this.setNro1();
        this.setNro2();
    }

// Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int suma(){
        return this.nro1+this.nro2;
    }
// Método restar(): calcular la resta de los números y devolver el resultado al main
    public int restar(){
        return this.nro1-this.nro2;
    }
//Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
    public int multiplicar(){
        return this.nro1*this.nro2;
    }
//Método dividir(): primero valida que no se haga una división por cero, 
//si fuera a pasar una división por cero, el método devuelve 0 y se le informa 
//al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public int dividir(){
        if (this.nro2 != 0)
                {return this.nro1/this.nro2;}
        else
        {
            System.out.println("El 2do nro es 0 no se puede dividir ");
            return 0;
        }
    }

}

