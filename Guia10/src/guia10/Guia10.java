/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author CECI
 */
public class Guia10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* //ejemplos de un arraylist de numeros:
        ArrayList<Integer> numerosA = new ArrayList();
        int x = 20;
        numerosA.add(x); //agrega numero en el arrays indice 0
        numerosA.add(30); //agrega numero en el arrays indice 0
        numerosA.add(x); //agrega numero en el arrays indice 0
        for(Integer n : numerosA ){
            System.out.println("Elemento: "+n);
        }
        System.out.println(numerosA.toString());
        numerosA.remove(1); //eliminamos el numero que esta en el indice 0
        System.out.println(numerosA.toString());
        numerosA.remove(0); //eliminamos el numero que esta en el indice 0
        
        //ejemplo de una linkedList de numeros
        LinkedList<Integer> numeroB = new LinkedList();
    // CONJUNTOS
        //ejemplo de un hashset de cadenas
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 30;
        numerosB.add(y);
        System.out.println(numerosB.toString() );
        numerosB.remove(30);//elimina el 30 
        
        //ejemplo de una treeSet de numeros
        TreeSet<Integer> numeros = new TreeSet();
        //ejemplo de un linkedHashSet de cadena:
        LinkedHashSet<String> frases = new LinkedHashSet();
    
    // MAPAS     
        //Ejemplo de un HashMAp de personas
        //Recorrer las dos partes del mapa
        //entry.getKey trae la llave y entry.getValue trae los valores del mapa
        HashMap<Integer,String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno= "Pepe";
        alumnos.put(dni, nombreAlumno);
        dni = 34346889;
        nombreAlumno= "Jose";
        alumnos.put(dni, nombreAlumno);
        for(Map.Entry<Integer,String> alu : alumnos.entrySet()){
            System.out.println("Documento= "+alu.getKey()+
                    ", nombre= "+alu.getValue());
        }
        //Sin Map.Entry
        //mostrar solo las llaves
        for(Integer d : alumnos.keySet()){
            System.out.println("Documento: "+ dni);
        }
        //mostrar solo los valores
        for(String nombre : alumnos.values()){
            System.out.println("Nombre: "+nombre);
        }
        //Ejemplo de un TreeMAp de personas;
        TreeMap<Integer,String> personasB = new TreeMap();
        //Ejemplo de un LinkedHashMap de personas;
        LinkedHashMap<Integer, String> personasC = new LinkedHashMap();
        */
        ArrayList<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        //creamos el interator para recorrer la lista 
        Iterator iteraror = lista.iterator(); //devolvemos el iterador
        System.out.println("Elementos de la lista: ");
        while ( iteraror.hasNext() ){
            System.out.println(iteraror.next() + " ");
        }
        System.out.println();
        
        // LISTAS   
        ArrayList<String> palabra = new ArrayList<>();
        Iterator<String> it = palabra.iterator();
        palabra.add("Cafe");
        palabra.add("hola");
        palabra.add("te");
        while ( it.hasNext()){
            if( it.next().equals("Hola")){ // borramos si esta la palabra holra
                it.remove();
            }
        }
        //CONJUNTOS 
        HashSet<Integer> numeroSet=new HashSet<>();
        Iterator<Integer> it2 = numeroSet.iterator();
        while ( it2.hasNext()){
            if ( it2.next() == 3 ){
                it2.remove();
            }
        }
    }
    
}
