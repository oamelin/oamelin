/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author CECI
 */
public class CuentaBancariaServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria scb = new CuentaBancaria();
    public CuentaBancaria crearCuenta(){
        System.out.print("Ingresar DNI: ");
        scb.setDniCliente(leer.nextLong());
        System.out.print("Ingresar Nro de Cuenta;");
        scb.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingresar Saldo Actual: ");
        scb.setSaldoActual(leer.nextLong());
        return scb;
    }

public void ingresar(CuentaBancaria c,long importe){
    c.setSaldoActual(c.getSaldoActual()+importe);
}

public void retirar(CuentaBancaria c,long importe){
    long result = c.getSaldoActual();
    if (result < importe ){
        System.out.println("Se retiro: "+c.getSaldoActual());
        c.setSaldoActual(0);
    }else{
        System.out.println("Se retira: "+importe);
        c.setSaldoActual(c.getSaldoActual()-importe);
    }
}
public void extraccionRapida(CuentaBancaria c, long importe){
    if (importe > (c.getSaldoActual()*0.20)){
        System.out.println("No se puede realizarla extraición\n Ingrese un monto menor");
    }else{
        System.out.println("Se retiro: "+importe);
        c.setSaldoActual(c.getSaldoActual()-importe);
        System.out.println("Saldo en la cuenta: "+c.getSaldoActual());
    }
}
public void consultarSaldo(CuentaBancaria c){
    System.out.println("El saldo de la cuenta es: "+c.getSaldoActual());
}
public void consultarDatos(CuentaBancaria c){
    System.out.println("----Los datos de la cuenta -----");
    c.toString();
}

    
}
