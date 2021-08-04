package co.edu.utp.misiontic2022.c2;

import java.io.IOException;

public class EntradaSalidaEstandar1 {
    public static void ejecutar() {
        int numBytes = 0;
        char caracter;
        System.out.println("\nEscribe el texto: ");
        try {
            do {
                caracter = (char) System.in.read();
                System.out.print(caracter);
                numBytes++;
            } while (caracter != '\n'); // \n\r
            System.err.printf("%d bytes leidos %n", numBytes);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
