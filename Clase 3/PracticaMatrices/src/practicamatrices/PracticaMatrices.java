/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicamatrices;


import java.util.*;
/**
 *
 * @author PcNitro
 */
public class PracticaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int [][]matriz = new int[8][8];
        String [][]penalizaciones = new String[8][8];
        boolean [][]bool_penalizaciones = new boolean[8][8];
        
        Random random = new Random();
        
        int tamanio = 64;
        int tamanio_columnas = 8;
        
        //               61 62  63 64
        //                        49 50 
        
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 0) {
                for (int j = tamanio_columnas - 1; j >= 0; j--) {
                    //Validacion de penalizaciones aleatorias filas pares
                    if (random.nextBoolean()) {
                        penalizaciones[i][j] = "#";
                        bool_penalizaciones[i][j] = true;
                    } else {
                        penalizaciones[i][j] = " ";
                        bool_penalizaciones[i][j] = false;
                    }
                    matriz[i][j] = tamanio--;
            }
            } else {
                for (int j = 0; j < tamanio_columnas; j++) {
                    //Validacion de penalizaciones aleatorias filas impares
                    if (random.nextBoolean()) {
                        penalizaciones[i][j] = "#";
                        bool_penalizaciones[i][j] = true;
                    } else {
                        penalizaciones[i][j] = " ";
                        bool_penalizaciones[i][j] = false;
                    }
                    matriz[i][j] = tamanio--;
                }
            }
        }

        do {
            System.out.println("1) Jugar");
            System.out.println("2) Salir");
            System.out.print("Ingrese opcion: ");
            
            int opcion = scan.nextInt();
            
            if (opcion == 1) {
                
                while (true) {
                    System.out.println("***************** Tablero ***************************");

                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print("|" + matriz[i][j] + " - " + penalizaciones[i][j] + "\t");
                        }
                        System.out.println("");
                    }
                    
                    System.out.print("Desea pausar o jugar: ");
                    String letra = scan.next();
                    
                    if (letra.equals("d") || letra.equals("D")) {
                        System.out.println("Tirar dado");
                                                //0 - 4
                                                //[2 - 6]
                        int dado_random = random.nextInt(5) + 2;
                        System.out.println("El valor del dado es: " + dado_random);
                        continue;
                    } else {
                        System.out.println("Pausa.....");
                        break;
                    }
                }

            } else if (opcion == 2) {
                System.out.println("Salir......");
                break;
            }
        } while(true);
    }
}
