/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaestudiantes;

/**
 *
 * @author ramon
 */
public class SistemaEstudiantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1 = new Estudiante("Ramon Nolasco", 21, "12141339", "ING. CIENCIA DE DATOS E INTELIGENCIA ARTIFICIAL", 7.9);
        Estudiante e2 = new Estudiante("Ana Ramirez", 20, "14143820", "ING. INDUSTRIAL Y DE SISTEMAS", 8.6);

        Curso c1 = new Curso("Programacion I", "502", "Dario Cardona", 20);
        Curso c2 = new Curso("Algebra", "608", "Nestor Almendra", 20);
        
        
        c1.agregarEstudiante(e1);
        c1.agregarEstudiante(e2);
        
        //c2.agregarEstudiante(e2);

        System.out.println(e1);
        System.out.println(e2);
        
        System.out.println(c1);
        System.out.println(c2);
        
       
    }
    
}
