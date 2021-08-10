package co.edu.utp.misiontic2022.c2;

import java.awt.*;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaImageIcon extends JFrame{

    public VentanaImageIcon(String ruta){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        ImageIcon icono = new ImageIcon(ruta);

        JButton boton = new JButton( icono);

        c.add(new JLabel("", icono, JLabel.CENTER));

        c.add(boton);


        //
        setSize(700,700);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new VentanaImageIcon("ImagePanda.jpg");        
    }
}
