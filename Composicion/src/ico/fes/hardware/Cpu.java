/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.hardware;

/**
 *
 * @author kevin
 */
public class Cpu {
    String marca;
    String modelo;
    int velocidadProcesador;

    public Cpu() {
    }

    public Cpu(String marca, String modelo, int velocidadProcesador) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadProcesador = velocidadProcesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public void setVelocidadProcesador(int velocidadProcesador) {
        this.velocidadProcesador = velocidadProcesador;
    }

    @Override
    public String toString() {
        return "Cpu{" + "marca=" + marca + ", modelo=" + modelo + ", velocidadProcesador=" + velocidadProcesador + '}';
    }
    
    
}
