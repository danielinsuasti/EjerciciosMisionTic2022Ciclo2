package co.edu.utp.misiontic2022.c2;


import javax.swing.*; 
import javax.swing.event.*;
import java.awt.*;
public class VentanaJButtonGroup extends JFrame {

    public VentanaJButtonGroup() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
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
        new VentanaJButtonGroup();
        }
    
}
