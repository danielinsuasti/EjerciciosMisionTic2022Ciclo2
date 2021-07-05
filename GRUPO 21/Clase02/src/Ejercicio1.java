import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

    //1. Capturar el número de horas Trabajadas.
    System.out.println("Entre el numero de horas trabajadas del empleado");
    Scanner sc = new Scanner(System.in);
    int horasTrabajadas = sc.nextInt();

    //2. Capturar el costo de la hora del trabajador.
    System.out.println("Entre el costo de la hora del trabajador");
    double costoHora = sc.nextDouble();
    sc.close();

    //3. Multiplicar las horas trabajadas por el costo total de la hora.
    double pagoTotal = horasTrabajadas * costoHora;
       
    //4. Mostrar el resultado.
    System.out.println("El pago del empleado es: " + pagoTotal);
        
    }   
    
}
