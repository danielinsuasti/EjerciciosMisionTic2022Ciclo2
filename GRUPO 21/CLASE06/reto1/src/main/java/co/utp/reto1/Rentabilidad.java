package co.utp.reto1;

/**
 * Rentabilidad!
 *
 */
public class Rentabilidad 
{
    //Atributos
    //Tiempo en meses
    private int tiempo;

    //Valor del capital
    private double capital;

    //Tasa de interese efectiva mensual del proyecto
    private double intereses;


	//Constructores

    Rentabilidad(){
        tiempo = 0;
        capital = 0;
        intereses = 0;
    }
	//Metodos Generales

    // calcularInteresSimple : Implementar
    public double calcularInteresSimple(){
        double interesSimple = capital * intereses * tiempo;
        return interesSimple;
    }

    // calcularInteresCompuesto: Implementar

    public double calcularInteresCompuesto(){
        double interesCompuesto = capital * (Math.pow((1+intereses), tiempo) - 1);
        return interesCompuesto;
    }

    // compararInversion : Método para comparar la diferencia en el total de 
    // intereses generados para el proyecto.

    public String compararInversion ( int pTiempo, double pCapital, double pInteres ) {

        tiempo = pTiempo;
        capital = pCapital;
        intereses = pInteres;


        double respuesta; 
        /* Cálculo de la diferencia entre tipos de tasas */ 
        respuesta = calcularInteresCompuesto( ) - calcularInteresSimple( ); 
        respuesta = Math.round(respuesta);

        
        
        return "La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" + respuesta; 
    }
    
    
}
