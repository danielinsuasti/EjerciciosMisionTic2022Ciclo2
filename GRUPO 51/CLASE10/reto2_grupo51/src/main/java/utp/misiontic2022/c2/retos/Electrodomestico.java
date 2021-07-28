package utp.misiontic2022.c2.retos;

public class Electrodomestico {
    // Constantes y Atributos  
    protected final static Integer PESO_BASE =10;
    protected final static char CONSUMO_W_BASE ='F';
    protected final static Double PRECIO_BASE =50.0;

    protected Integer peso;
    protected char consumoW;
    protected Double precioBase;
    

    //Constructores
    public Electrodomestico(){
        this(PRECIO_BASE, PESO_BASE, CONSUMO_W_BASE);
        //this.precioBase = PRECIO_BASE;
        
    }
   
    public Electrodomestico(Double precioBase, Integer peso){
        this(precioBase, peso, CONSUMO_W_BASE);
    }
   
    public Electrodomestico(Double precioBase, Integer peso, char consumoW){
        this.peso = peso;
        this.precioBase = precioBase;
        comprobarconsumoW(consumoW);
    }
   
    
    // Metodos
    public void comprobarconsumoW(char consumoW){          
        if(consumoW>=65 && consumoW <=70 ){//Corresponde a codigo ascii
            this.consumoW=consumoW;
        }else{
            this.consumoW=CONSUMO_W_BASE;
        }          
    }


    public Double calcularPrecio(){
        Double adicion = 0.0;
        switch(consumoW){
            case 'A':
                adicion += 200.0;
                break;
            case 'B':
                adicion += 150.0;
                break;
            case 'C':
                adicion += 125.0;
                break;
            case 'D':
                adicion += 100.0;
                break;
            case 'E':
                adicion += 75.0;
                break;
            case 'F':
                adicion += 50.0;
                break;

        }

        if(peso >=0 && peso <15){
            adicion += 20.0;
        }else if(peso >=15 && peso <30){
            adicion += 40.0;
        }else if(peso >=30 && peso <50){
            adicion += 70.0;
        }else if(peso >=50){
            adicion += 100.0;
        }        
        return precioBase+adicion;
    }
}
