package integrador;

public class Escuela {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[8];
        ServicioEstudiante se= new ServicioEstudiante();

        estudiantes[0] = new Estudiante("Oscar", 7.5);
        estudiantes[1] = new Estudiante("PAblo", 8.0);
        estudiantes[2] = new Estudiante("Jhona", 6.5);
        estudiantes[3] = new Estudiante("Ana", 9.2);
        estudiantes[4] = new Estudiante("Luis", 7.8);
        estudiantes[5] = new Estudiante("Laura", 8.7);
        estudiantes[6] = new Estudiante("Nicolas", 6.9);
        estudiantes[7] = new Estudiante("Sofía", 9.5);

        double promedio =se.calcularPromedio(estudiantes);
        
        System.out.println("Promedio de notas del curso: " + promedio);

        String[] alumnoPromedio= se.obtenerAlumnosPorEncimaDelPromedio(estudiantes, promedio);
        System.out.println("Alumnos con nota por encima del promedio:");
        for (String alumno : alumnoPromedio) {
            System.out.println(alumno);
        }
    }



}
