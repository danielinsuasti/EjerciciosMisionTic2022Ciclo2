package co.edu.utp.misiontic2022.c2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EntradaSalidaEstandar3 {

    public static void ejecutar() {

        String línea = null;
        var entrada = new BufferedReader(new InputStreamReader(System.in));
        var salida = new PrintWriter(System.out, true);
        salida.println("\nEscribe el texto: ");
        try {
            línea = entrada.readLine();
        } catch (Exception e) {
            System.err.println(e);
        }
        salida.println("\nLa línea escrita es: ");
        salida.println(línea);
    }

}
