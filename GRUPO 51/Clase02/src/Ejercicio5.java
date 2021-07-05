import java.util.Scanner;

public class Ejercicio5 {
    /*
    EJERICICIO5 – SWITCH CASE	
    Haga que un usuario ingrese una calificación y, utilizando una declaración SWITCH, 
    imprima un mensaje para informarle como le fue al estudiante*/
    /*
    SWITCH STATEMENT
    Have a user enter a grade, and using a switch statement,
    print out a message letting  them know how they did
     */
    public static void main(String[] args) {
        //Capturar la nota
        System.out.println("Ingrese la nota: ");
        Scanner captura = new Scanner(System.in);
        String nota = captura.next();

        String mensaje = "";

        switch(nota){
            case "E":
                mensaje = "Excelente Trabajo!! la mejor nota";
                break;
            case "S":
                mensaje = "Sobresaliente, buena nota!";
                break;
            case "R":
                mensaje = "Regular, la proxima sera mejor!";
                break;
            case "I":
                mensaje = "Insuficiente, revisa de nuevo!";
                break;
        }
        captura.close();

        System.out.println(mensaje);

    }


    
}
