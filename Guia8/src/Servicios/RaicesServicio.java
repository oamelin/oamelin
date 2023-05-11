package Servicios;

import Entidades.Raices;

public class RaicesServicio {
    Raices r=new Raices();
            
    public double getDiscriminante(Raices r){
        return Math.pow(r.getB(),2)-(4* r.getA()*r.getC());
    }
    
    public boolean tieneRaices(Raices r){
        return (this.getDiscriminante(r)>=0 );
    }
    
    public boolean tieneRaiz(Raices r){
        return ( this.getDiscriminante(r)== 0);
    }
    
    public void obtenerRaices(Raices r){
        if (this.tieneRaices(r)){
            System.out.println("");
        } 
    }
}
