package co.edu.utp.misiontic2022.c2;

import java.awt.Container;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaJTextArea extends JFrame {
    
    public VentanaJTextArea(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        
        JTextArea campoTexto = new JTextArea("Por favor ingresar datos",8,20);
        c.add(new JLabel("Ejemplo de TextArea"));
        c.add(campoTexto);
        
        this.setLocationRelativeTo(null);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaJTextArea();
    }
}
