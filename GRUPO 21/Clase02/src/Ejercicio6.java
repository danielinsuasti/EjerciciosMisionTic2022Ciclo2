import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        boolean again = false;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Ingrese el primer numero:");
            double Number1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo numero:");
            double Number2 = scanner.nextDouble();

            double result = Number1 + Number2;
            System.out.println("El resultado de la suma es: " + result);

            System.out.println("¿ Le gustaría hacer otra suma ?, \'true\' or \'false\'");
            again = scanner.nextBoolean();


        }while(again);
    scanner.close();
    }
    
}
