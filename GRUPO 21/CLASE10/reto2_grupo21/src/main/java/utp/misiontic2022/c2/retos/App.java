package utp.misiontic2022.c2.retos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Computador computadores2[]=new Computador[5];
        computadores2[0]=new Computador(300.0, 80, 'C');
        computadores2[1]=new ComputadorGamer(150.0, 20);
        computadores2[2]=new ComputadorDataScience(500.0, 80, 'E', 42, false);
        computadores2[3]=new Computador();
        computadores2[4]=new Computador(600.0, 20, 'D');
        PrecioTotal solucion2 = new PrecioTotal(computadores2);
        solucion2.mostrarTotales();
        System.out.println();
    }
}
