package co.edu.utp.misiontic2022.c2;

import java.util.Scanner;

public class Ejercicio1 {

    //ALGORITMO : Numero de la suerte
    //1. Solicita la fecha nacimiento en formato String
    //2. Extraer las porciones que hacen referencia al día, mes y año(split)
    //3. Cada porcion convertarla en un valor numerico
    //4. Sumar los pedazos y almacenarlos
    //5. De la sumatoria extraer las cifras
    //6. Sumar las cifras y retornar, numeroDeLaSuerte

    //Generar el codigo Java!!

    //Vista / Interaccion
    public static void saludo(){
        System.out.println("Hola - APP Numero de la suerte");    
    }

    //1. Solicita la fecha nacimiento en formato String
    public static String leerFecha(){
        System.out.println("Ingresar la fecha DD/MM/AAAA :");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        sc.close();
        return fecha;       
    }

    public static void reportarNumerSuerte(int numeroSuerte){
        System.out.println("El numero de la suerte es: " + numeroSuerte);
    }

    //2. Extraer las porciones que hacen referencia al día, mes y año(split)
    public static int obtenerNumerosSuerte(String fecha){
        //variable que almacena el resultado
        int numeroSuerte =0;

        //12/12/1992
        //["12","12","1992"]
        //2. Extraer las porciones que hacen referencia al día, mes y año(split)
        String [] arregloFecha = fecha.split("/",3);

        //3. Cada porcion convertirla en un valor numerico
        //Variables para las versiones numericas
        int valorDia = Integer.parseInt(arregloFecha[0]);
        int valorMes = Integer.parseInt(arregloFecha[1]);
        int valorAnio = Integer.parseInt(arregloFecha[2]);


        //Salida de prueba
        /*
        System.out.println(valorDia);
        System.out.println(valorMes);
        System.out.println(valorAnio);
        */

        //4. Sumar los pedazos y almacenarlos
        int sumaPartesFecha = valorDia + valorMes + valorAnio;

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
        reportarNumerSuerte(obtenerNumerosSuerte(leerFecha()));
        /*
        String fecha = leerFecha();
        System.out.println(obtenerNumeroSuerte(fecha));
        */
        
    }
    
}
