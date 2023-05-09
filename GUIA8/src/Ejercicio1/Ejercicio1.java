/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;


public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cta1 = new CuentaBancaria();
        CuentaBancariaServicio scb = new CuentaBancariaServicio();
        cta1=scb.crearCuenta();
        scb.consultarSaldo(cta1);
        scb.consultarDatos(cta1);

    }
    
}
