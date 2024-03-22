/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraccion;

/**
 *
 * @author PcNitro
 */
public class Abstraccion {

    public static void main(String[] args) {
        
        Pez pez1 = new Pez();
        System.out.println("Objeto Pez");
        pez1.nadar();
        pez1.respirar();
        
        System.out.println("Objeto Perro");
        Perro perro1 = new Perro();
        perro1.ladrar();
        perro1.respirar();
        
        System.out.println("Objeto Gato");
        Gato gato1 = new Gato();
        gato1.maullar();
        gato1.respirar();
        
        
        
        
    }
    
}
