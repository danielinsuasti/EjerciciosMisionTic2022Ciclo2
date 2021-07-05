import java.util.Scanner;
public class Ejercicio2 {

    /*
        Cree un programa que le pregunte al usuario por una estación del año, 
        luego un número entero y luego un adjetivo. 
        Usa la entrada para completar la oración a continuación. Muestra el resultado.
        En un día {adjetivo} de {estacionDelAño}, yo bebo un mínimo de 
        {numeroEntero} tazas de café 
        */

        public static void main(String[] args) {

            //Preguntar por la estacion del año
            System.out.println("Entre la estacion del año: ");
            Scanner sc= new Scanner(System.in);   //var sc = new Scanner(System.in);
            String estacion = sc.next();          //var estacion = sc.next()

            //Preguntar por el numero entero
            System.out.println("Entre un numero entero: ");            
            int numero = sc.nextInt();
            
            //Preguntar por un adjetivo
            System.out.println("Entre un adjetivo");
            String adjetivo = sc.next();
            sc.close();

            //Completar la oracion e imprimir

            String oracion = "En un día " + adjetivo +" de " + estacion + ", yo bebo un minimo de " + numero + " tazas de café"; 
            
            System.out.println();
            System.out.println(oracion);            
            
        }    
}
