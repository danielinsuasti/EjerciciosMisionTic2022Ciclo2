package utp.misiontic2022.c2.retos;



// Inicio de la solución
public class PrecioTotal {
    // Atributos
    private Double totalComputadores = 0.0;
    private Double totalComputadoresDataScience = 0.0;
    private Double totalComputadoresGamer = 0.0;
    private Computador[] listaComputadores;

    // Constructor
    PrecioTotal(Computador[] pComputadores) {
        this.listaComputadores = pComputadores;
    }

    //Metodos
    public void mostrarTotales() {
        // Código
        for(int i =0; i < listaComputadores.length; i++){
            if(listaComputadores[i] instanceof Computador){
                totalComputadores += listaComputadores[i].calcularPrecio();
            }

            if(listaComputadores[i] instanceof ComputadorGamer){
                totalComputadoresGamer += listaComputadores[i].calcularPrecio();
            }

            if(listaComputadores[i] instanceof ComputadorDataScience){
                totalComputadoresDataScience += listaComputadores[i].calcularPrecio();
            }
            

        }


        // Mostramos los resultados
        System.out.println("La suma del precio de los Computadores es de " + totalComputadores);
        System.out.println("La suma del precio de las Computadores Gamer es de " + totalComputadoresGamer);
        System.out.print("La suma del precio de las Computadores Data Science es de " + totalComputadoresDataScience);
    }
}

