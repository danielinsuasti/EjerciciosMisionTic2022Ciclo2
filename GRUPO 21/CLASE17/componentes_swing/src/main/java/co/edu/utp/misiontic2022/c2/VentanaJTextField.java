package co.edu.utp.misiontic2022.c2;

import java.awt.Container;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaJTextField extends JFrame{

    public VentanaJTextField(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        JTextField campoTexto = new JTextField(30);
        c.add(new JLabel("Esto es un campo de Texto"));
        c.add(campoTexto);
        
        this.setLocationRelativeTo(null);
        setSize(400 ,300);
        setVisible(true); 
    }

    public static void main(String[] args) {
        new VentanaJTextField();
    }
    
}
