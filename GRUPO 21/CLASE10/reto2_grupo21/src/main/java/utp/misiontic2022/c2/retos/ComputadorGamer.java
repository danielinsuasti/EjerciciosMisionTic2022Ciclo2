package utp.misiontic2022.c2.retos;

public class ComputadorGamer extends Computador{

    // Constantes y Atributos
    private final static Integer FPS_BASE=20;

    private Integer fps;

    //Constructores
    public ComputadorGamer(){
        this(PRECIO_BASE, PESO_BASE, CONSUMOW, FPS_BASE);
    }
  
    public ComputadorGamer(Double precioBase, Integer peso){
        this(precioBase, peso, CONSUMOW, FPS_BASE);
    }
  
    public ComputadorGamer(Double precioBase, Integer peso, char consumoW, Integer fps){
        super(precioBase, peso, consumoW);
        this.fps =fps;
    }

  
    // Métodos
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if (fps>30){
            adicion += 200.0;
        }

        return adicion;
    }    
}
