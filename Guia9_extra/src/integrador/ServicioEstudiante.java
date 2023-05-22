/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

public class ServicioEstudiante {
    
    public ServicioEstudiante() {
    }
        public double calcularPromedio(Estudiante[] estudiantes) {
        double sumaNotas = 0.0;
        for (Estudiante estudiante : estudiantes) {
            sumaNotas += estudiante.nota;
        }
        return sumaNotas / estudiantes.length;
    }
        
    public String[] obtenerAlumnosPorEncimaDelPromedio(Estudiante[] estudiantes, double promedio) {
        int count = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.nota > promedio) {
                count++;
            }
        }

        String[] alumnosPorEncimaDelPromedio = new String[count];
        int i = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.nota > promedio) {
                alumnosPorEncimaDelPromedio[i] = estudiante.nombre;
                i++;
            }
        }
        return alumnosPorEncimaDelPromedio;
    }
}
