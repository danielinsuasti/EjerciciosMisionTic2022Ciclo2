package co.edu.utp.misiontic2022.c2;

public class Tablero implements Dibujable {

    private Casilla[] casillas;

    public Tablero(){
        casillas = new Casilla[64]; //Asigna a todos null
        for(int i = 0; i < 64; i++){
            casillas[i] = new Casilla(i/8, i % 8);
        }

    }



    public Boolean hacerEnroque(){
        return true;
    }

    public Boolean hacerJaque(){
        return true;
    }

    public Boolean hacerJaqueMate(){
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
