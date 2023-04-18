package Guia5_Extras;

import java.util.Scanner;

public class Ejercicio4_extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float[][] alumnos = new float[3][5];
        for(int i = 0;i<3;i++){
            System.out.println("Alumno "+i);
            for(int j=0;j<4;j++){
                if (j<2) {
                    System.out.println("Nota Parcial ");
                    alumnos[i][j]=leer.nextFloat();
                }else{
                    System.out.println("Nota Practico ");
                    alumnos[i][j]=leer.nextFloat();
                }                 
            }
        }
        for(int i=0;i<3;i++){
            System.out.println("Alumno "+i);
            System.out.print("Notas =>");
            float result =0;
            for(int j=0;j<4;j++){
                System.out.print(" "+alumnos[i][j]);
                switch(j)
                {
                case 0:
                    System.out.println("result= "+result);
                    result+=alumnos[i][j]*0.10;
                    break;
                case 1:
                    System.out.println("result= "+result);
                    result+=alumnos[i][j]*0.15;
                    break;
                case 2:
                    System.out.println("result= "+result);
                    result+=alumnos[i][j]*0.25;
                    break;
                case 3:
                    System.out.println("result= "+result);
                    result+=alumnos[i][j]*0.50;
                    break;
                }
            }
            alumnos[i][4]=result;
            System.out.println(" "+alumnos[i][4]+"; ");
        }
        int ap=0,des=0;
        for(int i = 0;i<3;i++){
                if (alumnos[i][4]>=7) {
                    ap++;
                }else{
                    des++;
                }
        }
        System.out.println("Alumnos aprobados "+ap);
        System.out.println("Alumnos desaprobados "+des);
    }
    
}
