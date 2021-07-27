package utp.misiontic2022.c2.retos;

public class Computador {
    // Constantes y Atributos  
    protected final static Integer PESO_BASE=10;
    protected final static char CONSUMOW ='A';
    protected final static Double PRECIO_BASE=200.0;

    protected Integer peso;
    protected char consumoW;
    protected double precioBase;
    

    //Constructores
    public Computador(){
        this(PRECIO_BASE, PESO_BASE, CONSUMOW);
        //this.peso = PESO_BASE;
        //this.precioBase = PRECIO_BASE;
        //this.consumoW = CONSUMOW;
    }
   
    public Computador(Double precioBase, Integer peso){
        this(precioBase, peso, CONSUMOW);
    }
   
    public Computador(Double precioBase, Integer peso, char consumoW){
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarconsumoW(consumoW);
    }
   
    
    // Metodos
    public void comprobarconsumoW(char consumoW){          
        if(consumoW >= 65 && consumoW <70){// se basa en el codigo ascii
            this.consumoW=consumoW;
        }else{
            this.consumoW=CONSUMOW;
        }          
    }

    public Double calcularPrecio(){
        
        Double adicion = 0.0;

        switch(consumoW){
            case 'A':
                adicion+=50;
                break;
            case 'B':
                adicion += 75;
                break;
            case 'C':
                adicion += 100;
                break;
            case 'D':
                adicion += 125;
                break;
            case 'E':
                adicion += 150;
                break;
            case 'F':
                adicion += 200;
                break;
        }

        if( peso >=0 && peso < 15){
            adicion += 100.0;
        }else if(peso >=15 && peso < 30){
            adicion += 200.0;
        }else if(peso >=30 && peso < 50){
            adicion += 300;
        }else if(peso >=50){
            adicion +=400;
        }

        
        return precioBase+adicion;
    }
}
