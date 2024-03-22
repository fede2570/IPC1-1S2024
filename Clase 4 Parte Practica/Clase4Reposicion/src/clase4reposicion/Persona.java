/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4reposicion;

/**
 *
 * @author PcNitro
 */
public class Persona {
    
    String nombre;
    int carnet;
    
    public Persona() {
        
    }
    
    public Persona(String nombre, int carnet) {
        this.nombre = nombre;
        this.carnet = carnet;
    }
    
    public void caminar() {
        System.out.println("Caminar");
    }
    
    public void hablar() {
        System.out.println("Hablar");
    }
    
}
