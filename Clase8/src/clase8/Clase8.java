/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author PcNitro
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Estudiantes> lista = new ArrayList<>();
    
    public static void main(String[] args) {
        //leerDatos();
        //serializarDatos();
        /*for (Estudiantes student: registrosEstudiantes()) {
            System.out.println(student.getCarnet() + " - " + student.getNombre());
        }*/
        Ventana vent = new Ventana();
        vent.setVisible(true);
    }
    
    public static ArrayList<Estudiantes> registrosEstudiantes() {
        ArrayList<Estudiantes> lista_estudiantes = new ArrayList<>();
        
        try {
            FileInputStream fileInput = new FileInputStream("src/clase8/archivo.bin");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            lista_estudiantes = (ArrayList<Estudiantes>) objectInput.readObject();
            
        } catch (IOException e) {
            
        } catch (ClassNotFoundException e) {
            
        }
        return lista_estudiantes;
    }
    
    public static void serializarDatos() {
        
        try {
            FileOutputStream fileStream = new FileOutputStream("src/clase8/archivo.bin");
            ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
            objectStream.writeObject(lista);
            objectStream.close();
            fileStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void leerDatos() { 
        try {
            File archivo = null;
            FileReader fileR = null;
            BufferedReader bufferRead = null;

            archivo = new File("src/clase8/archivo.csv");
            fileR = new FileReader(archivo);
            bufferRead = new BufferedReader(fileR);

            String linea;
            boolean flagLinea = true;

            while ((linea = bufferRead.readLine()) != null) {
                if (flagLinea) {
                    flagLinea = false;
                    continue;
                }
                String arreglo[] = linea.split(",");
                //System.out.println(arreglo[0] + " - " + arreglo[1]);
                lista.add(new Estudiantes(Integer.parseInt(arreglo[0]), arreglo[1]));
            }  
        }  catch (IOException e) {
            
        }
        //System.out.println("Lista de carnets");
        /*for (Estudiantes student: lista) {
            System.out.println(student.getCarnet());
        }*/
    }
    
}
