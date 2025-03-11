/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestudiantes;

/**
 *
 * @author ramon
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;
    private String carrera;
    private double promedio;
    private Curso[] cursos;
    private int cantidadCursos;  

    public Estudiante(String nombre, int edad, String matricula, String carrera, double promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
        this.cursos = new Curso[5];  
        this.cantidadCursos = 0;
    }

    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    public void inscribirseEnCurso(Curso curso){
        if (cantidadCursos < 10) {  
            if (curso.agregarEstudiante(this)) {
                cursos[cantidadCursos] = curso;
                cantidadCursos++;
                System.out.println(nombre + " se inscribio en " + curso.getNombre());
            } else {
                System.out.println("No hay cupo en " + curso.getNombre());
            }
        } else {
            System.out.println(nombre + " ya tiene el maximo de cursos permitidos.");
        }
    }
       
    public String toString() {
        String info = "Estudiante: " + nombre + " | Matricula: " + matricula + 
                    " | Carrera: " + carrera + " | Promedio: " + promedio +
                    " | Cursos inscritos: ";

        if (cantidadCursos == 0) {
            info += "Ninguno";
        } else {
            for (int i = 0; i < cantidadCursos; i++) {
                info += cursos[i].getNombre() + ", ";
            }
            info = info.substring(0, info.length() - 2); 
        }
        return info;
    }   
}
