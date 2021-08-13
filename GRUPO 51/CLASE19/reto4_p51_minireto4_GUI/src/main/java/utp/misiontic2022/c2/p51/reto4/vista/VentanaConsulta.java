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

import utp.misiontic2022.c2.p51.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p51.reto4.modelo.vo.Requerimiento_4;

public class VentanaConsulta extends JFrame {
    
    private ControladorRequerimientos controlador;
    private JTable tabla;

    public VentanaConsulta(){
        controlador = new ControladorRequerimientos();
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
        btnConsulta.addActionListener(e -> cargarTablaConsulta()); //Paso evento a la accion del boton
        
        panelEntrada.add(btnConsulta);
        
        panel.add(panelEntrada, BorderLayout.PAGE_START);


        //TABLA
        tabla = new JTable();
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);


    }

    private void cargarTablaConsulta() {
        
        try {
            var lista = controlador.consultarRequerimiento4();
            var tableModel = new Requerimiento4TableModel();

            tableModel.setData(lista);
            tabla.setModel(tableModel);
            
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }


    private class Requerimiento4TableModel extends AbstractTableModel{

        private ArrayList<Requerimiento_4> data;

        public void setData(ArrayList<Requerimiento_4> data) {
            this.data = data;
        }



        @Override
        public String getColumnName(int column) {
            switch(column){
                case 0:
                    return "Proveedor";
                case 1:
                    return "Nombre Material";
                case 2:
                    return "Importado";
                case 3:
                    return "Precio x Unidad";
                case 4:
                    return "Cantidad";
                
            }
            
            return super.getColumnName(column);
        }


        @Override
        public Class<?> getColumnClass(int columnIndex) {
            switch(columnIndex){
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
        public int getRowCount() {//Quiero el numero de filas
            
            return data.size();
        }

        @Override
        public int getColumnCount() {//Quiero el numero de columnas
            return 5;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            
            var registro = data.get(rowIndex);
            switch(columnIndex){
                case 0:
                    return registro.getProveedor();
                case 1:
                    return registro.getNombreMaterial();
                case 2:
                    return registro.getImportado();
                case 3:
                    return registro.getPrecioUnidad();
                case 4:
                    return registro.getCantidad();
                
            }
            return null;
        }
        
    }
    
}
