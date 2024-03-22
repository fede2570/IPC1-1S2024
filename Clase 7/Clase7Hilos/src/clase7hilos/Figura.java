/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7hilos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author PcNitro
 */
public class Figura extends JPanel implements Runnable {
    
    private int x = 0;
    private int y = 0;
    private int dx = 1;
    
    /*    private Image imgActual;
    private String pathcarro = "src/imagenes/carro.png";
    private String pathcarro2 = "src/imagenes/carro2.png";
    Image imgcarro = new ImageIcon(pathcarro).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);*/

    private Image imgActual;
    private String pathcarro = "src/imagenes/carro.png";
    private String pathcarro2 = "src/imagenes/carro2.png";
    Image imgcarro = new ImageIcon(pathcarro).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    Image imgcarro2 = new ImageIcon(pathcarro2).getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
    
    public Figura() {
        this.setSize(600, 400);
        Thread hilo = new Thread(this);
        hilo.start();
    }
    
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.drawImage(imgActual, x, y, this);
    }
    
    @Override
    public void run() {
        
        try {

            while (true) {


                while (x < getWidth() - 50) {
                    imgActual = imgcarro;
                    Thread.sleep(20);
                    x += dx;
                    repaint();
                }

                while (x > 0) {
                    imgActual = imgcarro2;
                    Thread.sleep(20);
                    x -= dx;
                    repaint();
                }
            }
        } catch (InterruptedException e) {
            
        }


    }
    
}
