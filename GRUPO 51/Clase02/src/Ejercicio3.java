import java.util.Scanner;

public class Ejercicio3 {
    /*  Todos los vendedores reciben un pago de $1000 dolares a la semana, los vendedores 
        que excedan las 10 ventas recibirán un pago adicional de $250 */
    
    /*
    IF STATEMENT
        All sales people get a payment of $1000 dollars a week, sales people who exceed 10 sales
        get an additional bonus of $250.
    */

    public static void main(String args[]){
        //Inicializar las variables
        int salario = 1000;
        int pagoAdicional = 250;
        int ventasAdicional = 10;

        //Tomar los valores desconocidos
        System.out.println("Cuales fueron las ventas de la semana?");
        var capturador = new Scanner(System.in); //Scanner capturador = new Scanner(System.in);
        var ventas = capturador.nextInt();
        
        capturador.close();
        // un camino logico diferente para los que se ganaron el bono
        if(ventas > ventasAdicional){
            salario = salario + pagoAdicional;
        }
        //Imprimir la salida

        System.out.println("El salario final en la semana es "+ salario);

    }

    
}
