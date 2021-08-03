package co.edu.utp.misiontic2022.c2;

import java.io.IOException;

public class EntradaSalidaEstandar1 {

    public static void ejecutar() {

        int numBytes = 0;
        char caracter;
        String saludo = "hola";
        System.out.println("\nEscribe el texto: ");
        try {
            do {
                caracter = (char) System.in.read();
                System.out.print(caracter);
                numBytes++;
            } while (caracter != '\n');//  \r\n
            System.err.printf("%d bytes leidos  %s %n", numBytes, saludo);
        } catch (IOException e) {
            System.err.println(e);
        }

    }

}
