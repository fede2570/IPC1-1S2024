/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author PcNitro
 */
public class Persona {
    
    String nombre;
    int edad;
    int carnet;
    
    Persona() {
        
    }
    
    Persona(String nombre, int edad, int carnet) {
        this.nombre = nombre;
        this.edad = edad;
        this.carnet = carnet;
    }
    
    public void hablar() {
        System.out.println("Hablar");
    }
    
    public void caminar() {
        System.out.println("Caminar");
    }
    
    public void correr() {
        System.out.println("Correr");
    }
    
}
