package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {
    //ALGORITMO : Numero de la suerte
    //1. Solicita la fecha nacimiento en formator String
    //2. Extraer las porciones que hacen referencia al día, mes y año(split)
    //3. Cada porcion convertirla en un valor numerico
    //4. Sumar los pedazos y almacenarlos
    //5. De la sumatoria extraer las cifras
    //6. Sumar las cifras y retornar, numeroDeLaSuerte

    //Generar el codigo Java!!

    //INTERACCION
    public static void saludo(){
        System.out.println("APLICACION NUMERO DE LA SUERTE");
    }

    public static String leerFecha(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar la fecha DD/MM/AAAA: ");
        String fecha = sc.nextLine();
        sc.close();
        return fecha;
    }

    public static void reportarNumerSuerte(int numeroSuerte){
        System.out.println("El numero de la suerte es: " + numeroSuerte);
    }

    //LOGICA

    public static int obtenerNumeroSuerte(String fecha){
        //Variable que contiene resultado numero de la suerte
        int numeroSuerte = 0;

        
        //12/12/1992
        //["12","12","1992"]
        //2. Extraer las porciones que hacen referencia al día, mes y año(split)
        String [] arregloFecha = fecha.split("/",3);


        //3. Cada porcion convertirla en un valor numerico
        //Variables para las versiones numericas de las partes del año
        int datoDia = Integer.parseInt(arregloFecha[0]);
        int datoMes = Integer.parseInt(arregloFecha[1]);
        int datoAnio = Integer.parseInt(arregloFecha[2]);


        //Salida de prueba
        /*
        System.out.println(datoDia);
        System.out.println(datoMes);
        System.out.println(datoAnio);
        */

        //4. Sumar los pedazos y almacenarlos
        int sumaPartesFecha = datoDia + datoMes + datoAnio;

        //Convertir a String sumaPartesFecha
        String sumaPartesFechaCadena = Integer.toString(sumaPartesFecha);


        //5. De la sumatoria extraer las cifras y //6. Sumar las cifras y retornar, numeroDeLaSuerte
        for(int i = 0; i < sumaPartesFechaCadena.length(); i++){
            numeroSuerte = numeroSuerte + Character.getNumericValue(sumaPartesFechaCadena.charAt(i));
        }
        return numeroSuerte;

    }



    public static void main(String[] args) {
        saludo();

        reportarNumerSuerte(obtenerNumeroSuerte(leerFecha()));
        /*
        String fecha = leerFecha();
        System.out.println(obtenerNumeroSuerte(fecha));
        */
    }
}
