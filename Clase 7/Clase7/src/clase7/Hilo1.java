/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author PcNitro
 */
public class Hilo1 extends Thread{
    
    private static int contador;
    
    @Override
    public void run() {
        while (true) {
            System.out.println("Tiempo: " + contador);
            contador++;
            try {
                Thread.sleep(2000);
            } catch(InterruptedException e) {
                
            }
        }
    }
    
}
