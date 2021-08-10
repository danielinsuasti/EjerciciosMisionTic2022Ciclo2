package co.edu.utp.misiontic2022.c2;

import java.awt.Container;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaJTextField extends JFrame {
    
    public VentanaJTextField(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        
        JTextField campoTexto = new JTextField(20);
        c.add(new JLabel("Ejemplo de TextField"));
        c.add(campoTexto);
        
        this.setLocationRelativeTo(null);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaJTextField();
    }
}
