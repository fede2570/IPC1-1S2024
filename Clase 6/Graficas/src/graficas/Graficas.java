/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graficas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author PcNitro
 */
public class Graficas extends JFrame{

    /**
     * @param args the command line arguments
     */
     public static DefaultCategoryDataset dataset;
     public static File BarChart;
     public static JFreeChart barChart;
     public static ChartPanel barPanel;
     
     
    static JPanel panel = new JPanel();
    int numeros[] = {1, 3, 4, 5, 6, 7};
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Graficas grafica = new Graficas();
        grafica.setVisible(true);
    }
    
        public Graficas() {
        this.setSize(1000, 700);
        this.setLocationRelativeTo(this);   //Centra la ventana
        this.setTitle("Registro Doctor");
        this.setContentPane(panel);
        printArray(numeros);

    }
    
    
    
    public static void printArray(int arreglo[]) {
        
        dataset = new DefaultCategoryDataset();
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            dataset.addValue(arreglo[i], "Nombre" + arreglo[i], "Nombre" + arreglo);
        }
        
        barChart=ChartFactory.createBarChart("Grafica", "Nombres","Cantidad",dataset, PlotOrientation.VERTICAL, true,true,true);
        barPanel=new ChartPanel(barChart);
        
        panel.setLayout(new BorderLayout());
        panel.add(barPanel);
        panel.validate();
        
        
    }
    
}
