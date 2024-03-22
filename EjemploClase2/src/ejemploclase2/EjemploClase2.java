/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase2;

import java.util.Scanner;

/**
 *
 * @author PcNitro
 */
public class EjemploClase2 {
    
    static Scanner scanner_global = new Scanner(System.in);
    
    //Esta es una funcion
    public static String hola() {
        String cadena = "Es una cadena";
        return cadena;
    }

    public static int calculadora(String operador) {
        System.out.print("Ingrese primer numero: ");
        int numero1 = scanner_global.nextInt();
        System.out.print("Ingrese segundo numero: ");
        int numero2 = scanner_global.nextInt();
        //System.out.println("El valor de la suma es: " + (numero1 + numero2));
        int operacion = 0;
        if (operador == "+") {
            operacion = numero1 + numero2;
        } else if (operador == "-") {
            operacion = numero1 - numero2;
        }
        return operacion;
    }
    
    public static void main(String[] args) {
        
        //Do While
        //While
        Scanner scan = new Scanner(System.in);
        int opcion;
        
        do {
            //instrucciones se van a ejecutar al menos una vez
            System.out.println("Ciclo do while");
            System.out.println("1) Suma");
            System.out.println("2) Resta");
            System.out.println("3) Numeros de 1 al 10 While");
            System.out.println("4) Numeros de 1 al 10 For");
            System.out.println("5) Tabla de multiplicar");
            System.out.println("6) Matrices");
            System.out.println("7) Salir");
            
            System.out.print("Ingrese opción: ");
            opcion = scan.nextInt();
            
            if (opcion == 1) {
                System.out.println("************* Suma *************");
                int suma = calculadora("+");
                System.out.println(suma);
                
            } else if (opcion == 2) {
                int resta = calculadora("-");
                System.out.println(resta);
                
            } else if (opcion == 3) {
                System.out.println("************ Numeros de 1 al 10 *******");
                
                //Primer ciclo 
                //i = 11
                
                int i = 1;                      //variable iteradora
                //i < 11 //11 < 11 //false
                while (i < 11) {                //condicion
                    System.out.println(i);
                    i++;                        //Variable incremental                            //i + 1 = 2     //10 + 1 = 11
                }
                
            } else if (opcion == 4) {
                System.out.println("************ Numeros de 1 al 10 con For*******");
                for(int i = 1; i < 11; i++) {
                    System.out.println(i);
                }
                
            } else if (opcion == 5) {
                System.out.println("*********** Tablas de multiplicar ******************");
                System.out.print("Ingrese numero de tabla: ");
                int numero_tabla = scan.nextInt();
                
                for(int i = 1; i < 11; i++) {
                    System.out.println(i + " x " + numero_tabla + " = " + i*numero_tabla);
                }
                
            } else if (opcion == 6) {
                
                /*int []arreglo = new int[8];
                arreglo[0] = 10;
                System.out.println(arreglo[0]);
                
                for (int i = 0; i < arreglo.length; i++) {
                    System.out.println("Posicion " + i + " " + arreglo[i]);
                }
                System.out.println(arreglo);*/
                int [][]matriz = new int[4][4];
                
                //System.out.println(numeros_random);

                //Ciclo para acceder a filas de matriz
                for (int i = 0; i < matriz.length; i++) {
                    //System.out.print("|" + i + "|");
                    for (int j = 0; j < matriz[i].length; j++) {
                        double numeros_random = Math.random() * 10;
                        matriz[i][j] = (int)numeros_random;
                        System.out.print("|" + matriz[i][j] + "|");
                    }
                    System.out.println("");
                }
                
                System.out.println("\n\nMatriz\n");
                int [][]matriz2 = new int[4][4];
                
                //System.out.println(numeros_random);

                //Ciclo para acceder a filas de matriz
                for (int i = 0; i < matriz2.length; i++) {
                    //System.out.print("|" + i + "|");
                    for (int j = 0; j < matriz2[i].length; j++) {
                        double numeros_random = Math.random() * 10;
                        matriz2[i][j] = (int)numeros_random;
                        System.out.print("|" + matriz2[i][j] + "|");
                    }
                    System.out.println("");
                }
                                             //tam de fila   //tam de columnas
                int [][]suma_matriz = new int[matriz2.length][matriz2[0].length];
                for (int i = 0; i < suma_matriz.length; i++) {
                    for (int j = 0; j < suma_matriz[i].length; j++) {
                        int numero1 = matriz[i][j];
                        int numero2 = matriz2[i][j];
                        suma_matriz[i][j] = numero1 + numero2;
                    }
                }
                
                System.out.println("\n\nSuma de matrices");
                
                for (int i = 0; i < suma_matriz.length; i++) {
                    //System.out.print("|" + i + "|");
                    for (int j = 0; j < suma_matriz[i].length; j++) {
                        System.out.print("|" + suma_matriz[i][j] + "|");
                    }
                    System.out.println("");
                }
                
                
                        
                
                

                
                
            }
            
            else if (opcion == 7) {
                System.out.println("Fin del ciclo....");
                break;
            } 
        } while(true);

    }
    
}
