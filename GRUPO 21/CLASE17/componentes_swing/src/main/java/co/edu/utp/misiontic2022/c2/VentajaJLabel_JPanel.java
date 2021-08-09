package co.edu.utp.misiontic2022.c2;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class VentajaJLabel_JPanel extends JFrame{

    public VentajaJLabel_JPanel(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //
        JPanel p = new JPanel();
        p.add(new JLabel("Ejemplo 1 JPanel"));
        c.add(p);

        this.setLocationRelativeTo(null);
        setSize(300,300);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new VentajaJLabel_JPanel();
    }
    
}
