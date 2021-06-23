/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author kevin
 */
public class UsarAlumno {
    public static void main(String [] args){
        Alumno prueba = new Alumno("318277585", "ICO", 2, "Kevin", 19, 1, 1.73f);
        System.out.println("Nombre: " + prueba.getNombre());
        System.out.println(prueba);
    }
    
}
