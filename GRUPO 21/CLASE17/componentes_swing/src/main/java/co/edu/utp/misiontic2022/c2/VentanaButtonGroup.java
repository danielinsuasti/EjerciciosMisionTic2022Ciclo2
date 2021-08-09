package co.edu.utp.misiontic2022.c2;

import java.awt.Container;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;

public class VentanaButtonGroup extends JFrame {

    public VentanaButtonGroup() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        //
        c.add(new JLabel("Selecciona el tipo de combustible"));
        Font fuente = new Font("Arial", Font.PLAIN, 18);
        JRadioButton gas = new JRadioButton("Gasolina");
        gas.setFont(fuente);
        JRadioButton die = new JRadioButton("Diesel");
        die.setFont(fuente);
        // Agrupamos los botones
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(gas);
        grupo.add(die);
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(0, 1));
        radioPanel.add(gas);
        radioPanel.add(die);
        c.add(radioPanel);
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VentanaButtonGroup();
    }

}
