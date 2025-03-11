/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestudiantes;

/**
 *
 * @author ramon
 */
public class Curso {
    private String nombre;
    private String codigo;
    private String profesor;
    private int maxEstudiantes;
    private Estudiante[] listaEstudiantes;  
    private int cantidadEstudiantes;  

    
    public Curso(String nombre, String codigo, String profesor, int maxEstudiantes){
        this.nombre = nombre;
        this.codigo = codigo;
        this.profesor = profesor;
        this.maxEstudiantes = maxEstudiantes;
        this.listaEstudiantes = new Estudiante[maxEstudiantes];  
        this.cantidadEstudiantes = 0;
    }

    
    public String getNombre(){
        return nombre;
    }

    
    public boolean agregarEstudiante(Estudiante estudiante){
        if (cantidadEstudiantes < maxEstudiantes){
            listaEstudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
            return true;
        }
        return false;
    }

    
    public String toString() {
        String info = "Curso: " + nombre + " | Codigo: " + codigo + 
                    " | Profesor: " + profesor + " | Estudiantes: ";

        if (cantidadEstudiantes == 0) {
            info += "Sin estudiantes";
        } else {
            for (int i = 0; i < cantidadEstudiantes; i++) {
                info += listaEstudiantes[i].getNombre() + ", ";
            }   
            info = info.substring(0, info.length() - 2);
        }
        return info;
    }   
}
