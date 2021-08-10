package co.edu.utp.misiontic2022.c2;

import java.awt.Container;
import java.util.concurrent.Flow;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaJLabel_JPanel extends JFrame{

    public VentanaJLabel_JPanel(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        JPanel p = new JPanel();
        p.add(new JLabel("Ejemplo de JPanel"));

        c.add(p);
        this.setLocationRelativeTo(null);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaJLabel_JPanel();
    }
    
}
