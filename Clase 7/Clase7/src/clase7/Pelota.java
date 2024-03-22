/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author PcNitro
 */
public class Pelota extends JPanel implements Runnable {
    
    private int x = 0;
    private int y = 0;
    private int dx = 1;
    private int dy = 1;

    public Pelota() {
        this.setSize(600, 400);
        Thread hilo = new Thread(this);
        hilo.start();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x, y, 50, 50);
    }
    
    @Override
    public void run() {
        
        while (true) {
            
            x += dx;
            y += dy;
            
            if (x < 0 || x > getWidth() - 50) {
                dx = -dx;
            }
            
            if (y < 0 || y > getHeight() - 50) {
                dy = -dy;
            }
            
            repaint();
            
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                
            }
        }
    }
    
}
