package claseextra;


import java.util.*;
/**
 *
 * @author PcNitro
 */
public class ClaseExtra {

    /**
     * @param args the command line arguments
     */
    //Variables globales
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static int [][]matriz = new int[8][8];
    static String [][]penalizaciones = new String[8][8];
    static boolean [][]bool_penalizaciones = new boolean[8][8];
    static String jugador = "@";
    static int posicionJugador = 1;

    static void llenadoMatriz() {
        
        int tamanio_matriz = 64;
        
        for (int i = 0; i < matriz.length; i++) {
            
            if (i % 2 == 0) {           //compara filas para verificar filas pares
                                        //si son carnets impares usen i % 2 != 0
                                        //si son carnets pares usen i % 2 == 0
                                        
                //Posiciones de columnas empieza desde 7,6,5,4,3,2,1,0                        
                for (int j = 7; j >= 0; j--)    {       
                    if (random.nextBoolean()) {
                        penalizaciones[i][j] = "#";
                        bool_penalizaciones[i][j] = true;
                    } else {
                        penalizaciones[i][j] = " ";
                        bool_penalizaciones[i][j] = false;
                    }
                    matriz[i][j] = tamanio_matriz--;
                }
            } else {                        //filas impares
                for (int j = 0; j < 8; j++) {       //Posiciones de columnas desde 0,1,2,3,4,5,6,7
                    if (random.nextBoolean()) {
                        penalizaciones[i][j] = "#";
                        bool_penalizaciones[i][j] = true;
                    } else {
                        penalizaciones[i][j] = " ";
                        bool_penalizaciones[i][j] = false;
                    }
                    matriz[i][j] = tamanio_matriz--;
                }
            }
        }
        posicionJugador = 1;
    }
    
    static void imprimirTablero() {
        for (int i = 0; i < matriz.length; i++) {
            //7,6,5,4,3,2,1,0
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == posicionJugador) {
                    System.out.print("|" + matriz[i][j] + " - " + jugador + "\t");
                } else {
                    System.out.print("|" + matriz[i][j] + " - " + penalizaciones[i][j] + "\t");
                }
            }
            System.out.println("");
        }
    }
    
    static void jugar() {
        //etiqueta juego_perdido para salirme del ciclo y terminar el juego
        juego_perdido: while (true) {
            imprimirTablero();
            System.out.println("Tirar dado");
            System.out.print("Ingrese numero: ");
            
            int valorDado = scan.nextInt();     //si dado es igual a 3
                                                //se suma 3 a posicionJugador
            //int dado_random = random.nextInt(5) + 2;      //variable para dado [2, 6]
            posicionJugador += valorDado;

            if (posicionJugador > 64) {
                System.out.println("Ganaste felicidades...");
                posicionJugador = 64;
            }
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == posicionJugador) {
                        if (bool_penalizaciones[i][j] == true) {
                            //posicionJugador 
                            //operaciones faciles
                            //operaciones intermedias
                            //operaciones dificiles
                            //aqui deben de validar esas operaciones 
                            System.out.println("Penalización en posicion");
                            
                            int suma = 2 + 2;
                            System.out.println("Ingrese el valor a comparar: ");
                            int valor_ingresado = scan.nextInt();
                            
                            if (suma == valor_ingresado) {
                                System.out.println("Correcto");
                            } else {
                                System.out.println("Operacion mala");
                                System.out.println("Game Over....");
                                llenadoMatriz();
                                break juego_perdido;            //Salir de ciclo
                            }
                        }
                    }
                }
            }
            
            System.out.println("Desea tirar el dado (d) o pausar (p)");
            String letra = scan.next();
            if (letra.equals("d")) {
                
            } else {
                break;
            }
        } 
    }
    
    public static void main(String[] args) {
        
        do {
            System.out.println("1) Nuevo Juego");
            System.out.println("2) Cargar Juego");
            System.out.println("3) Salir");
            System.out.print("Ingrese opcion: ");
            
            int opcion = scan.nextInt();
            
            if (opcion == 1) {
                llenadoMatriz();
                jugar();
            } else if (opcion == 2) {
                jugar();
            } else if (opcion == 3) {
                System.out.println("Salir......");
                break;
            }
        } while(true);
    }
}