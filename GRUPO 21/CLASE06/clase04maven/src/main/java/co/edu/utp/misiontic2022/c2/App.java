package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Probar el comportamiento de Materia

        Materia materia = new Materia(35, 65, 70, 60, 50);
        materia.calcularPromedioAjustado();

        materia.calcularPromedio();


        //Revisamos como quedo la materia despues del proceso:
        materia.mostrarMateria();



        // //Probar el comportamiento de Nota

        // Nota notaVacia = new Nota();
        // notaVacia.mostrarNotasConsola();
        // // System.out.println("Nota Vacia");
        // // System.out.println("Valor Escala 5 -> " +notaVacia.getEscala5());
        // // System.out.println("Valor Escala 100 -> " +notaVacia.getEscala100());
        // // System.out.println("Valor Escala Cualitativa -> " +notaVacia.getCualitativa());

        // Nota notaEscala100 = new Nota(80);
        // notaEscala100.mostrarNotasConsola();
        // // System.out.println("Nota Escala 100");
        // // System.out.println("Valor Escala 5 -> " +notaEscala100.getEscala5());
        // // System.out.println("Valor Escala 100 -> " +notaEscala100.getEscala100());
        // // System.out.println("Valor Escala Cualitativa -> " +notaEscala100.getCualitativa());

        // Nota notaEscala5 = new Nota(4.3);
        // notaEscala5.mostrarNotasConsola();
        // // System.out.println("Nota Escala 5");
        // // System.out.println("Valor Escala 5 -> " +notaEscala5.getEscala5());
        // // System.out.println("Valor Escala 100 -> " +notaEscala5.getEscala100());
        // // System.out.println("Valor Escala Cualitativa -> " +notaEscala5.getCualitativa());

        // Nota notaTodos = new Nota(5,100,"Aprobado");
        // notaTodos.mostrarNotasConsola();
        // // System.out.println("Nota Todos los argumentos");
        // // System.out.println("Valor Escala 5 -> " +notaTodos.getEscala5());
        // // System.out.println("Valor Escala 100 -> " +notaTodos.getEscala100());
        // // System.out.println("Valor Escala Cualitativa -> " +notaTodos.getCualitativa());

    }
}
