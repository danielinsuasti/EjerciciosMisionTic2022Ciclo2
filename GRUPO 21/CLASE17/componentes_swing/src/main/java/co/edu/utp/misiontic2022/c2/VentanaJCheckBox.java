package co.edu.utp.misiontic2022.c2;

import java.awt.Container;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class VentanaJCheckBox extends JFrame{

    public VentanaJCheckBox(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        JCheckBox cb = new JCheckBox("Pizarra");
        cb.setFont(new Font("Arial", Font.PLAIN, 20));
        c.add(cb);

        //
                
        this.setLocationRelativeTo(null);
        setSize(400 ,300);
        setVisible(true); 
    }

    public static void main(String[] args) {
        new VentanaJCheckBox();
    }
    
}
