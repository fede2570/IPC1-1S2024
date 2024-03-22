/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author PcNitro
 */
public class Clase4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona(String nombre, int edad, int carnet
        /*Persona persona1 = new Persona("David", 30, 201501000);
        persona1.carnet = 201901000;
        persona1.nombre = "David";
        persona1.edad = 20;
        persona1.caminar();
        persona1.correr();
        persona1.hablar();
        
        Persona persona2 = new Persona("David2", 25, 201701000);
        persona1.carnet = 201801000;
        persona2.nombre = "David2";
        persona2.edad = 21;
        persona2.caminar();
        persona2.correr();
        persona2.hablar();*/
        
        LinkedList<Persona> lista_personas = new LinkedList<>();
        Persona persona1 = new Persona("David", 40, 201701000);
        lista_personas.add(persona1);
        lista_personas.add(new Persona("David2", 35, 202001000));
        
        lista_personas.remove(0);
        System.out.println(lista_personas.get(0).carnet);
        
        /*for(int i = 0; i < lista_personas.size(); i++) {
            System.out.println(lista_personas.get(i).carnet + " - " + lista_personas.get(i).nombre);
        }
        for(Persona persona: lista_personas) {
            System.out.println(persona.carnet + " - " + persona.nombre);
        }*/
        //lista_personas.clear();
        /*for(Persona persona: lista_personas) {
            System.out.println(persona.carnet + " - " + persona.nombre);
        }
        if (lista_personas.isEmpty()) {
            System.out.println("Esta vacia");
        } else {
            System.out.println("Contiene datos");
        }*/
        
    }
    
}
