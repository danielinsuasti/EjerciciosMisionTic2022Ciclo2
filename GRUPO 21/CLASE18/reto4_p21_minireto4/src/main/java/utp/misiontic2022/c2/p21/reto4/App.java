package utp.misiontic2022.c2.p21.reto4;

import utp.misiontic2022.c2.p21.reto4.vista.FrmConsulta;
import utp.misiontic2022.c2.p21.reto4.vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App 
{
    public static void main( String[] args )
    {   
        //Interfaz Consola
        //System.out.println("Requerimiento 4");
        //VistaRequerimientos.requerimiento4(); 
        
        //Interfaz Grafica
        var vista = new FrmConsulta();
        vista.setVisible(true);
    }
}
