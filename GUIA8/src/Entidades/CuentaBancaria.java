/*
 */
package Entidades;

public class CuentaBancaria {
     private int numeroCuenta;
     private long dniCliente;
     private long saldoActual;

    public CuentaBancaria() {
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public long getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(long saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public void toString() {
        System.out.println("DNI: "+this.getDniCliente()+"\nCuenta: "+this.getNumeroCuenta()
                +"\nSaldo: "+this.getSaldoActual()); 
    }

}
