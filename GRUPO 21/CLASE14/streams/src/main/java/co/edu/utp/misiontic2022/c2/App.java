package co.edu.utp.misiontic2022.c2;

import co.edu.utp.misiontic2022.c2.objeto.ManejadorPersonas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //EntradaSalidaEstandar1.ejecutar();
        //EntradaSalidaEstandar2.ejecutar();
        //EntradaSalidaEstandar3.ejecutar();
        //EscrituraLectura.escribirArchivo();
        //EscrituraLectura.leerArchivo();
        ManejadorPersonas mp = new ManejadorPersonas();
        //mp.guardarPersonas();
        mp.cargarPersonas();
        
    }
}
