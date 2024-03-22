/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase4reposicion;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author PcNitro
 */
public class Clase4Reposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*try {
            int division = 1 / 0;  
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            String nombre = null;
            System.out.println(nombre.charAt(0));       
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        
        System.out.println("hola");*/
        
        /*Persona persona1 = new Persona("David", 201901073);           //Primer Objeto persona1
        
        System.out.println(persona1.carnet + " - " + persona1.nombre);
        persona1.caminar();
        persona1.hablar();
        /*-persona1.carnet = 201901073;
        persona1.nombre = "David";
        
        System.out.println(persona1.carnet + " - " + persona1.nombre);
        
        Persona persona2 = new Persona("David2", 201801073);           //Segundo objeto
        
        System.out.println(persona2.carnet + " - " + persona2.nombre);
        persona2.caminar();
        persona2.hablar();
        /*persona2.carnet = 201801073;
        persona2.nombre = "David2";
        
        System.out.println(persona2.carnet + " - " + persona2.nombre);*/
        
        Persona persona1 = new Persona("David", 201901073);
        Persona persona2 = new Persona("David2", 201801073);
        Persona persona3 = new Persona("David3", 201701073);
        Persona persona4 = new Persona("David4", 201601073);
        Persona persona5 = new Persona("David5", 201501073);
        
        LinkedList <Persona> lista_personas = new LinkedList<>();
        
        lista_personas.add(persona1);       //0
        lista_personas.add(persona2);       //1
        lista_personas.add(persona3);       //2
        lista_personas.add(persona4);       //3
        lista_personas.add(persona5);       //4
        lista_personas.add(new Persona("David6", 201401073));
        
        /*for (int i = 0; i < lista_personas.size(); i++) {
            System.out.println(lista_personas.get(i).carnet + " - " + lista_personas.get(i).nombre);
        }*/
        
        /*for (Persona person: lista_personas) {
            System.out.println(person.carnet + " - " + person.nombre);
        }*/
        
        //System.out.println(lista_personas.get(6).carnet);
        
        /*try {
            System.out.println(lista_personas.get(5).carnet);
        } catch (IndexOutOfBoundsException e) {         //Excepcion de rangos de lista o arreglos
            System.out.println(e.getMessage());
        }*/
        
        
        /*lista_personas.remove(4);               //Remueve el valor en posicion 4
        System.out.println(lista_personas.get(4).carnet);     //Genera una excepcion*/
        
        //lista_personas.clear();             //Vacia la lista
        /*for (Persona person: lista_personas) {
            System.out.println(person.carnet + " - " + person.nombre);
        }*/
        
        /*if (lista_personas.isEmpty()) {
            System.out.println("Esta vacia");
        } else {
            System.out.println("Contiene datos");
        }*/

        Persona []arreglo_personas = new Persona[10];
        arreglo_personas[0] = persona1;
        arreglo_personas[1] = persona2;
        arreglo_personas[2] = persona3;
        arreglo_personas[3] = persona4;
        arreglo_personas[4] = persona5;
        //Posicion 5   es null
        //Posicion 6   es null
        //Posicion 7   es null
        //Posicion 8   es null
        //Posicion 9   es null
        
        
        /*for (int i = 0; i < arreglo_personas.length; i++) {
            if (arreglo_personas[i] != null) {
                System.out.println(arreglo_personas[i].carnet + " - " + arreglo_personas[i].nombre);
            }
        }*/
        for (Persona pers: arreglo_personas) {
            if (pers != null) {
                System.out.println(pers.carnet + " - " + pers.nombre);
            }
        }
        
    } 
}
