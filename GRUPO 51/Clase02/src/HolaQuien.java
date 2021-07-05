import java.util.Scanner;

public class HolaQuien {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nombre = captura.nextLine();
        System.out.println("Hola "+nombre);

        captura.close();

    }
        
}
