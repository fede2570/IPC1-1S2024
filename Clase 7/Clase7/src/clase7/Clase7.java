package clase7;

import javax.swing.JFrame;

/**
 *
 * @author PcNitro
 */
public class Clase7{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame();
                ventana.setSize(600, 400);
        Pelota pelota = new Pelota();
        ventana.add(pelota);

        ventana.setVisible(true);
        /*Hilo1 hilo = new Hilo1();
        hilo.start();*/
    }
    
}
