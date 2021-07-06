package co.edu.utp.misiontic2022.c2;

public class numeroSuerteOpcion {

    public static int obtenerNumeroSuerte(String fecha){

        int numeroSuerte = 0;

        String[] arregloFecha = fecha.split("/",3);
        int valorDia = Integer.parseInt(arregloFecha[0]);
        int valorMes = Integer.parseInt(arregloFecha[1]);
        int valorAnio = Integer.parseInt(arregloFecha[2]);


        int sumaPartesFecha = valorDia + valorMes + valorAnio;


        while(sumaPartesFecha > 0){
            numeroSuerte += sumaPartesFecha%10;
            sumaPartesFecha= (sumaPartesFecha/10);
        }

        return numeroSuerte;

    }
    
    
    
    
    public static void main(String[] args) {

        System.out.println(obtenerNumeroSuerte("15/01/1995"));
    }
    
}
