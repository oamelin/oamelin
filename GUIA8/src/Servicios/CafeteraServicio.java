package Servicios;

import Entidades.Cafetera;


public class CafeteraServicio {

    public CafeteraServicio() {
    }

    public void llenarCafetera(Cafetera m) {
        m.setCantidadActual(m.getCapacidadMáxima());
    }
    public void servirTaza(int cap, Cafetera cf) {
        if (cf.getCantidadActual()>= cap) {
                System.out.println("Se lleno lleno la taza");
            System.out.println(cf.getCantidadActual()+"-"+cap+"");
            cf.setCantidadActual(cf.getCantidadActual()-cap);
            System.out.println("Estado del Cafe: "+cf.getCantidadActual());
        }else{
            if (cf.getCantidadActual() != 0) {
                System.out.println("Se completo solo "+cf.getCantidadActual());
            }else{
                System.out.println("LA cafetera esta vacia");
            }
            cf.setCantidadActual(0);
        }   
    }
}

