package co.edu.utp.misiontic2022.c2;

import java.awt.Container;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaImageIcon extends JFrame {

    public VentanaImageIcon(String fich){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        ImageIcon imagen = new ImageIcon(fich);

        c.add(new JLabel("", imagen, JLabel.CENTER));

        setSize(800,800);
        setVisible(true);        
    }

    public static void main(String[] args) {
        new VentanaImageIcon("ImagePanda.jpg");
    }
}
