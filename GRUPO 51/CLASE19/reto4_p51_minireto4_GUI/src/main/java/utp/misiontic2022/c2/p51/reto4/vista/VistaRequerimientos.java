package utp.misiontic2022.c2.p51.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p51.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p51.reto4.modelo.vo.Requerimiento_4;


public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento4(){
        try {

            var requerimiento_4s = controlador.consultarRequerimiento4();

            for(Requerimiento_4 registro: requerimiento_4s){
                System.out.printf("%s %s %s %d %d %n", registro.getProveedor(), 
                                        registro.getNombreMaterial(),
                                        registro.getImportado(),
                                        registro.getPrecioUnidad(),
                                        registro.getCantidad()                                
                );
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    
}
