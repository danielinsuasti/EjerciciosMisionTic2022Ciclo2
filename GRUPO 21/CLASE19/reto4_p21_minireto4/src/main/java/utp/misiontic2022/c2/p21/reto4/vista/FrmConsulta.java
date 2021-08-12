package utp.misiontic2022.c2.p21.reto4.vista;

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

import utp.misiontic2022.c2.p21.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p21.reto4.modelo.vo.Requerimiento_4;

public class FrmConsulta extends JFrame{

    private ControladorRequerimientos controlador;

    private JTable tabla; 

    public FrmConsulta(){
        controlador = new ControladorRequerimientos();
        initUI();
        setLocationRelativeTo(null);
    }

    private void initUI(){
        setTitle("Interfaz Reto 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);

        var tbd =new JTabbedPane();
        getContentPane().add(tbd, BorderLayout.CENTER);

        var panel = new JPanel();
        panel.setLayout(new BorderLayout());
        tbd.addTab("Consulta Requerimiento 4", panel);

        var panelEntrada = new JPanel();
        panelEntrada.add(new JLabel("Requerimiento 4 Label"));

        var btnConsulta = new JButton("Consultar");
        btnConsulta.addActionListener(e -> cargarTablaConsulta());
        
        panelEntrada.add(btnConsulta);
        

        panel.add(panelEntrada, BorderLayout.PAGE_START);

        //Tabla
        tabla = new JTable();
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);
    }

    private void cargarTablaConsulta() {
        try {
            var lista = controlador.consultarRequerimiento4();//contiene los datos para cargar las tablas
            var tableModel = new Requerimiento4TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }

    private class Requerimiento4TableModel extends AbstractTableModel{
        private ArrayList<Requerimiento_4> data; //Voy a necesitar la lista de datos

        public void setData(ArrayList<Requerimiento_4> data) {
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {//Agregar nombres a las columnas
            switch (column) {
                case 0:
                    return "Proveedor";
                case 1:
                    return "Nombre Material";
                case 2:
                    return "Importado";
                case 3:
                    return "Precio Unidad";
                case 4:
                    return "Cantidad";                   
                    
            }
            
            return super.getColumnName(column);
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex) {
                case 0:
                    return String.class;
                case 1:
                    return String.class;
                case 2:
                    return String.class;
                case 3:
                    return Integer.class;
                case 4:
                    return Integer.class;                   
                    
            }
            return super.getColumnClass(columnIndex);
        }

        @Override
        public int getRowCount() { // Quiero saber el numero de filas de la consulta
            return data.size();            
        }

        @Override
        public int getColumnCount() { //Quiero saber el numero de columnas
            return 5;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            var registros = data.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return registros.getProveedor();
                case 1:
                    return registros.getNombreMaterial();
                case 2:
                    return registros.getImportado();
                case 3:
                    return registros.getPrecioUnidad();
                case 4:
                    return registros.getCantidad();                   
                    
            }

            return null;
        }
        
    }


    
}
