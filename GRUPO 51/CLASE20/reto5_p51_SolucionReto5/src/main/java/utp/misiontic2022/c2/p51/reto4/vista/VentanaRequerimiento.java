package utp.misiontic2022.c2.p51.reto4.vista;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;


import utp.misiontic2022.c2.p51.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p51.reto4.modelo.vo.Requerimiento_1;

public class VentanaRequerimiento extends JFrame {

    private ControladorRequerimientos controlador;
    private JTable tabla;


    public VentanaRequerimiento(){
        controlador = new ControladorRequerimientos();

        initUI();
        setLocationRelativeTo(null);
    }
    
    private void initUI(){
        setTitle("Interfaz Reto 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);

        var tbd = new JTabbedPane();

        getContentPane().add(tbd, BorderLayout.CENTER);

        var panel = new JPanel();

        panel.setLayout(new BorderLayout());
        tbd.addTab("Consulta Requerimiento", panel);

        var panelEntrada = new JPanel();
        panelEntrada.add(new JLabel("Requerimiento 1 Label"));

        var btnConsulta = new JButton("Consultar!");

        btnConsulta.addActionListener(e -> cargarTablaConsulta());

        panelEntrada.add(btnConsulta);

        panel.add(panelEntrada, BorderLayout.PAGE_START);

        tabla = new JTable();
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);  

    }

    private void cargarTablaConsulta() {
        try {
            var lista = controlador.consultarRequerimiento1();
            var tableModel = new Requerimiento1TableModel();

            tableModel.setData(lista);

            tabla.setModel(tableModel);    


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
            
        }
        
    }


    private class Requerimiento1TableModel extends AbstractTableModel{
        private ArrayList<Requerimiento_1> data;

        public void setData(ArrayList<Requerimiento_1> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch(column){
                case 0:
                    return "Nombre Material";
                case 1:
                    return "Precio por Unidad";
            }
            return super.getColumnName(column);
        }

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return 2;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            var registro = data.get(rowIndex);

            switch(columnIndex){
                case 0:
                    return registro.getNombreMaterial();
                case 1:
                    return registro.getPrecioUnidad();
            }
            return null;
        }

    }
}
