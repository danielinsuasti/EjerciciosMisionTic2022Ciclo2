package utp.misiontic2022.c2.p51.reto4;

import utp.misiontic2022.c2.p51.reto4.vista.VentanaConsulta;
import utp.misiontic2022.c2.p51.reto4.vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{
    public static void main( String[] args )
    {
        //Vista Consola
        //System.out.println("Requerimiento 4");
        //VistaRequerimientos.requerimiento4();

        //Vista Interfaz Grafica
        var vista = new VentanaConsulta();
        vista.setVisible(true);        
    }
}
