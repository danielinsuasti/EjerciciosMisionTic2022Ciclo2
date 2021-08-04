package co.edu.utp.misiontic2022.c2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EscrituraLecturaArchivos {

    public static void escrituraArchivo(String archivo) {
        int[][] numeros = { { 1, 2, 3, 4, 5 }, 
                            { 6, 7, 8, 9, 10 }, 
                            { 11, 12, 13, 14, 15 }, 
                            { 16, 17, 18, 19, 20 },
                            { 21, 22, 23, 24, 25 } };
        //var archivo = "Numeros.txt";

        try {
            var salida = new PrintWriter(archivo);
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j < numeros[i].length; j++) {
                    salida.print(numeros[i][j] + ",");
                }
                salida.println("");
            }
            salida.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void lectura(String nombre) {
        //String nombre = "Numeros.txt";
        var archivo = new File(nombre);
        if (archivo.exists()) {
            
            try {
                var lector = new Scanner(archivo);
                System.out.println("Números del archivo");
                while (lector.hasNext()) {
                    var numeros = new StringTokenizer(lector.next(), ",");
                    while (numeros.hasMoreTokens()) {
                        System.out.print(numeros.nextToken() + "\t");
                    }
                    System.out.println("");
                }
                lector.close();

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } else {
            System.out.println("¡El fichero no existe!");
        }
    }

}
