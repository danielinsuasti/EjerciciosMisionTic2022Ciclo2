package co.edu.utp.misiontic2022.c2;

public class Casilla implements Dibujable{

    private Color color;
    private Integer fila;
    private Integer columna;

    public Casilla(Integer fila, Integer columna){
        this.fila = fila;
        this.columna = columna;

        this.color = (fila + columna) % 2 == 0 ? Color.BLANCO : Color.NEGRO;

        //this.color = calcularColor();
    }

    /*
    private Color calcularColor(){
        if(fila%2 ==0){
            if(columna % 2 ==0){
                return Color.BLANCO;
            }else{
                return Color.NEGRO;
            }
        }else{
            if(columna %2 ==0){
                return Color.NEGRO;
            }else{
                return Color.BLANCO;
            }
        }
    }
    */

    public Boolean ocupada(){
        return true;
    }

    @Override
    public void pintar() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void posicionar(Integer x, Integer y) {
        // TODO Auto-generated method stub
        
    }
    
}
