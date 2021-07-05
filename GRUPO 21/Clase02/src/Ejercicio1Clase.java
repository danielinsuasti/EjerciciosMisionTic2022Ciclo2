public class Ejercicio1Clase {
    public static void main(String[] args) {
        var nombre = "Cecilia";
        var resultado = saludo(nombre, 15, 2500);
        System.out.println(resultado);


    }

    //metodo que recibe un String, que devuelve String
    public static String saludo(String nombrePersona, int edad, double salario){
        return "Hola " + nombrePersona + "!" + " salario = "+ salario;
    }

}
