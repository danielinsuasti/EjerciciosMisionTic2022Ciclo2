package co.edu.utp.misiontic2022.c2;

import co.edu.utp.misiontic2022.c2.objetos.ManejadorPersonas;

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
        //EscrituraLecturaArchivos.escrituraArchivo("NuevoArchivo");
        //EscrituraLecturaArchivos.lectura("NuevoArchivo");
        ManejadorPersonas mp = new ManejadorPersonas();
        //mp.guardarPersona();
        mp.cargarPersona();
    }   
}
