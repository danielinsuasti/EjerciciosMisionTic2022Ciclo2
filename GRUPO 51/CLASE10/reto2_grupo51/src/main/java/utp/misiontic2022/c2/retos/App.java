package utp.misiontic2022.c2.retos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Electrodomestico electrodomesticos1[]=new Electrodomestico[10];
        electrodomesticos1[0]=new Electrodomestico(200.0, 60, 'C');
        electrodomesticos1[1]=new Nevera(150.0, 30);
        electrodomesticos1[2]=new Estufa(500.0, 80, 'E', 42, false);
        electrodomesticos1[3]=new Electrodomestico();
        electrodomesticos1[4]=new Electrodomestico(600.0, 20, 'D');
        electrodomesticos1[5]=new Nevera(300.0, 40, 'Z', 40);
        electrodomesticos1[6]=new Estufa(250.0, 70);
        electrodomesticos1[7]=new Nevera(400.0, 100, 'A', 15);
        electrodomesticos1[8]=new Estufa(200.0, 60, 'C', 30, true);
        electrodomesticos1[9]=new Electrodomestico(50.0, 10);
        PrecioTotal solucion1 = new PrecioTotal(electrodomesticos1);
        solucion1.mostrarTotales();
        System.out.println();


        
        Electrodomestico electrodomesticos2[]=new Electrodomestico[5];
        electrodomesticos2[0]=new Electrodomestico(300.0, 80, 'C');
        electrodomesticos2[1]=new Nevera(150.0, 20);
        electrodomesticos2[2]=new Estufa(500.0, 80, 'E', 42, false);
        electrodomesticos2[3]=new Electrodomestico();
        electrodomesticos2[4]=new Electrodomestico(600.0, 20, 'D');
        PrecioTotal solucion2 = new PrecioTotal(electrodomesticos2);
        solucion2.mostrarTotales();
        System.out.println();
    }
}
