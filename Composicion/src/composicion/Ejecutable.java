/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import ico.fes.central.Computadora;
import ico.fes.hardware.Cpu;
import ico.fes.hardware.Monitor;
import ico.fes.hardware.Mouse;
import ico.fes.hardware.Teclado;

/**
 *
 * Creado por: Tirado Del Rosal Kevin Ulises
 * Fecha: 20/06/2021
 */
public class Ejecutable {
    public static void main(String []args){
        Computadora compu = new Computadora();
        compu.setMouse(new Mouse("Logitech", "G203", "Elite"));
        compu.setCpu(new Cpu("AMD", "A12", 3));
        compu.setTeclado(new Teclado("Hyperx", "Alloy", 105, 450));
        Monitor[] pantalla = new Monitor[2];
        pantalla[0] = new Monitor("Acer", "Freesyc", 26);
        pantalla[1] = new Monitor("MSI Optix", "G27C5", 27);
        compu.setMonitor(pantalla);
        
        System.out.println(compu);
        System.out.println(compu.getMonitor()[0]);
        System.out.println(compu.getMonitor()[1]);
        
        
    }
    
}
