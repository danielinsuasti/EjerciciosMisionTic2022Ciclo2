package utp.misiontic2022.c2.p51.reto4.vista;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class VentanaConsulta extends JFrame {

    private JTable tabla;

    public VentanaConsulta(){

        initUI();
        setLocationRelativeTo(null);
    }

    private void initUI(){
        setTitle("Interfaz Minireto5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);

        var tbd = new JTabbedPane();
        getContentPane().add(tbd, BorderLayout.CENTER);

        var panel = new JPanel();
        panel.setLayout(new BorderLayout());
        tbd.addTab("Consulta Requerimiento 4", panel);

        var panelEntrada = new JPanel();
        panelEntrada.add(new JLabel("Minireto 4 Label"));
        var btnConsulta = new JButton("Consultar");
        panelEntrada.add(btnConsulta);

        panel.add(panelEntrada, BorderLayout.PAGE_START);


        //TABLA
        tabla = new JTable();
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);


    }
    
}
