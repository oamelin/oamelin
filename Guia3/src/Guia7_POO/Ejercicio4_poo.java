/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método 
para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo y un 
método para calcular el perímetro del rectángulo. Por último, tendremos un 
método que dibujará el rectángulo mediante asteriscos usando la base y la 
altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */

package Guia7_POO;
public class Ejercicio4_poo {
    public static void main(String[] args) {
        System.out.println("Ingrsar los valores para el rectangulo ");
        Rectangulo rect1 = new Rectangulo();
        System.out.println("Ls superficie es:"+rect1.Superficie());
        System.out.println("El perimetro es:"+rect1.Perímetro() );
        System.out.println("Su grafico es:");
        rect1.graficar();
    }
    
}
