/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.central;

import ico.fes.hardware.Cpu;
import ico.fes.hardware.Monitor;
import ico.fes.hardware.Mouse;
import ico.fes.hardware.Teclado;

/**
 *
 * @author kevin
 */
public class Computadora {
    private int marca;
    private int modelo;
    private Monitor []monitor;
    private Mouse mouse;
    private Teclado teclado;
    private Cpu cpu;

    public Computadora() {
    }

    public Computadora(int marca, int modelo, Monitor[] monitor, Mouse mouse, Teclado teclado, Cpu cpu) {
        this.marca = marca;
        this.modelo = modelo;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public Computadora(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Monitor[] getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor[] monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }
    
    
}

