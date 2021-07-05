import java.util.Scanner;

public class Ejercicio4 {

    /*EJERICICIO 4- IF ANIDADOS
    Para aplicar a un préstamo, una persona debe ganar al menos 30.000 dólares al año,
    y haber estado trabajando en el trabajo actual por al menos dos años.

    NESTED IF STATEMENTS
    To qualify for a loan, a person must make at least 30.000 dollars per year
    and have been working at the current job for at least 2 years.
    **/
    public static void main(String[] args) {
        //Inicializar las variables que conocemos
        int salarioRequerido = 30000;
        int añosRequeridosEmpleo = 2;


        //Capturar los valores desconocidos
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el salario: ");
        double salario = sc.nextDouble();

        System.out.println("Ingrese los años que ha estado en su trabajo actual");
        double años = sc.nextDouble();

        sc.close();

        if(salario >= salarioRequerido){
            if(años > añosRequeridosEmpleo){
                System.out.println("Felicitaciones, su prestamo a sido aprobado");                
            }else{
                System.out.println("El tiempo trabajado no es el suficiente :(");
            }
        }else{
            System.out.println("Lo sentimos su salario debe ser de al menos " + salarioRequerido + " :/" );
        }       
        
    }
    
}
