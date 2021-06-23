/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Hecho por: Tirado Del Rosal Kevin Ulises
 * Fecha: 22/06/2021
 */
package ico.fes.herencia;

public class Persona {
    private String nombre;
    private int edad;
    private int genero;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, int genero, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", altura=" + altura + '}';
    }
    
}
