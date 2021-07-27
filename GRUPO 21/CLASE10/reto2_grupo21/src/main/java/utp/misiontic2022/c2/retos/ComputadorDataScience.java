package utp.misiontic2022.c2.retos;

public class ComputadorDataScience extends Computador{
    // Constantes y Atributos
    private final static Integer TERAFLOPS_BASE=10;

    private Integer teraflops;
    private Boolean tarjetaNidiaTesla;

    //Constructores

    public ComputadorDataScience(){
        this(PRECIO_BASE, PESO_BASE, CONSUMOW, TERAFLOPS_BASE, false);
    }
  
    public ComputadorDataScience(Double precioBase, Integer peso){
        this(precioBase, peso, CONSUMOW, TERAFLOPS_BASE, false);
    }
  
    public ComputadorDataScience(Double precioBase, Integer peso, char consumoW, Integer teraflops, boolean tarjetaNidiaTesla){
        super(precioBase, peso, consumoW);
        this.teraflops = teraflops;
        this.tarjetaNidiaTesla = tarjetaNidiaTesla;

    }
  
    // Métodos
    public Double calcularPrecio(){
        Double adicion = super.calcularPrecio();
        if(teraflops > 15){
            adicion+= precioBase *0.4;
        }

        if(tarjetaNidiaTesla){
            adicion+=800;
        }
        return adicion;
    }

}
