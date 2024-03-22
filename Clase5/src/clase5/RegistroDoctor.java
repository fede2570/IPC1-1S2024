/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author PcNitro
 */
public class RegistroDoctor extends JFrame implements ActionListener {
    
    JPanel panel = new JPanel();                //Contenedor
    //Etiquetas para mostrar texto
    JLabel lbnombre = new JLabel("Nombres");      //Componente para mostrar texto
    JLabel lbapellidos = new JLabel("Apellidos");
    JLabel lbedad = new JLabel("Edad");
    JLabel lbgenero = new JLabel("Genero");
    JLabel lbpassword = new JLabel("Contraseña"); 
    //Cajas de texto
    JTextField txtnombre = new JTextField();
    JTextField txtapellidos = new JTextField();
    JPasswordField txtpassword = new JPasswordField();
    JTextField txtedad = new JTextField();
    
    String []arr_genero = {"M", "F"};
    JComboBox cbgenero = new JComboBox(arr_genero);
    
    JButton btnregistro = new JButton("Registrarse");
    
    public RegistroDoctor() {
        this.setSize(400, 500);
        this.setLocationRelativeTo(this);   //Centra la ventana
        this.setTitle("Registro Doctor");
        this.setResizable(false);           //Desactiva el boton maximinar
        this.setContentPane(panel);
        
        panel.setBackground(Color.CYAN);
        panel.setLayout(new FlowLayout());
        panel.setLayout(null);
        panel.setBounds(0, 0, 400, 500);
        
        //Nombres          posx   posy    ancho       altura
        lbnombre.setBounds(30,    100,     120,       30);
        txtnombre.setBounds(150, 100, 150, 30);   //posx + ancho = 30 + 120 = 150
        
        //Apellidos
        lbapellidos.setBounds(30, 140, 120, 30);                 //posy + altura = 100 + 30 = 130
        txtapellidos.setBounds(150, 140, 150, 30);      //100 + 30 = 130 + 10 = 140
        
        //Password
        lbpassword.setBounds(30, 180, 120, 30);                 //140 + 30 = 170 + 10 = 180
        txtpassword.setBounds(150, 180, 150, 30);               //
        
        //Genero
        lbgenero.setBounds(30, 220, 120, 30);           //180 + 30 = 210 + 10 = 220
        cbgenero.setBounds(150, 220, 150, 30);
        
        //Edad
        lbedad.setBounds(30, 260, 120, 30);     //220 + 30 + 10= 260
        txtedad.setBounds(150, 260, 150, 30);
        
        //Btnregistro
        btnregistro.setBounds(150, 300, 150, 30);       //260 + 30 + 10 = 300
        btnregistro.addActionListener(this);
        
        
        panel.add(lbnombre);
        panel.add(lbapellidos);
        panel.add(txtnombre);
        panel.add(txtapellidos);
        panel.add(lbpassword);
        panel.add(txtpassword);
        panel.add(cbgenero);
        panel.add(lbgenero);
        panel.add(lbedad);
        panel.add(txtedad);
        panel.add(btnregistro);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnregistro) {
            //JOptionPane.showMessageDialog(null, "Hola");
            String nombre = txtnombre.getText();
            String apellidos = txtapellidos.getText();
            String password = txtpassword.getText();
            String edad = txtedad.getText();
            String genero = (String) cbgenero.getSelectedItem();
            
            System.out.println(nombre);
            System.out.println(apellidos);
            System.out.println(password);
            System.out.println(edad);
            System.out.println(nombre);
            System.out.println(genero);
            
        }
    }
    
}
