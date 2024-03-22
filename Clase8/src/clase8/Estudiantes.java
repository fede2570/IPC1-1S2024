/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase8;

import java.io.Serializable;

/**
 *
 * @author PcNitro
 */
public class Estudiantes implements Serializable {

    private int carnet;
    private String nombre;
    
    public Estudiantes(int carnet, String nombres) {
        this.carnet = carnet;
        this.nombre = nombres;
    }
    
    
    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
