/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author kevin
 */
public class Persona {
    private String nombre;
    private String apPaterno;
    private String apMaternos;
    private int edad;
    private String curp;

    public Persona() {
    }

    public Persona(String nombre, String apPaterno, String apMaternos, int edad, String curp) {
        this.nombre = nombre;
        this.apPaterno = apPaterno;
        this.apMaternos = apMaternos;
        this.edad = edad;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaternos() {
        return apMaternos;
    }

    public void setApMaternos(String apMaternos) {
        this.apMaternos = apMaternos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "\n apPaterno=" + apPaterno + "\n apMaternos=" + apMaternos + "\n edad=" + edad + "\n curp=" + curp + '}';
    }
    
    
}
