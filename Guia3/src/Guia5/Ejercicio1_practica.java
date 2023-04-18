package Guia5;

public class Ejercicio1_practica {

        public static void main(String[] args) {
        int[] vec = new int[100];
        for(int i=0;i<100;i++){
            vec[i]=i+1;
        }
        System.out.println("Elementos ");
        System.out.print("=> ");
        for(int i=100;i>0;i--){
            if (i==50) {
            System.out.println(vec[i-1]+" ");
            }
            else {
                System.out.print(vec[i-1]+" ");}
            }
            System.out.println("");
        }
}
    
