package co.utp.reto1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rentabilidad solucion1 = new Rentabilidad();
        System.out.println(solucion1.compararInversion(15, 500000, 0.025));

        Rentabilidad solucion2 = new Rentabilidad();
        System.out.println(solucion2.compararInversion(3, 10000, 0.06));
    }
}
