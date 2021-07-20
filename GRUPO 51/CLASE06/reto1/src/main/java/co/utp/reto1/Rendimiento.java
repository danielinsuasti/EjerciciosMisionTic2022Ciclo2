package co.utp.reto1;

/**
 * Hello world!
 *
 */
public class Rendimiento 
{
    // ----------------------------------------------------------------- 
    // Atributos 
    // ----------------------------------------------------------------- 
    // Tiempo expresado en meses
    private int tiempo;
    // Capital expresado en pesos
    private double capital;
    // Tasa de interes
    private double interes;

    // ----------------------------------------------------------------- 
    // Constructores 
    // ----------------------------------------------------------------- 
    public Rendimiento( ) { 
        //Implementar 
        tiempo = 0;
        capital = 0.0;
        interes =0.0;
    }


    // ----------------------------------------------------------------- 
    // Metodos 
    // ----------------------------------------------------------------- 

    // calcularInteresSimple : Implementar 
    public double calcularInteresSimple(){
        double interesSimple = capital * interes * tiempo;
        return interesSimple;
    }

    // calcularInteresCompuesto: Implementar

    public double calcularInteresCompuesto(){
        double interesCompuesto = capital * (Math.pow((1+interes), tiempo) -1 );
        return interesCompuesto;
    }

    // compararInversion : Método para comparar la diferencia en el total de 
    // intereses generados para el proyecto.

    public String compararInversion ( int pTiempo, double pCapital, double pInteres ) { 

        this.tiempo = pTiempo;
        this.capital = pCapital;
        this.interes = pInteres;

        double respuesta; 
        /* Cálculo de la diferencia entre tipos de tasas */ 
        respuesta = calcularInteresCompuesto( ) - calcularInteresSimple( ); 

        respuesta = Math.round(respuesta);

        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta; 
    }


}
