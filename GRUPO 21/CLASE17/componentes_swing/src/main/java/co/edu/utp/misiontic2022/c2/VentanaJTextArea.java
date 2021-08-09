package co.edu.utp.misiontic2022.c2;

import java.awt.Container;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaJTextArea extends JFrame{

    public VentanaJTextArea(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        JTextArea areaTexto = new JTextArea(10, 20);
        c.add(new JLabel("Esto es un Area de Texto"));
        c.add(areaTexto);
        
        this.setLocationRelativeTo(null);
        setSize(400 ,300);
        setVisible(true); 
    }

    public static void main(String[] args) {
        new VentanaJTextArea();
    }
    
}
