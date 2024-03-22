/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploclase1;

import java.util.*;

/**
 *
 * @author PcNitro
 */
public class EjemploClase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Hola Mundo");
        
        //Esta variable es para numeros enteros
        int numero = 10;
        System.out.println(numero);
        
        //Esta variable es para cadenas de texto
        String nombre = "Hola Mundo";
        System.out.println(nombre);
        
        //Variable de tipo char
        char caracter = '4';
        System.out.println(caracter);
        
        //Variable de tipo double
        double numero2 = 12.5;
        System.out.println(numero2);
        
        //Variable de tipo float
        float numero3 = 12.5f;
        System.out.println(numero3);
        
        //Variable de tipo boolean | true false
        boolean verdadero = true;
        boolean falso = false;
        
        System.out.println("El valor verdadero es: " + String.valueOf(verdadero));
        System.out.println("El valor falso es: " + String.valueOf(falso));
        */
        
        /*//Operadores aritmeticos
        int suma = 1 + 5;
        System.out.println("La suma es: " + suma);
        
        int resta = 5 - 1;
        System.out.println("La resta es: " + resta);
        
        int multiplicacion = 2 * 2;
        System.out.println("La multiplicacion es: " + multiplicacion);
        
        int division = 4 / 2;
        System.out.println("La division es: " + division);
        
        int modulo = 4 % 3;
        System.out.println("El residuo es: " + modulo);*/
        
        /*
        //Operadores relacionales
        boolean igualacion = 1 == 2;        //true
        System.out.println("El valor de igualacion es: " + String.valueOf(igualacion));
        
        boolean mayor = 2 > 1;      //true
        System.out.println("2 > 1: " + String.valueOf(mayor));
        
        boolean menor = 5 < 10;     //true
        System.out.println("5 < 10 = " + String.valueOf(menor));
        
        boolean mayor_o_igual = 4 >= 2;     //true
        System.out.println("1 >= 2 = " + String.valueOf(mayor_o_igual));
        
        boolean menor_o_igual = 1 <= 2;     //true
        System.out.println("1 <= 2 = " + String.valueOf(menor_o_igual));
        
        boolean diferente = 100 != 1;         //false
        System.out.println("1 != 1 = " + String.valueOf(diferente));

*/
        //Operadores lógicos
        
        //Operador AND
        //Las dos expresiones a comparar tiene que verdaderas para retornar un valor true
        /*boolean operador_and = true && true && true && true;        //true
        System.out.println("true && true = " + String.valueOf(operador_and));*/
        
        //Operador OR
        //Una de las expresiones debe ser verdadera para que se cumpla la condición
        /*boolean operador_or = true || false || false;                         //true
        System.out.println("true || false || false = " + String.valueOf(operador_or));*/
        
        
        //Operador NOT
        //Invertir una expresión boolean
        /*boolean operador_not = !false;
        System.out.println("!false = " + String.valueOf(operador_not));*/
        
        Scanner scan = new Scanner(System.in);
        /*System.out.println("Ingrese su nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Su nombre es: " + nombre);
        
        System.out.println("Ingrese un numero: ");
        int numero10 = scan.nextInt();
        System.out.println("El numero ingresado es: " + numero10);
        

        
        System.out.println("Ingrese un numero double: ");
        double numero_double = scan.nextDouble();
        System.out.println("El número double es: " + numero_double);
        
        System.out.println("Ingrese un numero float: ");
        float numero_float = scan.nextFloat();
        System.out.println("El numero es: " + numero_float);*/
        
        /*//If else
        if (false || true) {   //true
            
            int numero90 = 12;
            System.out.println("Correcto el if");
            
        } else {
            System.out.println("Funciona en else");
        }*/
        
        //Estructura de control switch
        /*
        String numero_switch = "2";
        
        switch (numero_switch) {
            case "1": {
                System.out.println("Caso 1");
                break;
            }
            case "2": {
                System.out.println("Caso 2");
                break;
            }
            default: {
                System.out.println("No conicido ningun caso");
                break;
            }
        }*/
        /*
        int n1 = 1;
        System.out.println("n1: " + n1);
        n1 = 2;
        System.out.println("n1: " + n1);
        
        int m = 1;             //valor m=1
        m++;                   //m = m + 1  -> m = 1 + 1 -> m = 2
        System.out.println("m: " + m);
        m++;
        System.out.println("m: " + m);
        */
        
        /*
            while (CONDICION) {
                //instrucciones
                //incremento o decremento
            }
        */
        
        int numero = 1;
        
        while (numero < 5) {
            System.out.println(numero);
            numero++;
        }
    }
    
}

